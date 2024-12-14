def prime(n):
    p=0
    for i in range(1,(n+1)):
        if n%i==0:
            p+=1
    if p==2:
        return 1
    else:
        return 0
      
n=int(input())
if 1<=n and n<=10000:
    count=1
    while(n>1):
        l2=[]
        l=list(range(1,n+1))
        for i in l:
            t=prime(i)
            if t==0:
                l2.append(i)
        count+=1
        n=len(l2)
    print(count,end='')