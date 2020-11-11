import sys
sys.setrecursionlimit(150000000)


memo = [-1]*10000000

def func(l, i):
    if i >= len(l):
        return 0

    elif i == len(l) - 1:
        return abs(l[i][0] - l[i][1])

    elif memo[i] != -1:
        return memo[i]

    else:
        x = max(abs(l[i][0] - l[i][1]) + func(l, i+1), 
                abs(l[i][0] - l[i+1][0]) + abs(l[i][1] - l[i+1][1]) + func(l, i+2))
        memo[i] = x
        return x
        
        
n = int(input())
x = list(map(int, input().split()))
y = list(map(int, input().split()))
l = [[i, j] for i, j in zip(x, y)]

print(func(l, 0))