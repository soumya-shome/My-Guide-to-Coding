b=65
for i in range(4,-1,-1):
    for j in range(i+1):
        print(chr(b),end=" ")
        
    print()
    b=b+2