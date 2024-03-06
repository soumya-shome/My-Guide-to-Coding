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

##### Objectives
1. Execute code in multiple languages
1. Create documentation cells
1. Access DBFS (Databricks File System)
1. Create database and table
1. Query table and plot results
1. Add notebook parameters with widgets


##### Databricks Notebook Utilities
- <a href="https://docs.databricks.com/notebooks/notebooks-use.html#language-magic" target="_blank">Magic commands</a>: **`%python`**, **`%scala`**, **`%sql`**, **`%r`**, **`%sh`**, **`%md`**
- <a href="https://docs.databricks.com/dev-tools/databricks-utils.html" target="_blank">DBUtils</a>: **`dbutils.fs`** (**`%fs`**), **`dbutils.notebooks`** (**`%run`**), **`dbutils.widgets`**
- <a href="https://docs.databricks.com/notebooks/visualizations/index.html" target="_blank">Visualization</a>: **`display`**, **`displayHTML`**

| Element         | Markdown Syntax |
|-----------------|-----------------|
| Heading         | `#H1` `##H2` `###H3` `#### H4` `##### H5` `###### H6` |
| Block quote     | `> blockquote` |
| Bold            | `**bold**` |
| Italic          | `*italicized*` |
| Strikethrough   | `~~strikethrough~~` |
| Horizontal Rule | `---` |
| Code            | ``` `code` ``` |
| Link            | `[text](https://www.example.com)` |
| Image           | `![alt text](image.jpg)`|
| Ordered List    | `1. First items` <br> `2. Second Item` <br> `3. Third Item` |
| Unordered List  | `- First items` <br> `- Second Item` <br> `- Third Item` |
| Code Block      | ```` ``` ```` <br> `code block` <br> ```` ``` ````|
| Table           |<code> &#124; col &#124; col &#124; col &#124; </code> <br> <code> &#124;---&#124;---&#124;---&#124; </code> <br> <code> &#124; val &#124; val &#124; val &#124; </code> <br> <code> &#124; val &#124; val &#124; val &#124; </code> <br>|

##### Objectives
1. Run a SQL query
1. Create a DataFrame from a table
1. Write the same query using DataFrame transformations
1. Trigger computation with DataFrame actions
1. Convert between DataFrames and SQL

##### Methods
- <a href="https://spark.apache.org/docs/latest/api/python/reference/pyspark.sql/spark_session.html" target="_blank">SparkSession</a>: **`sql`**, **`table`**
- <a href="https://spark.apache.org/docs/latest/api/python/reference/pyspark.sql/dataframe.html" target="_blank">DataFrame</a>:
  - Transformations:  **`select`**, **`where`**, **`orderBy`**
  - Actions: **`show`**, **`count`**, **`take`**
  - Other methods: **`printSchema`**, **`schema`**, **`createOrReplaceTempView`**

**`SparkSession`** Methods
| Method | Description |
| --- | --- |
| sql | Returns a DataFrame representing the result of the given query |
| table | Returns the specified table as a DataFrame |
| read | Returns a DataFrameReader that can be used to read data in as a DataFrame |
| range | Create a DataFrame with a column containing elements in a range from start to end (exclusive) with step value and number of partitions |
| createDataFrame | Creates a DataFrame from a list of tuples, primarily used for testing |

A **DataFrame** is a distributed collection of data grouped into named columns.

## Transformations
When we created **`budget_df`**, we used a series of DataFrame transformation methods e.g. **`select`**, **`where`**, **`orderBy`**.

<strong><code>products_df  
&nbsp;  .select("name", "price")  
&nbsp;  .where("price < 200")  
&nbsp;  .orderBy("price")  
</code></strong>
    
Transformations operate on and return DataFrames, allowing us to chain transformation methods together to construct new DataFrames.
However, these operations can't execute on their own, as transformation methods are **lazily evaluated**.

Running the following cell does not trigger any computation.

