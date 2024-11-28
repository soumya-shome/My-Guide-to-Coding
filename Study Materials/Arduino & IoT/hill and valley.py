def hillvalley(s):
    if not s or len(s) < 2:
        return 0
    i = 0
    count = 0
    pre = None
    while i < len(s):
        if i == 0:
            while s[i] == s[i+1]:  # loop until value is different
                i += 1
            i += 1
            if i < len(s):       # check if it reaches the end 
                count += 1
                pre = s[i-1]     # track the previous value
        elif i == len(s) - 1:
            while s[i] == s[i-1]:  
                i -= 1
            i -= 1
            if i >= 0:
                count += 1
            break
        else:
            while s[i] == s[i+1]:
                i += 1
            i += 1
            if s[i] > s[i-1] and pre > s[i-1]:  # it is a valley
                count += 1
            elif s[i] < s[i-1] and pre < s[i-1]:  # it is a hill
                count += 1
            pre = s[i-1]
    if count==3:
        return True
    else:
        return False

lst = [] 
n = int(input("Enter number of elements : ")) 
for i in range(0, n): 
    ele = int(input()) 
    lst.append(ele) # adding the element 
print(lst) 
print (hillvalley(lst))
