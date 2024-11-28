def selection(n):
    for i in range(len(n)-1):
        m=i
        for j in range(i+1,len(n)):
            if(n[j]<n[m]):
                m=j
        if m!=i : n[m],n[i]=n[i],n[m]
    return n
l=[4,3,2,0,5,1,6,8,7,9]
print(selection(l))