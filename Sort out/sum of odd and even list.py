l=[]
sume,sumo=0,0
n=int(input("Enter the number of terms"))
for i in range(0,n):
    s=int(input("Enter a number"))
    l.append(s)
    
for i in range(0,n):
    if l[i]%2!=0:
        sumo=sumo+l[i]
    else:
        sume=sume+l[i]

print("Sum of odd number ",sumo)
print("Sum of even number ",sume)