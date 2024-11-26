n=int(input())
a=[int(i) for i in input().split()]
a2=a
a2.reverse()
for j in range(0,n):
    a[j]=a[j]+a2[j]
for j in range(0,n):
    print(a[j],end=" ")
