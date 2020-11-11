def fibo(n,a,b):
    if n==0:
        return 0
    else:
        c=a+b
        print (c,end=",")
        return fibo(n-1,b,c)

n=int(input("Enter the number of terms"))
if n==1:
    print ("0,")
elif n==2:
    print ("0,1,")
else:
    print("0,1",end=",")
    fibo(n-2,0,1)
