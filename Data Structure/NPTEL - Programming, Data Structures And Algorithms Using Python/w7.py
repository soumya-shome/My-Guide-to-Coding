#l=[[1,2,3],[4,5,6],[7,8,9]]
#f=1
#for j in range(3):
#    if(f==1):
#        for i in range(3):
#           print(l[i][j],end=" ")
#            f=0
#    if(f==0):
#        for i in range(2,-1,-1):
#            print(l[i][j],end=" ")
#            f=1
##import turtle
#def func(mx,i):
    tur = turtle.Turtle()
    tur.setpos(i,i)
    n=len(mx)
    for ind in range(i,n-i):
        tur.goto(i,ind)
    for ind in range(i+1,n-i):
        tur.goto(i,n-1-i)
    for ind in range(n-2-i,i,-1):
        tur.goto(n-1-i,ind)
    for ind in range(n-i-1,i,-1):
        tur.goto(ind,i)
def func1(mx):
    n=len(mx)
    i=0
    while(i<=n-1):
        func(mx,i)
        i=i+10
func1([[1,1,1,1],[1,1,1,1],[1,1,1,1],[1,1,1,1]])
