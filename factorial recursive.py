def fact(n):
    if n==0:
        return 1
    else:
        return n*fact(n-1)

print ( "Factorial of 3 is",fact(3)) 
