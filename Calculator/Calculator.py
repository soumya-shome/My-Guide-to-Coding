x=int(input("Enter 1st number : "))
y=int(input("Enter 2nd number : "))
s=input("Enter operation [ + , - , * , / ] : ")
if s=="+":
    res=x+y
    print("Summation : ",res)
elif s=="-":
    res=x-y
    print("Differnece : ",res)
elif s=="*":
    res=x*y
    print("Product : ",res)
elif s=="/":
    res=x//y
    print("Division : ",res)
else:
    print("Wrong Input !!")