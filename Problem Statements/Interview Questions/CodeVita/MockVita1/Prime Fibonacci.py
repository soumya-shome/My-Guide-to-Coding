def prime(n):
    c=0
    for i in range(1,n+1):
        if n%i == 0:
            c=c+1
    if c==2:
        return True
    else:
        return False

def unique(l): 
    l2 = [] 
    for x in l: 
        if x not in l2: 
            l2.append(x) 
    return l2 

def nod(n):
    d=0
    while (n!=0):
        d=d+1
        n=n//10
    return d

def fibo(a,b,n):
    if n==1:
        return a
    elif n==2:
        return b
    else:
        c=a+b
        n2=3
        while(n2!=n):
            a,b=b,c
            c=a+b
            n2=n2+1
        return c

n1, n2 = map(int, input().split()) 
if 2<=n1 and n2<=100 and (n2-n1)>=35:
    l=[]
    for j in range(n1,(n2+1)):
        if(prime(j)==True):
            l.append(j)
    l1=[]
    #print (l)#first prime numbers
    n=len(l)
    for i in range(n):
        for j in range(n):
            if(i!=j):
                d=nod(l[j])
                a=l[i]*(10**d)+l[j]
                l1.append(a)
    #print (l1)#combination of 1st prime numbers
    l2=[]
    n=len(l1)
    for i in range(n):
        m=l1[i]
        if(prime(m)==True):
            l2.append(m)
    #l2.sort()
    #print (l2)
    l3=unique(l2)
    #print(l3)
    #print("Length",len(l3))
    print(fibo(l3[0],l3[-1],len(l3)))
else:
    print("",end="")