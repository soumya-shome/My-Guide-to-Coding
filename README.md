# Data-Engineering

## Install Ubuntu in Virtual Box

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
