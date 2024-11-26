a=[]
print("Enter 5 number for 1st array : ",end="")
for i in range(5):
    a.append(int(input()))
b=[]
print("Enter 5 number for 2nd array : ",end="")
for i in range(5):
    b.append(int(input()))
print("1st Array : ",*a,sep=" ")
print("1st Array : ",*b,sep=" ")
if a==b:
    print("Both the array are same.")
else:
    print("Both the array are different.")