l=[]
print("Enter 10 numbers : ",end="")
for i in range(10):
    l.append(int(input()))
l.sort()
print("Maximum in array : {}".format(l[9]))
print("Minimum in array : {}".format(l[0]))