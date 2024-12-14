m=[['a','b','a'],['b','b','a'],['b','b','b']]
print(m)
for i in range(len(m)):
    l=[]
    for j in range(len(m[i])):
        l.append(m[j][i])
    #print (l) #ok
    l.sort(reverse=True)
    #print(l)
    for j in range(len(m[i])):
        m[j][i]=l[j]
print (m)