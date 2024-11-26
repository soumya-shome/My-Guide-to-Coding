def prime(n):
    r=0
    for i in range(1,n+1):
        if n%i==0:
            r=r+1
    if r==2:
        return 1
    else:
        return 0
    
n=int(input("Enter a number:"))
if n%2==0:
    m=n//2
    for i in range(1,m):
        if prime(i)==1:
            for j in range(i+1,m+1):
                if prime(j)==1:
                    #print (i,"*",j)
                    if i*j==m:
                        print (i," * ",j);
                        
