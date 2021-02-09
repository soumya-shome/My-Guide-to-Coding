def bubblesort(l):
    n=len(l)
    for i in range(0,n-1):
        for j in range(0,n-i-1):
            if l[j]>l[j+1]:
                l[j],l[j+1]=l[j+1],l[j]
    return l

li=[]
n1=int(input("Enter the size"))
for i in range(0,n1):
    m=int(input("Enter a number"))
    li.append(m)
print (bubblesort(li))