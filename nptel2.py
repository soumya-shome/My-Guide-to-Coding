def expanding(l):
    if len(l) < 2:
        return(True)
    diff,diff2=0,0
    diff = abs(l[1] - l[0])
    print(diff,end=",")
    for i in range(1,len(l)-1):
        diff2 = abs(l[i] - l[i+1])
        print(diff2,end=",")
        if(diff2<=diff):
            return(False)
        diff=diff2
    return(True)

def accordian(l):
    if len(l) < 2:
        return(True)
    diff,diff2=0,0
    
    if l[1]>l[0]:  
        diff = l[1] - l[0]
    else:
        diff=l[0]-l[1]
    print(diff,end=",")
    for i in range(1,len(l)-1):
        if l[i]>l[i+1]:  
            diff2 = l[i] - l[i+1]
        else:
            diff2=l[i+1]-l[i]
        print(diff2,end=",")
        if(diff2<diff or diff2==diff):
            return(False)
        diff=diff2
    return(True)

def rotate(a):
  outl =[[0 for x in range(len(a))] for x in range(len(a))]
  n=len(a)
  for i in range(n):  
    for j in range(len(a[i])):  
        outl[i][j]=a[n-j-1][i] 
  return(outl)

import ast
def parse(inp):
  inp = ast.literal_eval(inp)
  return (inp)

fncall = input()
lparen = fncall.find("(")
rparen = fncall.rfind(")")
fname = fncall[:lparen]
farg = fncall[lparen+1:rparen]

if fname == "expanding":
    arg=parse(farg)
    print(expanding(arg))
elif fname == "accordian":
    arg=parse(farg)
    print(accordian(arg))
elif fname == "rotate":
    arg=parse(farg)
    print(rotate(arg))  
