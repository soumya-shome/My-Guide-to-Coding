import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

with open("Data/Goals.txt","r") as goalData:
    homeTeamLine = goalData.readline()
    homeTeamLine = homeTeamLine.strip(" \n")
    homeTeamLine = homeTeamLine.split(" ")

    HomeTeamGoals = [int(x) for x in homeTeamLine]
    
    awayTeamLine = goalData.readline()
    awayTeamLine = awayTeamLine.strip(" \n")
    awayTeamLine = awayTeamLine.split(" ")

    AwayTeamGoals = [int(x) for x in awayTeamLine]

x=[]
for i in range(1,len(HomeTeamGoals)+1):
    x.append(i)
    
fig2 = plt.figure("Second",figsize = (6,10))
ax1 = fig2.add_subplot(2,1,1,projection = "3d")
ax2 = fig2.add_subplot(2,1,2,projection = "3d")

ax1.plot(xs = x,ys = HomeTeamGoals,zs = AwayTeamGoals)

ax1.set_xlabel("Game Number")
ax1.set_ylabel("Home Team Goals")
ax1.set_zlabel("Away Team Goals")
ax1.set_title("3D line Plot")

ax2.scatter(xs = x,ys = HomeTeamGoals,zs = AwayTeamGoals,
            depthshade = True)


ax2.view_init(00,10) #ElevationAngle, RotationAngle

for angle in range(0,360):
    ax2.view_init(30,angle)
    plt.draw()
    plt.pause(0.01)

#plt.show()