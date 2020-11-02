def pallin(n,a):
    if n>0:
        t=n%10
        a=a*10+t
        return pallin(n//10,a)
    else:
        return a

n=int(input("Enter a number"))
print("Pallindrom of ",n," is ",pallin(n,0))