## Actions
Conversely, DataFrame actions are methods that **trigger computation**.
Actions are needed to trigger the execution of any DataFrame transformations.

The **`show`** action causes the following cell to execute transformations.










| Command | Description | Example |
| --- | --- | --- |
| `display` | Visualizes DataFrame | `display(df)` |
| `displayHTML` | Displays HTML content | `displayHTML("<h1>Hello, World!</h1>")` |
| `SparkSession.sql` | Executes SQL queries using SparkSession | `spark.sql("SELECT * FROM table")` |
| `SparkSession.table` | Returns the specified table as a DataFrame | `spark.table("table")` |


| Function/Command | Description | Example |
| --- | --- | --- |
| **Magic Commands** | | |
| `%python` | Executes Python code | `%python print("Hello, World!")` |
| `%scala` | Executes Scala code | `%scala println("Hello, World!")` |
| `%sql` | Executes SQL queries | `%sql SELECT * FROM table` |
| `%r` | Executes R code | `%r print("Hello, World!")` |
| `%sh` | Executes shell commands | `%sh echo "Hello, World!"` |
| `%md` | Writes markdown | `%md # Hello, World!` |
| **DBUtils** | | |
| `dbutils.fs (%fs)` | Filesystem utilities | `%fs ls /FileStore` |
| `dbutils.notebooks (%run)` | Notebook utilities | `%run /path/to/notebook` |
| `dbutils.widgets` | Widget utilities | `dbutils.widgets.dropdown("Option", "1", [str(x) for x in range(1, 10)])` |
| **Visualization** | | |
| `display` | Displays the DataFrame in a tabular format | `display(df)` |
| `displayHTML` | Displays HTML in the output cell | `displayHTML("<h1>Hello, World!</h1>")` |
| **SparkSession** | | |
| `sql` | Executes SQL query and returns DataFrame | `spark.sql("SELECT * FROM table")` |
| `table` | Returns DataFrame of table | `spark.table("table")` |
| **DataFrameReader** | | |
| `csv` | Reads CSV file as DataFrame | `spark.read.csv("/path/to/file.csv")` |
| `json` | Reads JSON file as DataFrame | `spark.read.json("/path/to/file.json")` |
| `option` | Sets option for reader | `spark.read.option("header", "true").csv("/path/to/file.csv")` |
| `schema` | Sets schema for reader | `spark.read.schema(schema).csv("/path/to/file.csv")` |
| **DataFrameWriter** | | |
| `mode` | Sets write mode | `df.write.mode("overwrite").parquet("/path/to/file.parquet")` |
| `option` | Sets option for writer | `df.write.option("header", "true").csv("/path/to/file.csv")` |
| `parquet` | Writes DataFrame as Parquet file | `df.write.parquet("/path/to/file.parquet")` |
| `format` | Sets format for writer | `df.write.format("json").save("/path/to/file.json")` |
| `saveAsTable` | Saves DataFrame as table | `df.write.saveAsTable("table")` |
| **StructType** | | |
| `toDDL` | Returns DDL-formatted string | `df.schema.toDDL()` |
| **Spark Types** | | |
| `ArrayType` | Array data type | `ArrayType(StringType())` |
| `DoubleType` | Double data type | `DoubleType()` |
| `IntegerType` | Integer data type | `IntegerType()` |
| `LongType` | Long data type | `LongType()` |
| `StringType` | String data type | `StringType()` |
| `StructType` | Struct data type | `StructType([StructField("column", StringType(), True)])` |
| `StructField` | Struct field type | `StructField("column", StringType(), True)` |
| **DataFrame** | | |
| `select` | Selects columns from DataFrame | `df.select("column1", "column2")` |
| `selectExpr` | Selects columns with SQL expressions | `df.selectExpr("column1 as new_column1", "column2")` |
| `drop` | Drops column from DataFrame | `df.drop("column")` |
| `withColumn` | Adds new column or replaces existing column | `df.withColumn("new_column", df["column"] * 2)` |
| `withColumnRenamed` | Renames existing column | `df.withColumnRenamed("old_name", "new_name")` |
| `filter` | Filters rows using given condition | `df.filter(df["column"] > 0)` |
| `distinct` | Returns distinct rows | `df.distinct()` |
| `limit` | Returns first `n` rows | `df.limit(10)` |
| `sort` | Returns sorted DataFrame | `df.sort(df["column"].desc())` |
| **Transformations** | | |
| `select` | Selects columns from DataFrame | `df.select("column1", "column2")` |
| `where` | Filters rows using given condition | `df.where(df["column"] > 0)` |
| `orderBy` | Returns sorted DataFrame | `df.orderBy(df["column"].desc())` |
| **Actions** | | |
| `show` | Shows first `n` rows | `df.show(5)` |
| `count` | Returns number of rows | `df.count()` |
| `take` | Returns first `n` rows as list | `df.take(5)` |
| **Other Methods** | | |
| `printSchema` | Prints schema of DataFrame | `df.printSchema()` |
| `schema` | Returns schema of DataFrame | `df.schema` |
| `createOrReplaceTempView` | Creates or replaces temporary view | `df.createOrReplaceTempView("view")` |
| **Column** | | |
| `alias` | Returns column with alias | `df["column"].alias("new_name")` |
| `isin` | Returns true for values in list | `df[df["column"].isin([1, 2, 3])]` |
| `cast` | Casts column to different type | `df["column"].cast("int")` |
| `isNotNull` | Returns true for non-null values | `df[df["column"].isNotNull()]` |
| `desc` | Returns column for descending order sort | `df.sort(df["column"].desc())` |
| `operators` | Applies operators on column | `df[df["column1"] + df["column2"]]` |
| **Grouped Data** | | |
| `agg` | Aggregates on grouped data | `df.groupBy("column").agg({"column": "sum"})` |
| `avg` | Returns average on grouped data | `df.groupBy("column").avg()` |
| `count` | Returns count on grouped data | `df.groupBy("column").count()` |
| `max` | Returns max on grouped data | `df.groupBy("column").max()` |
| `sum` | Returns sum on grouped data | `df.groupBy("column").sum()` |
| **Built-In Functions** | | |
| `approx_count_distinct` | Returns approximate count of distinct items | `df.select(approx_count_distinct(df["column"]))` |
| `avg` | Returns average | `df.select(avg(df["column"]))` |
| `sum` | Returns sum | `df.select(sum(df["column"]))` |
| **Date-Time Functions** | | |
| `date_format` | Converts date to specified format | `df.select(date_format(df["column"], "MM/dd/yyyy"))` |
| `to_date` | Converts string to date | `df.select(to_date(df["column"], "MM/dd/yyyy"))` |
| `date_add` | Adds days to date | `df.select(date_add(df["column"], 3))` |
| `year` | Extracts year from date | `df.select(year(df["column"]))` |
| `month` | Extracts month from date | `df.select(month(df["column"]))` |
| `dayofweek` | Extracts day of week from date | `df.select(dayofweek(df["column"]))` |
| `minute` | Extracts minute from timestamp | `df.select(minute(df["column"]))` |
| `second` | Extracts second from timestamp | `df.select(second(df["column"]))` |



