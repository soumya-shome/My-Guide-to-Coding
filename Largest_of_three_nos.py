a=int(input("Enter the 1st number: "))
b=int(input("Enter the 2nd number: "))
c=int(input("Enter the 3rd number: "))
if(a>b and a>c):
    print("The largest number among the three is :",a)
elif(b>a and b>c):
    print("The largest number among the three is :",b)
else:
    print("The largest number among the three is :",c)