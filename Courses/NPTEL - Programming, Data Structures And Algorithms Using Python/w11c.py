import math
c,h=50,30
li=[]
l=[]
li= list(map(int, input ().split (",")))
for i in range(len(li)):
    a=2*c*li[i]
    b=a/h
    q=math.sqrt(b)
    q=math.ceil(q)
    l.append(str(q))
seperator = ', '
print(seperator.join(l))
