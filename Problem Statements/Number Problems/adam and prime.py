def adam(n):
    n1,b=0,0
    n2=n #OG number
    while (n!=0):
        n1=n1*10+int(n%10)
        n=n//10
    s1,s2=n2**2,n1**2 #OG number square
    s3=s2
    while(s3!=0):
        b=b*10 + int(s3%10)
        s3=s3//10
    if b==s1:
        return True
    else:
        return False

def prime(n):
    c=0
    for i in range(1,n+1):
        if n%i == 0:
            c=c+1
    if c==2:
        return True
    else:
        return False
        
n=int(input("Enter lower range: "))
m=int(input("Enter upper range: "))
for i in range(n,m+1):
    if prime(i)==True:
        if adam(i)==True:
           print(i)