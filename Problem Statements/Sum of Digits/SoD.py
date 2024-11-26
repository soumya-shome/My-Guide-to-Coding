n=int(input("Enter a Number : "))
s=0
while n!=0:
    t=n%10
    s=s+t
    n=n//10
print("Sum of Digits : ",s)