| Command | Description | Example |
| --- | --- | --- |
| **Magic Commands** | | |
| `%python` | Executes Python code | `%python print("Hello, World!")` |
| `%scala` | Executes Scala code | `%scala println("Hello, World!")` |
| `%sql` | Executes SQL queries | `%sql SELECT * FROM table` |
| `%r` | Executes R code | `%r print("Hello, World!")` |
| `%sh` | Executes shell commands | `%sh echo "Hello, World!"` |
| `%md` | Renders markdown text | `%md # Hello, World!` |
| `%md` | Writes markdown text | `%md # This is a heading` |
| **DBUtils** | | |
| `dbutils.fs (%fs)` | Filesystem utilities | `%fs ls /FileStore` |
| `dbutils.notebooks (%run)` | Runs another notebook | `%run /path/to/notebook` |
| `dbutils.widgets` | Creates interactive widgets | `dbutils.widgets.dropdown("Option", "1", [str(x) for x in range(1, 10)])` |
| `dbutils.fs (%fs)` | Performs file system operations | `%fs ls /FileStore` |
| `dbutils.notebooks (%run)` | Runs another notebook | `%run /path/to/notebook` |
| `dbutils.widgets` | Creates interactive widgets | `dbutils.widgets.dropdown("Option", "1", [str(x) for x in range(1, 10)])` |
| **Visualization** | | |
| `display` | Displays the DataFrame in a tabular format | `display(df)` |
| `displayHTML` | Displays HTML code | `displayHTML("<h1>Hello, World!</h1>")` |
| **SparkSession** | | |
| `sql` | Executes SQL queries | `spark.sql("SELECT * FROM table")` |
| `table` | Returns a DataFrame representing the specified table | `spark.table("table")` |
| **DataFrame** | | |
| `DataFrame.where` | Filters rows using the given condition | `df.where(df.column > 0)` |
| `DataFrame.orderBy` | Returns a new DataFrame sorted by the specified column(s) | `df.orderBy(df.column.desc())` |
| `DataFrame.show` | Prints the DataFrame in a tabular format | `df.show()` |
| `DataFrame.count` | Returns the number of rows in the DataFrame | `df.count()` |
| `count` | Returns the number of rows | `df.count()` |
| `DataFrame.select` | Returns a new DataFrame with the selected columns | `df.select("column")` |
| `select` | Returns a new DataFrame with selected columns | `df.select("column")` |
| `select` | Returns a new DataFrame with selected columns | `df.select("column")` |
| `selectExpr` | Returns a new DataFrame by running select expression | `df.selectExpr("column as new_column")` |
| `select` | Returns a new DataFrame with the selected columns | `df.select("column1", "column2")` |
| `selectExpr` | Selects columns and evaluates the expressions | `df.selectExpr("column1 as new_column1", "column2")` |
| `drop` | Returns a new DataFrame that drops the specified column | `df.drop("column")` |
| `withColumn` | Returns a new DataFrame by adding a column or replacing the existing column | `df.withColumn("new_column", df["column"] * 2)` |
| `withColumnRenamed` | Returns a new DataFrame by renaming an existing column | `df.withColumnRenamed("old_name", "new_name")` |
| `filter` | Filters rows using the given condition | `df.filter(df["column"] > 0)` |
| `distinct` | Returns a new DataFrame containing the distinct rows | `df.distinct()` |
| `limit` | Limits the number of rows | `df.limit(10)` |
| `sort` | Returns a new DataFrame sorted by the specified column(s) | `df.sort(df["column"].desc())` |
| `where` | Filters rows using the given condition | `df.where(df.column > 0)` |
| `orderBy` | Returns a new DataFrame sorted by the specified column(s) | `df.orderBy(df.column.desc())` |
| `show` | Prints the first n rows to the console | `df.show()` |
| `take` | Returns the first n rows | `df.take(5)` |
| `printSchema` | Prints the schema to the console in a tree format | `df.printSchema()` |
| `schema` | Returns the schema of this DataFrame | `df.schema` |
| `createOrReplaceTempView` | Creates a local temporary view with a given name | `df.createOrReplaceTempView("view")` |
| **Transformations** | | |
| `select` | Returns a new DataFrame with the selected columns | `df.select("column1", "column2")` |
| `where` | Filters rows using the given condition | `df.where(df["column"] > 0)` |
| `orderBy` | Returns a new DataFrame sorted by the specified column(s) | `df.orderBy(df["column"].desc())` |
| **Actions** | | |
| `show` | Prints the first n rows to the console | `df.show(5)` |
| `count` | Returns the number of rows | `df.count()` |
| `take` | Returns the first n rows | `df.take(5)` |
| **Other Methods** | | |
| `printSchema` | Prints the schema to the console in a tree format | `df.printSchema()` |
| `schema` | Returns the schema of this DataFrame | `df.schema` |
| `createOrReplaceTempView` | Creates a local temporary view with a given name | `df.createOrReplaceTempView("view")` |
| **Column** | | |
| `alias` | Returns a new Column based on the given column with an alias | `df["column"].alias("new_name")` |
| `isin` | A boolean expression that is evaluated to true if the value of this expression is contained by the evaluated values of the arguments | `df.filter(df["column"].isin("value1", "value2"))` |
| `cast` | Convert the column into the given data type | `df.select(df["column"].cast("int"))` |
| `isNotNull` | True if the current expression is not null | `df.filter(df["column"].isNotNull())` |
| `desc` | Column ordering in descending order | `df.sort(df["column"].desc())` |
| `operators` | Apply mathematical operators | `df.select(df["column"] + 1)` |
| **DataFrameReader** | | |
| `csv` | Loads a CSV file and returns the result as a DataFrame | `spark.read.csv("/path/to/file.csv")` |
| `json` | Loads a JSON file and returns the result as a DataFrame | `spark.read.json("/path/to/file.json")` |
| `option` | Adds an input option for the underlying data source | `spark.read.option("header", "true").csv("/path/to/file.csv")` |
| `schema` | Specifies the input schema | `spark.read.schema(schema).csv("/path/to/file.csv")` |
| **DataFrameReader** | | |
| `csv` | Loads a CSV file and returns the result as a DataFrame | `spark.read.csv("path/to/file.csv")` |
| `json` | Loads a JSON file and returns the result as a DataFrame | `spark.read.json("path/to/file.json")` |
| `option` | Adds an input option for the underlying data source | `spark.read.option("header", "true").csv("path/to/file.csv")` |
| `schema` | Specifies the input schema | `spark.read.schema(schema).csv("path/to/file.csv")` |
| **DataFrameWriter** | | |
| `mode` | Specifies the behavior when data or table already exists | `df.write.mode("overwrite").parquet("path/to/file.parquet")` |
| `option` | Adds an output option for the underlying data source | `df.write.option("header", "true").csv("path/to/file.csv")` |
| `parquet` | Saves the content of the DataFrame in Parquet format at the specified path | `df.write.parquet("path/to/file.parquet")` |
| `format` | Specifies the output data source format | `df.write.format("parquet").save("path/to/file.parquet")` |
| `saveAsTable` | Saves the content of the DataFrame as the specified table | `df.write.saveAsTable("table")` |
| **DataFrameWriter** | | |
| `mode` | Specifies the behavior when data or table already exists | `df.write.mode("overwrite").parquet("/path/to/file.parquet")` |
| `option` | Adds an output option for the underlying data source | `df.write.option("header", "true").csv("/path/to/file.csv")` |
| `parquet` | Saves the content of the DataFrame in Parquet format | `df.write.parquet("/path/to/file.parquet")` |
| `format` | Specifies the output data source format | `df.write.format("parquet").save("/path/to/file.parquet")` |
| `saveAsTable` | Saves the content of the DataFrame as the specified table | `df.write.saveAsTable("table")` |
| **StructType** | | |
| `toDDL` | Returns a string containing a schema in DDL format | `schema.toDDL()` |
| **Spark Types** | | |
| `ArrayType` | Represents a list of a specific type | `ArrayType(StringType())` |
| `DoubleType` | Represents a double precision floating-point number | `DoubleType()` |
| `IntegerType` | Represents a 4-byte integer | `IntegerType()` |
| `LongType` | Represents an 8-byte integer | `LongType()` |
| `StringType` | Represents a string | `StringType()` |
| `StructType` | Represents a list of StructFields | `StructType([StructField("field", StringType(), True)])` |
| `StructField` | Represents a field in a StructType | `StructField("field", StringType(), True)` |
| **Spark Types** | | |
| `ArrayType` | Represents a collection of elements with the same type | `ArrayType(StringType())` |
| `DoubleType` | Represents a double precision floating-point number | `DoubleType()` |
| `IntegerType` | Represents a 4-byte integer | `IntegerType()` |
| `LongType` | Represents an 8-byte integer | `LongType()` |
| `StringType` | Represents a string | `StringType()` |
| `StructType` | Represents a list of `StructField` | `StructType([StructField("field", StringType(), True)])` |
| `StructField` | Represents a field in a `StructType` | `StructField("field", StringType(), True)` |

