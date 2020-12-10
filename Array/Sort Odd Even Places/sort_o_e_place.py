def funcswap(a,s):
    for i in range(0,s,2):
        t=i+1
        if t<s:
            y=a[i]
            a[i]=a[t]
            a[t]=y
    return a

n=int(input("Enter number of elements for 2nd array : "))
a=[]
print("Enter {} numbers for 1st array : ".format(n),end="")
for i in range(n):
    a.append(int(input()))
a=funcswap(a,n)
print("The Swapped array : ")
for i in range(n):
    print("{},".format(a[i]),end="")