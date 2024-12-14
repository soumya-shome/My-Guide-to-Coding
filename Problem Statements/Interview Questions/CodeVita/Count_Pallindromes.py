def isPalindrome(s): 
    return s == s[::-1] 

n1,n2=input().replace(' ','')
n1=n1+"000000"
n2=n2+"235959"
n1=int(n1)
n2=int(n2)
print (n1," ",n2)
print(isPalindrome)
for i in range(n1,n2+1):
    