### Column Operators and Methods
| Method | Description |
| --- | --- |
| \*, + , <, >= | Math and comparison operators |
| ==, != | Equality and inequality tests (Scala operators are **`===`** and **`=!=`**) |
| alias | Gives the column an alias |
| cast, astype | Casts the column to a different data type |
| isNull, isNotNull, isNan | Is null, is not null, is NaN |
| asc, desc | Returns a sort expression based on ascending/descending order of the column |


#### **`SparkSession`** Methods
| Method | Description |
| --- | --- |
| sql | Returns a DataFrame representing the result of the given query |
| table | Returns the specified table as a DataFrame |
| read | Returns a DataFrameReader that can be used to read data in as a DataFrame |
| range | Create a DataFrame with a column containing elements in a range from start to end (exclusive) with step value and number of partitions |
| createDataFrame | Creates a DataFrame from a list of tuples, primarily used for testing |

## DataFrame Transformation Methods
| Method | Description |
| --- | --- |
| **`select`** | Returns a new DataFrame by computing given expression for each element |
| **`drop`** | Returns a new DataFrame with a column dropped |
| **`withColumnRenamed`** | Returns a new DataFrame with a column renamed |
| **`withColumn`** | Returns a new DataFrame by adding a column or replacing the existing column that has the same name |
| **`filter`**, **`where`** | Filters rows using the given condition |
| **`sort`**, **`orderBy`** | Returns a new DataFrame sorted by the given expressions |
| **`dropDuplicates`**, **`distinct`** | Returns a new DataFrame with duplicate rows removed |
| **`limit`** | Returns a new DataFrame by taking the first n rows |
| **`groupBy`** | Groups the DataFrame using the specified columns, so we can run aggregation on them |

