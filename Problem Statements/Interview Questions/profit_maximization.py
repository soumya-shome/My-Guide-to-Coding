n=int(input())
l=list(map(int,input().split(" ")))
max=l[0]
i=0
for j in range(1,len(l)):
    if i<j and l[j]%l[i]==0:
        max+=l[j]
        i=j
print (max)