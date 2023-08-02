# Enter your code here. Read input from STDIN. Print output to STDOUT
n,m = input().split()
n,m=int(n),int(m)
if 5<n and n<101 and 15<m and m<303:
    if m//n==3:
        a=m//2
        for i in range(1,n//2+1):
            for j in range(1,a):
                print('-',end="")
            for j in range(0,i):
                print(".|.",end="")
            for j in range(1,i):
                print(".|.",end="")
            for j in range(1,a):
                print('-',end="")
            print()
            a-=3
        for i in range((m-7)//2):
            print("-",end="")
        print("WELCOME",end="")
        for i in range((m-7)//2):
            print("-",end="")
        a+=3
        print()
        for i in range(n//2,0,-1):
            for j in range(1,a):
                print('-',end="")
            for j in range(0,i):
                print(".|.",end="")
            for j in range(1,i):
                print(".|.",end="")
            for j in range(1,a):
                print('-',end="")
            print()
            a+=3
        
