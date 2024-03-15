def threesquare(n):
    for a in range(n+1):
        for b in range(n+1):
            c=(4**a)*((8*b)+7)
            #print(c,end=",")
            if c == n:
                return False
    return True

n=int(input("Enter"))
print (threesquare(n))
        
