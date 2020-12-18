def binAddition( a, b):
    while (b != 0): 
        c = (a & b) << 1
        a=a^b
        b=c
    return a

def binSubtracton(a, b):
    b = binAddition(~b, 1)
    while (b != 0):
        carry = (a & b) << 1
        a = a ^ b
        b = carry
    return a

n1=int(input("Input first integer value: "))
n2=int(input("Input second integer value: "))
binSub=binSubtracton(n1,n2)
print("Binary Subtraction: {}".format(binSub))