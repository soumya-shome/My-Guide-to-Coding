import random
import operator

dict_age={}
dict_age["arun"]=20
dict_age["bhima"]=10
dict_age["chirag"]=40
dict_age["deepal"]=30
l=list(dict_age.values())
print("Give all money to",max(dict_age.items(),key=operator.itemgetter(l))[0])

print(l)
