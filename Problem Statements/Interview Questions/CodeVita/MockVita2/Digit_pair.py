n1=input()
if len(n1)==3:
    n=list(n1)
    for i in range(len(n)):
        n[i]=int(n[i])
    m1=max(n)
    m2=min(n)
    s=(m1*11)+(m2*7)
    print(s)
    n2=str(s)
    if len(n2)>2:
        n3=s%100
        