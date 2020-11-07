n=int(input("Enter a number"))
rows,cols=(n,2)
l = [[0]*cols]*rows
a=0
for i in range(1,n):
    for j in range(i,n-1):
        if i+j==n:
            l[[a][0]]=i
            l[[a][1]]=j
            print (l[a])
            a=a+1

print (l)
