l=[]
n=int(input("Enter the number of terms : "))
for i in range(n):
    a=int(input("Enter anumber : "))
    l.append(a)
l.sort()
print(l[1])