### Grouped data methods
| Method | Description |
| --- | --- |
| agg | Compute aggregates by specifying a series of aggregate columns |
| avg | Compute the mean value for each numeric columns for each group |
| count | Count the number of rows for each group |
| max | Compute the max value for each numeric columns for each group |
| mean | Compute the average value for each numeric columns for each group |
| min | Compute the min value for each numeric column for each group |
| pivot | Pivots a column of the current DataFrame and performs the specified aggregation |
| sum | Compute the sum for each numeric columns for each group |

### Aggregate Functions

| Method | Description |
| --- | --- |
| approx_count_distinct | Returns the approximate number of distinct items in a group |
| avg | Returns the average of the values in a group |
| collect_list | Returns a list of objects with duplicates |
| corr | Returns the Pearson Correlation Coefficient for two columns |
| max | Compute the max value for each numeric columns for each group |
| mean | Compute the average value for each numeric columns for each group |
| stddev_samp | Returns the sample standard deviation of the expression in a group |
| sumDistinct | Returns the sum of distinct values in the expression |
| var_pop | Returns the population variance of the values in a group |

### Math Functions

| Method | Description |
| --- | --- |
| ceil | Computes the ceiling of the given column. |
| cos | Computes the cosine of the given value. |
| log | Computes the natural logarithm of the given value. |
| round | Returns the value of the column e rounded to 0 decimal places with HALF_UP round mode. |
| sqrt | Computes the square root of the specified float value. |

