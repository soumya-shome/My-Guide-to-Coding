# Datawarehouse Basics
 
- Datawarehouse not same as a database
- Built on top of a database ( Usage => Datawarehouse ) (Platform => Database )
- Data comes from elsewhere (Datawarehouse => Data) external sources or operational databases
- Possible dozens of sources
- Data is copied , not moved

Bill Inmon : Father of Datawarehouse 


Integrated , subject oriented , time variant , non volatile collection of data in support of management's decisions


## Primary reasons to build a Datawarehouse

- Making data-driven decisions
- One stop shop for all data
- Make data-driven decisions (Past , Present , Future, Unknown)
- Business Intelligence + Datawarehouse = Data Driven Decisions

## Datawarehouse vs DataLake

- Datawarehouse : Structured , Processed , Organized , Cleaned , Ready for analysis
- DataLake : Raw , Unprocessed , Unorganized , Unstructured , Not cleaned , Not ready for analysis
- Data Warehouse : built on top of a database RDMS, MDDB
- Data Lake : built on top of a distributed file system HDFS, S3 Big Data

## Data Visualization vs Datawarehouse

- Data Visualization : Tableau , Power BI , Qlik , Looker , Mode , Periscope => Read only, No data manipulation, No data transformation , In place data access
- Datawarehouse : Data manipulation , Data transformation , Data cleaning , Data aggregation , Data enrichment , Data analysis , Data visualization

## Big Data 3Vs

- Volume : Size of data
- Velocity : Speed of data
- Variety : Different types of data

## ETL

- Extract : Get data from source
- Transform : Clean , Organize , Aggregate , Enrich
- Load : Put data into target

## Datawarehouse Architecture

- Datawarehouse : Built on top of a database
- Data source =ETL=> Datawarehouse =ETL=> Data Marts
- Example :  Suppliers => Wholesaler => Retailers

### Build a Centralized Datawarehouse

- Centralized Datawarehouse : One datawarehouse for the entire company
- Single Database
- One stop shopping

- Dependent Data Marts : Data Marts that depend on the datawarehouse
- Independent Data Marts : Data Marts that do not depend on the datawarehouse

### Dependent vs Independent Data Marts

| Dependent Data Marts | Independent Data Marts |
| -------------------- | ---------------------- |
| Sourced from Datawarehouse        | Sourced directly from applications and systems |
| (Mostly) uniform data across marts | Little or no uniformity across marts |
| Architecturally straightforward | Architecturally complex |

## Datawarehouse vs Data Mart

| Datawarehouse | Data Mart |
| ------------- | --------- |
| Many Sources   | One or more sources |
| ETL from sources | ETL from sources  |
| probably large data volume | prossibly large data volumes |
| Dimensionally organized data | Dimensionally organized data |

## Datawarehousing architectural options

- Centralized Datawarehouse
    - Default option
    - One stop shopping
    - Modern Technology
    - High Cross Organization Cooperation
    - High Data Governance
    - Rippling effect

- Component-based Datawarehouse
    - Decompostion
    - Mix-and-match Technologies
    - Bolt together components
    - Overcome org. challenges
    - Often inconsistent data
    - Difficult to cross-integrate

## Cube
 Multidimensional data structure that allows fast analysis of data
 - Specialized "dimensionally-aware" database
 - Leading alternative for 1st generation datawarehouse
 - Best for small scale DW

 Fast query response time
 - Modest data volumes
 - Less flexible data structures than RDMS
 - More vendor variations than RDMS

## Datawarehouse vs ODS

ODS 
- Integrates data from multiple sources
- Emphasis on current operational data
- Often real-time source => ODS data feeds
- "What is happening now?"

- Less popular 
- "Faster" and more current DW
- Superseded by big data
- ODS components within with data lake
- "Traditional" ODS stull sometimes used formission crucial situations

## Data Warehouse Layers

- Data Sources
- Staging Layer
- User Access Layer

### Staging Layers

- Non-persistent staging layer
- Persistent staging layer

#### Non-persistent staging layer 

| Advantages | Disadvantages |
| ---------- | ------------- |
| Lesss storage space | Need to go back to source to rebuild user layer |
| Data already moved to user layer | Data QA also requires source systems |

#### Persistent staging layer

| Advantages | Disadvantages |
| ---------- | ------------- |
| Rebuild user layer without source systems | More storage space |
| Data QA : compare staging layer with user layer | Risk of "ungoverned" access |

## ETL and ELT

- ETL : Extract , Transform , Load
- ELT : Extract , Load , Transform

- Extract
    - Quickly pull data from source applications
    - Traditionally done in "batches"
    - Raw data.... errors and all
    - Land in data warehourse staging layer

- Transform
    - "Apples to apples" data
    - prepare for uniform data in user access layer
    - can be very complex

- Load
    - Final stop along the data pathway
    - Store uniform data in user access layer

### ELT

- "Blast" data into big data environment
- Raw form in Hadoop HDFS, AWS S3, etc.
- Use big data environment computing power to transform when needed
- "Schema on read" vs "Schema on write"

#### Types
 - Initial ETL
    - Normally one time only
    - Right before the data warehouse goes live
    - All **relevant** data necessary for BI and analytics
    - Redo if data warehouse "blows up"

 - Incremental ETL
    - Incrementally "refreshes" the data warehouse
    - New data
    - Modiefied data
    - Special handling for deleted data

    - Major incremental ETL patterns
        - Append
        - In-place update
        - Complete replacement
        - Rolling append
    
### Role for Data Transformation

 - Data transformation overarching Goals
    - Uniformity
    - Restructuring

- Common transformation tasks
    - Data value unification
    - Data type and size unification
    - De-duplication
    - Dropping columns (vertical slicing)
    - Value-based row filtering (horizontal slicing)
    - Correcting known errors

## Focus

| BI Category | Data Model |
| Basic Reporting | Dimensional |
| Online analytical processing (OLAP) | Dimensional |
| Predictive analytics | Data mining / Specialized |
| Exploratory analytics | Data mining / Specialized |

- Bring Dimensional context to our measurements
    - MEasurement : facts
    - Dimenesional context : dimensions

Facts
- Numeric and quatifiable
- Think "measurement"

Star Schema
3 dimentsions :  1 dimension table

Snowflake Schema
3 dimentsions :  3 dimension table

A Data warehouse fact can be 
- additive : Can be added under any circumstances
- semi-additive : Can be added under some circumstances
- non-additive : Cannot be added under any circumstances

