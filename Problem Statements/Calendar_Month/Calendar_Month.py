def daysinmonth(month,year):
    if month==1 or month==3 or month==5 or month==7 or month==8 or month==10 or month==12:
        day=31
    elif month==4 or month==6 or month==9 or month==11:
        day=30
    else:
        if year%400==0 and year%4==0:
            if year%100!=0:
                day=29
        else:
            day=28
    return day

def dayofweek(d, m, y): 
    t = [ 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 ] 
    y -= m < 3
    return (( y + int(y / 4) - int(y / 100) + int(y / 400) + t[m - 1] + d) % 7)

y=int(input("Enter Year : "))
m=int(input("Enter Month (In Number) : "))
t=dayofweek(1,m,y)
day=daysinmonth(m,y)
print("M\tT\tW\tTh\tF\tS\tS")
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