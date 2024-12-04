# Data Engineering 

## Data Extraction
- SQL
- Scrapping
- File Formats
    - CSV
    - JSON
    - XML
- Consulting APIs
- Buying Data
- Distributed Databases

## Data Cleaning
- Missing Values and empty data
- Data imputations
- Incorrect types
- Incorrect or invalid values
- Outliers and non-relevant data
- Statistical sanitization

## Data Wrangling
- Heirarchical data
- Handling categorical data
- Reshaping and transforming structures
- Indexing data for quick access
- Merging, combining and joining data

## Analysis / Data Analysis
- Exploration
- Building Statistical Models
- Visualization and representation
- Correlation vs causation analysis
- Hypothesis testing
- Statistical analysis
- Reporting

## Action
- Building Machine Learning Models
- Feature Engineering
- Moving ML into production
- Building ETL Pipelines
- Live Dashboard and Reporting
- Decision making and real-life tests


## Big Data

### Hadoop
- [Hadoop](https://hadoop.apache.org/) is an open-source software framework for storing data and running applications on clusters of commodity hardware. It provides massive storage for any kind of data, enormous processing power and the ability to handle virtually limitless concurrent tasks or jobs.

### Spark
- [Spark](https://spark.apache.org/) is an open-source distributed general-purpose cluster-computing framework. Spark provides an interface for programming entire clusters with implicit data parallelism and fault tolerance.

## Python
- Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation.

## DBMS (Database Management System) (SQL or NoSQL)
- A database management system (DBMS) is a software package designed to define, manipulate, retrieve and manage data in a database. A DBMS generally manipulates the data itself, the data format, field names, record structure and file structure. It also defines rules to validate and manipulate this data.

### SQL (Structured Query Language)
- [SQL](https://www.w3schools.com/sql/) is a standard language for storing, manipulating and retrieving data in databases. Our SQL tutorial will teach you how to use SQL in: MySQL, SQL Server, MS Access, Oracle, Sybase, Informix, Postgres, and other database systems.

### NoSQL (Not only SQL)
- [NoSQL](https://www.mongodb.com/nosql-explained) databases are databases that store data in a format other than relational tables. These databases are schema-free, support easy replication, have simple API, eventually consistent, and can handle huge amounts of data.

## Data Warehousing
- [Data Warehousing](https://www.talend.com/resources/what-is-data-warehousing/) is the process of compiling information into a data warehouse. A data warehouse is a database used to store data. The data warehouse is a central repository of information that can be analyzed to make better-informed decisions.

## Features of Big Data
- [Features of Big Data](https://www.guru99.com/characteristics-of-big-data.html) are Volume, Velocity, Variety, Veracity, and Value.

## 3Vs of Big Data
### Volume
- Volume refers to the amount of data generated from various sources such as business transactions, social media, sensors, devices, and mobile phones. The amount of data is very important in determining the value of data. Volume is measured in terms of terabytes, petabytes, and exabytes.

### Velocity
- Velocity refers to the speed at which the data is generated and processed to meet the demands and challenges that lie in the path of growth and development. Big Data Velocity deals with the speed at which data flows in from sources like business processes, application logs, networks, and social media sites, sensors, Mobile devices, etc. The flow of data is massive and continuous.

### Variety
- Variety refers to the many types of data that are available. Variety refers to structured, unstructured, and semistructured data that is gathered from multiple sources. In the past, data was structured and fit neatly in relational databases. In today's world, data is semi-structured or unstructured. Variety also refers to the different sources from which data is generated. These sources can be a business application or social media sites or sensors or devices or weblogs, etc.

### Veracity
- Veracity refers to the biases, noise, and abnormality in data. Veracity refers to the quality of data being captured. Veracity of data in a big data environment is a critical problem. Veracity refers to the abnormalities and inconsistencies in the data. The quality of data plays a vital role in analyzing the data and deriving meaningful insights from it.

### Value
- Value refers to the process of converting data into a useful format. Value refers to the value addition done at each stage of the big data processing. The value of big data is hidden in the insights that it provides after processing structured and unstructured data. The value of big data is in the analysis of the data, not in the data itself.

## Challenges of Big Data
- Storage
- Computational Efficiency
- Data Loss
- Cost

Differentiate between Transactional and Analytical workloads
 Identify the different "Vs" in Big Data
Recognize how to process large amount of data
Gain knowledge on how Big Data, Analytics and Hadoop are related

|Feature|Pandas|PySpark|
| -------- | -------- | -------- |
|Data Source|Works with structured tabular data (e.g., CSV, JSON, SQL) and creates a DataFrame. | Also works with structured data but is designed for distributed processing on multiple machines.|
|Parallel Execution|Single-machine execution.|Parallel execution across all cores on multiple machines.|
|Performance|Slower for large datasets due to single-machine processing.|Faster for large datasets due to distributed processing.|
|Lazy Evaluation|Not lazy; operations are applied immediately.|Lazy evaluation; transformations are deferred until an action is performed.|
|Mutability|DataFrames are mutable (can be modified in place).|DataFrames are immutable (operations create new DataFrames).|
|Statistical Functions|Statistical functions apply to each column by default (e.g., mean(), max(), count()).|Similar statistical functions available (e.g., agg(), mean(), max()).|
|Syntax|Familiar Python syntax; easy to learn and use.|Similar API to Pandas; can work with PySpark exactly like Pandas.|



|Operation|Pandas Syntax|PySpark Syntax|
| ------------------ | ------------------ | ------------------ | 
|Creating DataFrames|df = pd.DataFrame({'column1': [1, 2, 3], 'column2': ['A', 'B', 'C']})|python from pyspark.sql import SparkSession spark = SparkSession.builder.appName("example").getOrCreate() df = spark.createDataFrame([(1, 'A'), (2, 'B'), (3, 'C')], ['column1', 'column2']) |
|Copying DataFrames|df_copy = df.copy()|df_copy = df # Note: PySpark DataFrames are immutable; any modification creates a new DataFrame.|
|Deleting Columns|df.drop(columns=['column1'], inplace=True)|df = df.drop('column1')|
|Adding Columns|df['new_column'] = [10, 20, 30]|python from pyspark.sql.functions import lit df = df.withColumn('new_column', lit(10)) |
|Merging DataFrames|merged_df = pd.merge(df1, df2, on='common_column', how='inner')|merged_df = df1.join(df2, on='common_column', how='inner')|
|Removing Duplicates|df.drop_duplicates(subset=['column1'], inplace=True)|df = df.dropDuplicates(subset=['column1'])|
|Queries (Filtering)|filtered_df = df[df['column1'] &gt; 2]|filtered_df = df.filter(df['column1'] &gt; 2)|
|Distinct Values|unique_values = df['column1'].unique()|python unique_values = df.select('column1').distinct().collect() |

Certainly! Let’s explore the usage of .loc in both Pandas and PySpark DataFrames:

Pandas:
The .loc[] method in Pandas is used to access a group of rows and columns by label. It primarily works with labels (such as row and column names) but can also be used with a conditional boolean Series derived from the DataFrame.
Allowed inputs for .loc[]:
Single label (e.g., 5 or 'a'): Interpreted as a label of the index.
Slicing with labels (e.g., df.loc['row1':'row3', 'column1':'column3']).
Conditional boolean Series (e.g., df.loc[df['column_A'] > 0.0, 'column_B']).
PySpark:
PySpark does not have an exact equivalent to Pandas’ .loc[]. However, you can achieve similar functionality using other methods:
Filtering Rows:
Use .filter() or .where() to filter rows based on conditions.
Example:
Python

filtered_df = df.filter(df['column_A'] > 0.0)
AI-generated code. Review and use carefully. More info on FAQ.
Selecting Columns:
Use .select() to choose specific columns.
Example:
Python

selected_df = df.select('column_B', 'column_C')
AI-generated code. Review and use carefully. More info on FAQ.
Combining Both:
To achieve the equivalent of the Pandas operation you mentioned:
Python

index_condition = df['column_A'] > 0.0
amount = (df.filter(index_condition)
            .select('column_B', 'column_C')
            .agg({'column_B': 'sum', 'column_C': 'sum'})
            .collect()[0])
result = amount['sum(column_B)'] / amount['sum(column_C)']
AI-generated code. Review and use carefully. More info on FAQ.
Remember that while Pandas provides more direct label-based access with .loc[], PySpark’s approach is more focused on distributed processing and lazy evaluation. Choose the one that best fits your data manipulation needs! 🐼🔥🚀