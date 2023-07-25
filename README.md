# Data Engineering 

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

## Hadoop Platform

### HDFS (Hadoop Distributed File System)
- [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_design.html) is a distributed file system that handles large data sets running on commodity hardware. It is used to scale a single Apache Hadoop cluster to hundreds (and even thousands) of nodes. HDFS is one of the major components of Apache Hadoop, the others being MapReduce and YARN.

### MapReduce
- [MapReduce](https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html) is a programming model and an associated implementation for processing and generating big data sets with a parallel, distributed algorithm on a cluster. A MapReduce program is composed of a map procedure, which performs filtering and sorting (such as sorting students by first name into queues, one queue for each name), and a reduce method, which performs a summary operation (such as counting the number of students in each queue, yielding name frequencies).

### YARN (Yet Another Resource Negotiator)
- [YARN](https://hadoop.apache.org/docs/r1.2.1/yarn.html) is a resource management platform responsible for managing computing resources in clusters and using them for scheduling of users' applications. The fundamental idea of YARN is to split up the functionalities of resource management and job scheduling/monitoring into separate daemons. The idea is to have a global ResourceManager (RM) and per-application ApplicationMaster (AM). An application is either a single job or a DAG of jobs.

### HBase
- [HBase](https://hbase.apache.org/) is an open-source, distributed, versioned, non-relational database modeled after Google's Bigtable: A Distributed Storage System for Structured Data by Chang et al. Just as Bigtable leverages the distributed data storage provided by the Google File System, HBase provides Bigtable-like capabilities on top of Apache Hadoop.

### Hive
- [Hive](https://hive.apache.org/) is a data warehouse infrastructure tool to process structured data in Hadoop. It resides on top of Hadoop to summarize Big Data, and makes querying and analyzing easy. Hive provides a mechanism to project structure onto this data and query the data using a SQL-like language called HiveQL.



