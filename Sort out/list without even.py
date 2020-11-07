l=[]
n=int(input("Enter number of terms"))
for i in range(n):
    a=int(input())
    l.append(a)
for i in l:
    if i%2!=0:
        print(i)
