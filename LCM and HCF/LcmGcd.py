n1=int(input("Enter 1st number : "))
n2=int(input("Enter 2nd number : "))
num,den=n2,n1
rem=num%den
while rem!=0:
    num,den=den,rem
    rem=num%den
gcd=den
lcm=n1*n2//gcd
print("GCD of ",n1," and ",n2," : ",gcd)
print("LCM of ",n1," and ",n2," : ",lcm)