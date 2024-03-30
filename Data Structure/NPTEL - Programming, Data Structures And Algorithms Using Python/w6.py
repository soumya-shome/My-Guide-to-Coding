import random

def encrypt (ltr,key):
    l=[]
    for each in list(ltr):
        l.append(chr(ord(each)+1))
    return ("".join(l))

#letter_body="ABCDEFGH"
#d=encrypt(letter_body,4)
#print(d)

def guess(num):
    a=input("guess a number")
    if(a==num):
        print("Success")
    else:
        guess(num)

#guess(10)

def guess(num):
    a=int(input("Guess a number from 1 to 100"))
    print(a,num)
    if(a==num):
        print("Success")
    else:
        guess(random.randint(1,100))

#i=guess(random.randint(1,100))

def mul(num):
    if(num==1):
        return (-1)
    return (-1*mul(num-1))

#n=int(input("Enter the value of n"))
#print(mul(n))

def search(l,loc,item):
    if(loc<0):
        loc=0
    if(l[loc]==item):
        print("Found",item,"at index",loc)
        return
    if(loc==len(l)-1):
        print("Element not present")
        return (0)
    else:
        return (search(l,loc+1,item))

l=[1,2,3,4,5,6,7,8,9]
#search(l,-11,3)

print(int(3.79)+int(2.1))
