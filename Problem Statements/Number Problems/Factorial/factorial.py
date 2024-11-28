def fac(p):
    if (p == 0):
        return 1
    else:
        return (p*fac(p-1))

n=int(input("Enter a number"))
m=fac(n)
print (m)
