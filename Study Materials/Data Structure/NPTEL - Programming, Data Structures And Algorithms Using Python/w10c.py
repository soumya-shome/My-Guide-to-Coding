"""
d=int(input())
d1=d
z,o=0,0
while(d1!=0):
    t=d1%10
    if(t==1):
        o=o+1
    elif(t==0):
        z=z+1
    d1=d1//10
if(z==1 or o==1):
    print("YES",end="")
else:
    print("NO",end="")

li=[]
li= list(map(int, input ().split ()))
li.sort()
a=li[-1]
b=0
for i in range(1,a+1):
    if li[b]!=i:
        print(i)
    else:
        b=b+1
    
"""
li=[]
s=""
li= list(map(int, input ().split ()))
li.sort()
a=li[-1]
b=0
for i in range(a+1):    
    if li[b]!=i:
        s=s+str(-1)+" "
    else:
        s=s+str(li[b])+" "
    b=b+1
print (s)
    
