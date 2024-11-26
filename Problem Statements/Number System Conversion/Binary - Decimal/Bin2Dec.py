def convert(n):
    dec,i=0,0
    while n!=0:
        rem=n%10
        n//=10
        dec+=rem* pow(2,i)
        i+=1
    return dec

n=int(input("Enter a binary number : "))
print("{} in binary = {} in decimal".format(n,convert(n)))