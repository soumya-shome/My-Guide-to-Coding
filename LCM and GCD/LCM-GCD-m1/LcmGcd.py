lcm,gcd=1,1
a=int(input("Enter the 1st number : "))
b=int(input("Enter the 2nd number : "))
for i in range(1,a*b):
    if a%i==0 and b%i==0:
        gcd=i
lcm=(a*b)//gcd
print("L.C.M. = {}".format(lcm))
print("G.C.D. = {}".format(gcd),end='')