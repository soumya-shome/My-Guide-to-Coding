def maxmin(l):
    m,n=l[0],l[0]
    lng=len(l)
    for i in range(1,lng):
        if m<l[i]:
            m=l[i]
        if n>l[i]:
            n=l[i]
    print("max= ",m)
    print("min= ",n)

lis=[]
n=int(input("Enter the size"))
for i in range(0,n):
    m2=int(input("Enter a number"))
    lis.append(m2)
maxmin(lis)
