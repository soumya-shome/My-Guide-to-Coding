l=[]
l3=[]
n=int(input())
for i in range(0,n):
    q=int(input())
    l.append(q)
l2=l
l2.reverse()
for j in range(0,n):
    l2[j]=l2[j]+l[j]
print(l2)
