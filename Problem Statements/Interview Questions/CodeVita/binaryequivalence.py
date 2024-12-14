import itertools 
from itertools import combinations, chain 

def d2b(n):  
    return bin(n).replace("0b", "")

def findsubsets(s, n): 
    return list(map(set, itertools.combinations(s, n))) 

def cou(s):
    z,o=0,0
    for i in s:
        if i=='0':
            z=z+1
        if i=='1':
            o=o+1
    if z==o:
        return o
    else:
        return False

n=int(input())
m=[]
m=input().split(' ')
m = [int(i) for i in m]
m2=[]
for i in range(n):
    m2.append(d2b(m[i]))
ma_x=0
for i in range(n):
    if ma_x<len(m2[i]):
        ma_x=len(m2[i])
for i in range(n):
    p=len(m2[i])
    if p<ma_x:
        m2[i]="0"*(ma_x-p) + m2[i]
w=0
for i in range(n):
    q=cou(m2[i])
    if q:
        w=q
if(w!=0):
    st="0"*q+"1"*q
else:
    st="0"*ma_x
print(st,end="")