def arrangement(s):
    N = len(s)
    ones,zeros = 0,0    
    for i in range(N):
        if (s[i] == 'B'):
            ones += 1
        else:
            zeros+= 1
    if (ones > zeros + 1 or zeros > ones + 1):
        return -1
    if (N % 2):
        num = (N + 1) // 2
        o_e = 0
        z_e = 0
        for i in range(N):
            if (i % 2 == 0):
                if (s[i] == 'B'):
                    o_e+=1
                else:
                    z_e+=1
        if (ones > zeros):
            return num - o_e
        else:
            return num - z_e 
    else:
        o_od = 0
        o_e = 0

        for i in range(N):
            if (s[i] == 'B'):
                if (i % 2):
                    o_od+=1
                else:
                    o_e+=1
        return min(N // 2 - o_od, N // 2 - o_e)
s = input()
print(arrangement(s),end="")

