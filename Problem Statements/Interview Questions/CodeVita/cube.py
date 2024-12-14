n = int(input())
matrix=[]
for i in range(n):
    a=input().split(' ')
    matrix.append(a)
m1 = matrix
for i in range(len(m1)):
    l=[]
    for j in range(len(m1[i])):
        l.append(m1[j][i])
    l.sort(reverse=True)
    for j in range(len(m1[i])):
        m1[j][i]=l[j]

for i in range(len(m1)):
    m1[i].sort()

c,r=0,0
for i in range(n):
    if m1[n-1][i] == 'C':
        r=r+1
for i in range(n-1,0,-1):
    if m1[i][0] == 'C':
        c=c+1

if(c<r):
    print (c,end="")
elif(r>c):
    print (r,end="")
else:
    print (c,end="")
