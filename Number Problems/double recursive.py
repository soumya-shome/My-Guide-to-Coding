def dig(n,s):
    if n==0:
        return 0
    else:
        t=fact(n%10)
        return s+dig(int(n//10),s)

def fact(n):
    if n==0:
        return 1
    else:
        return n*fact(n-1)


m=int(input("Enter a number"))
print (fact(m))
