def magic(n,s):
    if n==0:
        return s
    else:
        t=n%10
        s=s+t
        return magic(n//10,s)

n=int(input("Enter a number"))
a=n
while(a>9):
    a=magic(a,0)
if(a==1):
    print("Magic No.")
else:
    print("Not Magic No.")
