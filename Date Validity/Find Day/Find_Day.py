def day(d,m,y):
    yc,day=0,0
    mc=(0,3,3,6,1,4,6,2,5,0,3,5)
    if y>=1600 and y<=1699:
        yc=6
    elif y>=1700 and y<=1799:
        yc=4
    elif y>=1800 and y<=1899:
        yc=2
    elif y>=1900 and y<=1999:
        yc=0
    elif y>=2000 and y<=2099:
        yc=6
    
    day=day+mc[m-1]+(y%100)+((y%100)//4)+yc
    day=day%7
    return day

print("Enter in Numbers")
d=int(input("Enter Date : "))
m=int(input("Enter Month : "))
y=int(input("Enter Year : "))
print("The Date is : {}-{}-{}".format(d,m,y))
days=day(d,m,y)
if days==0:
    s="Sunday"
elif days==1:
    s="Monday"
elif days==2:
    s="Tuesday"
elif days==3:
    s="Wednesday"
elif days==4:
    s="Thursday"
elif days==5:
    s="Friday"
elif days==6:
    s="Saturday"
print("The Day is : {}".format(s))