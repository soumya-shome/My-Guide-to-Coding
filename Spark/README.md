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

## Linear Regression 

Francis Galton was an English mathematician, statistician, and biologist who was a pioneer in the study of human intelligence and eugenics. He was knighted in 1909.

Least Square Method : The least squares method is a statistical procedure to find the best fit for a set of data points by minimizing the sum of the offsets or residuals of points from the plotted curve.

Mean Absolute Error : The mean absolute error (MAE) is a quantity used to measure how close forecasts or predictions are to the eventual outcomes.

![Alt text](Images/image.png)

Mean Squared Error : The mean squared error (MSE) or mean squared deviation (MSD) of an estimator measures the average of the squares of the errors—that is, the average squared difference between the estimated values and the actual value.

![Alt text](Images/image-1.png)

Root Mean Square Error : The root-mean-square deviation (RMSD) or root-mean-square error (RMSE) is a frequently used measure of the differences between values (sample or population values) predicted by a model or an estimator and the values observed.

![Alt text](Images/image-2.png)

R Squared Values : R-squared is a statistical measure of how close the data are to the fitted regression line. It is also known as the coefficient of determination, or the coefficient of multiple determination for multiple regression.

|Function|Description|
|--------|-----------|
|LinearRegression()|Creates a LinearRegression estimator object|
|fit()|Fits a linear model to the input data using the specified parameters|
|coefficients|Returns the coefficients of the fitted linear model|
|intercept|Returns the y-intercept of the fitted linear model|
|summary|Returns a LinearRegressionSummary object that contains additional information about the fitted linear model|
|r2|Returns the coefficient of determination of the fitted linear model|
|rootMeanSquaredError|Returns the root mean squared error of the fitted linear model|
|randomSplit([x,y])|Splits the DataFrame into two DataFrames using the specified weights|
|evaluate()|Evaluates the performance of the fitted linear model on the input data using the specified metric|
|residuals|Returns the residuals of the fitted linear model|
|transform()|Transforms the input DataFrame using the fitted linear model|

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