## Logistic Regression

Logistic regression is a statistical model that in its basic form uses a logistic function to model a binary dependent variable, although many more complex extensions exist. In regression analysis, logistic regression (or logit regression) is estimating the parameters of a logistic model (a form of binary regression).
Logistic regression is used to describe data and to explain the relationship between one dependent binary variable and one or more nominal, ordinal, interval or ratio-level independent variables.

Sigmoind Function : The sigmoid function, also called the sigmoidal curve (von Seggern 2007, p. 334) or logistic function, is the function

![Alt text](Images/image-3.png)

Confusion Matrix : A confusion matrix is a table that is often used to describe the performance of a classification model on a set of test data for which the true values are known.

![Alt text](Images/image-4.png)
![Alt text](Images/image-5.png)

NO = Negaitve = False = 0
YES = Positive = True = 1

True Positive (TP) : Observation is positive, and is predicted to be positive.
False Negative (FN) : Observation is positive, but is predicted negative.
True Negative (TN) : Observation is negative, and is predicted to be negative.
False Positive (FP) : Observation is negative, but is predicted positive.

Accuracy : Accuracy is the most intuitive performance measure and it is simply a ratio of correctly predicted observation to the total observations.

(TP+TN)/total = Correct Accuracy
(FP+FN)/total = Error Rate

