a=int(input("Enter 1st Side : "))
b=int(input("Enter 2nd Side : "))
c=int(input("Enter 3rd Side : "))
s=a+b+c/2
at=(s*(s-a)*(s-b)*(s-c))**0.5
print("Area : ",at)
