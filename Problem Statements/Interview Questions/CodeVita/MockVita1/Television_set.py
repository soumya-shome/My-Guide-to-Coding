def form(d,m):
    return ((6-m)**2+(abs(d-15)))

def dadt():
    s=0
    m={1,2,3,4,5,6,7,8,9,10,11,12}
    dm={31,28,31,30,31,30,31,31,30,31,30,31}
    for i in m:
        for j in range(dm):
            print("Date: ",j,"Month: ",i,end="")
            print(form(j,i))
n=int(input())
n1, n2 = map(int, input().split())
r=int(input())
dadt()