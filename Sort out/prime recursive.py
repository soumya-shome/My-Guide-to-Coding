def prime(n,a,i):
    if i==1:
        return a
    else:
        if n%i==0:
            a=a+1
        return prime(n,a,i-1)

#n=int(input("Enter a number"))
for i in range(2,(40+1)):
    t=prime(i,0,i)
    if t==1:
        print(i," is Prime")
