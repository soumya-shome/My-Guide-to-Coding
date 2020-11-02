l=[]
n=int(input("Enter the number of terms : "))
for i in range(n):
    a=int(input("Enter a number : "))
    l.append(a)
p=int(input("Enter the number till multiplies"))
for i in range(n):
    print (l[i])
    for j in range(1,p+1):
        print(l[i]," x ",j," = ",(l[i]*j))
        
