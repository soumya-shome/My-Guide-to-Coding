def insertion(n):
    for i in range(len(n)):
        v=n[i]
        p=i
        while p>0 and n[p-1]>v:
            n[p]=n[p-1]
            p-=1
        if(p!=i):
            n[p]=v
    return n

l=[4,3,2,0,5,1,6,8,7,9]
print(insertion(l))