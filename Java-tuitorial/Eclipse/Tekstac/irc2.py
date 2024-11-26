rows=int(input())
cols=int(input())
mtrx=[list(map(int,input().split()))[:cols] for i in range(rows)]
print(mtrx)
c=0
for i in range(rows):
    if mtrx[i][-1]==-1:
        c+=1
print(c)