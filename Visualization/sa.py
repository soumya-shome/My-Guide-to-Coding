import matplotlib.pyplot as plt
import math
from matplotlib.ticker import MultipleLocator, FormatStrFormatter


# Function to read data from a TXT file
def read_txt(file_path):
    with open(file_path, "r") as goal_data:
        home_team_line = goal_data.readline().strip("\n").split(" ")
        home_team_goals = [int(x) for x in home_team_line if x]

        away_team_line = goal_data.readline().strip("\n").split(" ")
        away_team_goals = [int(x) for x in away_team_line if x]

    return home_team_goals, away_team_goals

# Function to create a scatter plot
def scatter_plot(x, y, color="blue", size=50):
    plt.scatter(x, y, s=size, c=color)
    plt.show()

# Function to create a line plot
def line_plot(x, y, color="red", marker="o", linestyle="-"):
    plt.plot(x, y, color=color, marker=marker, linestyle=linestyle)
    plt.show()

# Function to read data from a CSV file
def read_csv(file_path):
    with open(file_path, "r") as csv_data:
        first_line = csv_data.readline().strip("\n").split(",")[1:]
        data = {name: [] for name in first_line}

        for line in csv_data:
            processed_line = line.strip("\n").split(",")[1:]
            for index, name in enumerate(first_line):
                data_point = int(processed_line[index])
                data[name].append(data_point)

    return data

# Function to customize axes
def customize_axes(ax, title, xlabel, ylabel, xlim=None, ylim=None):
    ax.set_title(title, loc="center", fontdict={"fontsize": 20, "color": "blue"})
    ax.set_xlabel(xlabel, labelpad=2)
    ax.set_ylabel(ylabel)

    if xlim:
        ax.set_xlim(xlim)
    if ylim:
        ax.set_ylim(ylim)

# Function to create a line plot with customized axes
def line_plot_custom_axes(x, y, ax, title, xlabel, ylabel, color="red", marker="o", linestyle="--", xlim=None, ylim=None):
    ax.plot(x, y, color=color, marker=marker, linestyle=linestyle)
    customize_axes(ax, title, xlabel, ylabel, xlim, ylim)
    plt.show()

# Example usage
file_path_goals = "Data\\Goals.txt"
file_path_csv = "Data\Sheet1E1.csv"

# Reading data from TXT file
home_goals, away_goals = read_txt(file_path_goals)

# Scatter plot
scatter_plot(home_goals, away_goals, color="#3D234F", size=50)

# Line plot
x_values = list(range(1, len(home_goals) + 1))
line_plot(x_values, home_goals, color="red", marker="o", linestyle="--")

# Reading data from CSV file
data_csv = read_csv(file_path_csv)

print(data_csv.keys())

# Customized line plot with axes
fig, ax = plt.subplots(figsize=(10, 10))
line_plot_custom_axes(data_csv["Games"], data_csv["Hits"], ax, "HPAB for each Year for player 1", "Year", "HPAB", color="green", marker="o", linestyle="--")

# Saving the figure
plt.savefig("Images/hpab_plot.png", orientation="portrait", dpi=300)
plt.show()
