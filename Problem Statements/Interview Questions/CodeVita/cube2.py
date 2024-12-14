def rotate(arr,n):
    for i in range (n//2):
        for j in range(i,n-i-1):
            temp=arr[i][j]
            arr[i][j]=arr[n-1-j][i]
            arr[n-1-j][i]=arr[n-1-i][n-1-j] 
            arr[n-1-i][n-1-j]=arr[j][n-1-i] 
            arr[j][n-1-i]=temp
    print (arr)

def antirotate(arr,n):
    for i in range(n//2):
        for j in range(i,n-i-1):
            temp=arr[i][j]
            arr[i][j]=arr[j][n-i-1]
            arr[j][n-i-1]=arr[n-i-1][n-j-1]
            arr[n-i-1][n-j-1]=arr[n-j-1][i]
            arr[n-j-1][i]=temp
    #print(arr)

def printm(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            print(matrix[i][j],end=" ")
        print()

n = int(input())
matrix=[]
for i in range(n):
    a=input().split(' ')
    matrix.append(a)
m1 = matrix
#print(m1)
for i in range(len(m1)):
    l=[]
    for j in range(len(m1[i])):
        l.append(m1[j][i])
    #print (l) #ok
    l.sort(reverse=True)
    #print(l)
    for j in range(len(m1[i])):
        m1[j][i]=l[j]

for i in range(len(m1)):
    m1[i].sort()
#print (m1)

c,r=0,0
for i in range(n):
    if m1[n-1][i] == 'c' or m1[n-1][i] == 'C':
        r=r+1
for i in range(n-1,0,-1):
    if m1[i][0] == 'c' or m1[i][0] == 'C':
        c=c+1

if(c<r):
    print (c)
elif(r>c):
    print (r)
else:
    print c