ROC Curve : A receiver operating characteristic curve, or ROC curve, is a graphical plot that illustrates the diagnostic ability of a binary classifier system as its discrimination threshold is varied.

## Tree Methods

Decision Tree : A decision tree is a flowchart-like structure in which each internal node represents a "test" on an attribute (e.g. whether a coin flip comes up heads or tails), each branch represents the outcome of the test, and each leaf node represents a class label (decision taken after computing all attributes).

Random Forest : Random forests or random decision forests are an ensemble learning method for classification, regression and other tasks that operate by constructing a multitude of decision trees at training time and outputting the class that is the mode of the classes or mean prediction of the individual trees.

Gradient Boosted Trees : Gradient boosting is a machine learning technique for regression and classification problems, which produces a prediction model in the form of an ensemble of weak prediction models, typically decision trees.
  - A loss function to be optimized.
  - A weak learner to make predictions.
  - An additive model to add weak learners to minimize the loss function.

![Alt text](Images/image-6.png)

## Clustering

K Means Clustering : K-means clustering is a method of vector quantization, originally from signal processing, that aims to partition n observations into k clusters in which each observation belongs to the cluster with the nearest mean (cluster centers or cluster centroid), serving as a prototype of the cluster.

## Collaborative Filtering

Collaborative filtering (CF) is a technique used by recommender systems. Collaborative filtering has two senses, a narrow one and a more general one. In the newer, narrower sense, collaborative filtering is a method of making automatic predictions (filtering) about the interests of a user by collecting preferences or taste information from many users (collaborating). The underlying assumption of the collaborative filtering approach is that if a person A has the same opinion as a person B on an issue, A is more likely to have B's opinion on a different issue than that of a randomly chosen person. In the older, broader sense, collaborative filtering is the process of filtering for information or patterns using techniques involving collaboration among multiple agents, viewpoints, data sources, etc.

## Natural Language Processing

Natural language processing (NLP) is a subfield of linguistics, computer science, and artificial intelligence concerned with the interactions between computers and human language, in particular how to program computers to process and analyze large amounts of natural language data.

## Spark Streaming

Spark Streaming is an extension of the core Spark API that enables scalable, high-throughput, fault-tolerant stream processing of live data streams. Data can be ingested from many sources like Kafka, Flume, Kinesis, or TCP sockets, and can be processed using complex algorithms expressed with high-level functions like map, reduce, join and window.

