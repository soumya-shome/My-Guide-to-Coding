#n=int(input())
#l=[]
#for i in range(n):
#  s=input()
#  l.append(s)
#for i in range(n):
#    print(l[i].upper())
s=input()
l,u=0,0
for j in s:
  if s[j].islower():
    l=l+1
  elif s[j].isupper():
    u=u+1
print(u," ",l,ends="")
