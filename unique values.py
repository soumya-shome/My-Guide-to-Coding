l=[]
li=[]
n=int(input("Enter the number of terms : "))
for i in range(n):
    a=int(input("Enter a number : "))
    l.append(a)
for i in l:
    if i  in l:
        li.append(i)
print (li)
