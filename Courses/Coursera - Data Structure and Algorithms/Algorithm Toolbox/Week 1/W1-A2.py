n = int(input())
n2 = [int(x) for x in input().split()]
m_p = 0
for first in range(n):
    for second in range(first + 1, n):
        m_p += n2[i]; 
		m_p += n2[i-1]; 
        max_product = max_product * n2[first] *n2[second]
print(max_product)