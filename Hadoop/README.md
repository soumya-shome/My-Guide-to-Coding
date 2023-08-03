# Hadoop
- Support Huge Volume
- Storage Efficiency
- Good Data Recovery Solution
- Horizontal Scalability
- Cost Effective
- Easy to Use

| Hadoop | RDMS |
| --- | --- |



## Hadoop Ecosystem

![Hadoop Ecosystem](
)
## Hadoop Architecture

![Hadoop Architecture](
)

Navigate in a Hadoop Cluster like file or directory browsing, creating a folder in HDFS and uploading a  file in HDFS

Run a simple "wordcount" example and where to see the output

Check HDFS storage health
    - We can check the health (such as status, number of blocks, number of under replicated  blocks, replication factor, corrupt blocks and so on) on our Hadoop cluster usinf CLI
    - We can access out cluster details using Web Browser
    - We can get the complete history of all the jobs executed on the cluster (user user basis) using Web Browser
Access the web interface and know more about the cluster

Differentiate between Transactional and Analytical workloads
 Identify the different "Vs" in Big Data
Recognize how to process large amount of data
Gain knowledge on how Big Data, Analytics and Hadoop are related

## HDFS
    - Why another filesystem?
    - Significance of Blocks
    - Read/Write
    - Data locality, replica placement , etc
    - HDFC Commands

## MapReduce
    - MapReduce Phases
    - Shuffle process
    - MapReduce Components
    - Dissect a MR program
    - Custom formats / writables

## PIG (Apache Pig)
    - Pig Latin
    - Joins
    - Custom functions
    - XML Parsing

## Hive (Apache Hive)
    - HiveQL
    - Table types
    - Partitions / Buckets
    - Joins
    - Complex types

## YARN

## Architecture
    - HDFS Architecture
    - MRv1 vs MRv2 Architecture
    - SPOF
    - SNN - Standby - Checkpoint Nodes
    - Highly available Hadoop

## Cluster Setup
    - Distributions
    - Cloud Services
    - Amazon Web Services
    - 3-node cluster on cloud

## File Formats
    - Compression
    - Sequence Files
    - Small files problem and solutions
    - AVRO
    - Highly available Hadoop
    - File formats with MR, Pig, Hive

## Troubleshooting and Optimization
    - Mapreduce settings
    - Optimize low running jobs
    - Explore logs
    - Optimize Pig / Hive
    - Join optimization.

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