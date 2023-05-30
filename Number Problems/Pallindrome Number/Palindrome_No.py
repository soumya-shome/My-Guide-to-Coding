n=int(input("Enter a number"))
n1=n
s=0
while (n1!=0):
    t=n1%10
    s=s*10+t
    n1//=10
print(s)
if s==n:
    print("Palindrome number")
else:
    print("Not Palindrome")
