def check(n2):
    n1,a,b=n2,0,0
    while(n1!=0):
        t=int(n1%10)
        a=a+1
        if t!=4 and t!=5:
            b=b+1
        n1=n1//10
    if a%2==0 and b==0:
        return 1
    else:
        return 0

def pallin(n3):
    n2=n3
    s=0
    while(n2!=0):
        s=(s*10)+int(n2%10)
        n2=n2//10
    if s==n3:
        return 1
    else:
        return 0

n=int(input("Enter a number"))
c,n5=0,1
while(c < n):
    if(check(n5)==1 and pallin(n5)==1):
        print(n5)
        c=c+1
    n5=n5+1
