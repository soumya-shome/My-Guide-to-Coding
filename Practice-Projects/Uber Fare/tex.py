from pyspark.sql import SparkSession
from geopy.distance import geodesic
import pyspark.sql.functions as F
from pyspark.sql.types import FloatType

@F.udf(returnType=FloatType())
def geodesic_udf(a, b):
    return geodesic(a, b).m


spark = SparkSession.builder.appName('Uber').getOrCreate()
DF = spark.createDataFrame([[114.038696,  22.5315,  114.047302, 22.531799], [ 114.027901, 22.5228, 114.026299, 22.5238], [ 114.026299, 22.5238,114.024597,22.5271], [114.024597,  22.5271,114.024696,22.527201]], list('ABCD'))
DF.show()

DF = DF.withColumn('Lengths/m', geodesic_udf(F.array("B", "A"), F.array("D", "C")))
DF.show()