a=int(input("Enter 1st Number : "))
b=int(input("Enter 2nd Number : "))
c=int(input("Enter 3rd Number : "))
if a!=b and b!=c and a!=c:
    if a>b and a>c :
        print(a," is the Greatest Number ")
    elif b>a and b>c :
        print(b," is the Greatest Number ")
    else:
        print(c," is the Greatest Number ")
else:
    print("Try with 3 different Numbers")