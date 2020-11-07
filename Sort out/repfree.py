def repfree(s):
    n=len(s)
    c=0
    for i in range(n):
        a=s[i]
        if( a in s[i+1:]):
            c=c+1
    if c>0:
        return False
    else:
        return True

s=str(input())
print(s)
print(repfree(s))
