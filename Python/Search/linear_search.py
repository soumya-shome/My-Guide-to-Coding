l=[]
print("Enter 10 numbers :")
for i in range(10):
    n1=int(input())
    l.append(n1)
n=int(input("Enter the number to be searched : "))
p=-1
for i in range(len(l)):
    if n==l[i]:
        p=i+1
        break
if p!= -1:print(f"Found at {i+1} position")
else:print("Not Found")