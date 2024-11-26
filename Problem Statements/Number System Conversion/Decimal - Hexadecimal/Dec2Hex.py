def toHex(n):
    hex=""
    hexchar=['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
    while n>0:
        rem=n%16
        hex=hexchar[rem]+hex
        n=n/16
    return hex

n=int(input("Enter a decimal number : "))
printf("{} in decimal = {} in hexadecimal".format(n,toHex(n)))