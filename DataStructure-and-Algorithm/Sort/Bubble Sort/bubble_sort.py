def bubblesort(l):
    n=len(l)
    for i in range(0,n-1):
        for j in range(0,n-i-1):
            if l[j]>l[j+1]:
                l[j],l[j+1]=l[j+1],l[j]

li=[]
n1=int(input("Enter the size : "))
print("Enter the numbers : ")
for i in range(0,n1):
    m=int(input())
    li.append(m)
print("Original Array : ",li)
bubblesort(li)
print ("Sorted Array : ",li)