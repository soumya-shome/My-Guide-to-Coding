def isPrime(n):
    f=0
    for i in range(2,n-1):
        if n%i==0:
            f=1
            break
    if f==1:
        return False
    else:
        return True

a=[]
print("Enter 10 numbers : ",end="")
for i in range(10):
    a.append(int(input()))
for i in range(10):
    if isPrime(a[i]):
        print("{}, ".format(a[i]),end=" ")