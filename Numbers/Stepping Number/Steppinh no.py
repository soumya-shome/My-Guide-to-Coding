def check(n):
    #print("n:",n)
    a,c,p=0,0,0
    while(n!=0):
        t=int(n%10)
        if(t>a):
            p=t-a
        elif(a>t):
            p=a-t
        if p!=1:
            c=c+1
        a=t
        n=n//10
    #print("c:",c)
    if(c>0):
        return 0
    else:
        return 1

n=int(input("Enter a lower limit"))
m=int(input("Enter a upper limit"))
for i in range(n,m+1):
    if(i<10 and i>0):
        print(i)
    else:
        if(check(i)==1):
            print(i)
