def convert(n):
    bin,i=0,1
    while n!=0:
        rem=n%2
        n//=2
        bin+=rem*i
        i*=10
    return bin

n=int(input("Enter a decimal number : "))
print("{} in decimal = {} in binary".format(n,convert(n)))