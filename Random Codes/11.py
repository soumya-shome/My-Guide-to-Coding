l=[]
n=int(input("Enter the number of terms"))
for i in range(0,n):
    s=input("Enter the word")
    l.append(s)
v=[0,0,0,0,0]
for i in range(0,n):
    s=l[i]
    m=len(s)
    for j in range(0,m):
        if(s[j]=='a' or s[j]=='A'):
            v[0]=v[0]+1
        elif(s[j]=='e' or s[j]=='E'):
            v[1]=v[1]+1 
        elif(s[j]=='i' or s[j]=='I'):
            v[2]=v[2]+1
        elif(s[j]=='o' or s[j]=='O'):
             v[3]=v[3]+1
        elif(s[j]=='u' or s[j]=='U'):
             v[4]=v[4]+1

print (l)
print(v)
            
