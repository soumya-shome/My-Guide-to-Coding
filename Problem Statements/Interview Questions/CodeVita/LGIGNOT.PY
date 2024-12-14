a=[]
n=int(input())
a=input().split(' ')
a = [int(i) for i in a]  
b,h=a[0],a[1]
m=[]
m=input().split(' ')
m = [int(i) for i in m] 
end=len(m)
start=0
print (m)
mi=(m.index(min(m)))
s1,s2=0,0
for i in range(mi):
    s1=s1+m[i]
for i in range(mi+1,end):
    s2=s2+m[i]
if s1>s2:
    end=mi
else:
    start=mi+1
li=[]
for i in range(start,end):
    li.append(m[i])
li.sort()
print(li)