def prime(n):
    p=0
    for i in range(1,(n+1)):
        if n%i==0:
            p+=1
    if p==2:
        return 1
    else:
        return 0

#n=int(input("Enter a number"))
for i in range(1,11):
    t=prime(i)
    print(t)
    if t==1:
        print(i," is Prime")