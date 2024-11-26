n1=int(input("Input first integer value: "))
n2=int(input("Input second integer value: "))
while n2 != 0:
    c = (n1 & n2) << 1
    n1=n1^n2
    n2=c
binAdd=n1
print("Binary Addition: {}".format(binAdd))