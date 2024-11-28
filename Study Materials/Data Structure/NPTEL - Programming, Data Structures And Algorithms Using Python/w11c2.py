def t1(n):
    a=0
    while(n!=0):
        t=n%10
        if t%2!=0:
            a=a+1
            break
        n=n//10
    if a!=0:
        return 0
    else:
        return 1

li=[]
l=[]
li= list(map(int, input ().split (",")))
for i in range(li[0],li[1]+1):
    if(t1(i)!=0):
        l.append(str(i))
s=","
print(s.join(l),end=" ")
