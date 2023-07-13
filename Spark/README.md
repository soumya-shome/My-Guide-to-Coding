# Spark

Apache Spark is an open-source distributed general-purpose cluster-computing framework. Spark provides an interface for programming entire clusters with implicit data parallelism and fault tolerance.

Features of Python
- Easy-to-learn
- Easy-to-read
- Easy-to-maintain
- A broad standard library
- Interactive Mode
- Portable
- Extendable
- Databases
- GUI Programming
- Scalable

Features of Spark
- Speed
- Ease of Use
- A Unified Engine
- Multiple Languages
- Advanced Analytics

## Spark Installation
- sudo apt install python3-pip
- pip3 install jupyter ( to check / open jupyter => jupyter notebook, to close => CTRL+C)
  - if not added to path, installed path name will be displayed,
  - export PATH=/home/user/.local/bin:$PATH
- sudo apt-get update
- sudo apt-get install default-jre
- check java version
- sudo apt-get install scala
- check scala version (scala -version)
- pip3 install py4j
- download spark from spark website
- unzip => sudo tar -zxvf <sparkfilename>.tgz
- export SPARK_HOME='home/spark-3.3.2-bin-hadoop3'
- export PATH=$SPARK_HOME:$PATH
- export PYTHONPATH=$SPARK_PATH/python:$PYTHONPATH
- export PYSPARK_DRIVER_PYTHON="jupyter"
- export PYSPARK_DRIVER_PYTHON_OPTS="notebook"
- export PYSPARK_PYTHON=python3

- go to folder where spark folder is unzipped, in my case it's DataEng
- cd DataEng
- sudo chmod 777 spark-3.3.2-bin-hadoop3
- cd spark-3.3.2-bin-hadoop3
- sudo chmod 777 python
- cd python
- sudo chmod 777 pyspark

- now to use spark, always open this folder and open jupyter

### To use spark from any directory
- pip3 install findspark
- cd DataEng/spark-3.3.2-bin-adoop3
- pwd
- copy this address shown (in my case => /home/soumyadeep/DataEng/spark-3.3.2-bin-hadoop3 )
- open python
- python3
- import findspark
- findspark.init('/home/soumyadeep/DataEng/spark-3.3.2-bin-hadoop3')
- Thats it...

Basics of PySpark 
- SparkSession
- SparkContext
- SparkConf
- SparkFiles
- SparkJobInfo
- SparkStageInfo
- SparkListener
- SparkListenerJobStart
- SparkListenerStageCompleted
- SparkListenerTaskStart

Staring a Spark Session
- SparkSession is the entry point to Spark SQL

```python
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName('Basics').getOrCreate()
```

Reading a CSV file

```python
df = spark.read.csv('appl_stock.csv', inferSchema=True, header=True)
```

Displaying the data

```python
df.show()
df.show(5) # first 5 rows
df.show(5, truncate=False) # first 5 rows without truncating
sf.show(5,0) # first 5 rows without truncating
df.head() # first row
df.head(5) # first 5 rows


```

Displaying the schema
- Schema is the structure of the data

```python
df.printSchema()
```

|Function|Description|
|--------|-----------|
|columns|Returns all column names as a list|
|count()|Returns the number of rows in the DataFrame|
|describe()|Computes statistics for numeric columns|
|describe('column_name')|Computes statistics for a specific column|
|distinct().count()|Returns the number of distinct rows in the DataFrame|
|dtypes|Returns all column names and their data types as a list of tuples|
|groupBy('column_name')|Groups the DataFrame using the specified column|
|head(n)|Returns first n rows of the DataFrame|
|filter(df['column_name'] == 'value')|Returns a new DataFrame with rows filtered by the condition|
|filter((df['column_name'] == 'value') & (df['column_name'] == 'value'))|Returns a new DataFrame with rows filtered by the conditions|
|select('column_name')|Returns a new DataFrame with the selected column|
|select(['column_name1', 'column_name2'])|Returns a new DataFrame with the selected columns|
|withColumn('new_column_name', df['column_name'])|Returns a new DataFrame with a new column|
|withColumnRenamed('old_column_name', 'new_column_name')|Returns a new DataFrame with a renamed column|
|max()|Returns the maximum value for each numeric column|
|min()|Returns the minimum value for each numeric column|
|mean()|Returns the mean value for each numeric column|
|sum()|Returns the sum of all values for each numeric column|
|select('column_name').distinct().count()|Returns the number of distinct values for the specified column|
|orderBy('column_name')|Returns a new DataFrame sorted by the specified column in ascending order|
|orderBy(df['column_name'].desc())|Returns a new DataFrame sorted by the specified column in descending order|
|na.drop()|Returns a new DataFrame with rows containing null values dropped|
|na.drop(how='all')|Returns a new DataFrame with rows containing all null values dropped|
|na.drop(subset=['column_name'])|Returns a new DataFrame with rows containing null values in the specified column dropped|
|na.fill(0)|Returns a new DataFrame with null values replaced by 0|

