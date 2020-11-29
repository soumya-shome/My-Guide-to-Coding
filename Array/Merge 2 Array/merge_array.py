n1=int(input("Enter number of elements for 1st array : "))
n2=int(input("Enter number of elements for 2nd array : "))
a=[]
print("Enter {} numbers for 1st array : ".format(n1),end="")
for i in range(n1):
    a.append(int(input()))
b=[]
print("Enter {} number for 2nd array : ".format(n2),end="")
for i in range(n2):
    b.append(int(input()))
c=[]
c=a+b
print(*c,sep=", ")
