y=int(input("Enter Year : "))
m=int(input("Enter Month (In Number) : "))
if m==1:
    mo="January"
elif m==2:
    mo="February"
elif m==3:
    mo="March"
elif m==4:
    mo="April"
elif m==5:
    mo="May"
elif m==6:
    mo="June"
elif m==7:
    mo="July"
elif m==8:
    mo="August"
elif m==9:
    mo="September"
elif m==10:
    mo="October"
elif m==11:
    mo="November"
elif m==12:
    mo="December"
d=input("Enter the First Day of {} : ".format(mo)).lower()
if d=="sunday":
    t=1
elif d=="monday":
    t=2
elif d=="tuesday":
    t=3
elif d=="wednesday":
    t=4
elif d=="thursday":
    t=5
elif d=="friday":
    t=6
elif d=="saturday":
    t=7
if m==1 or m==3 or m==5 or m==7 or m==8 or m==10 or m==12:
    day=31
elif m==4 or m==6 or m==9 or m==11:
    day=30
else:
    if y%400==0 and y%4==0:
        if y%100!=0:
            day=29
    else:
        day=28
print(t)
print("S\tM\tT\tW\tTh\tF\tS")
a=1
for i in range (1,7):
    if a>day:
        break
    for j in range(1,8):
        if i==1:
            if j>=t:
                print("{}\t".format(a),end='')
                a+=1
            else:
                print(" \t",end='')
        else:
            print("{}\t".format(a),end='')
            a+=1
        if(a>day):
            break
    print()