l=[]
n=int(input("Enter the number of terms"))
for i in range(0,n):
    s=int(input("Enter a number"))
    l.append(s)
    
for i in range(0,n):
    if l[i]%2!=0:
        print(l[i],end=",")