def m_p_p(numbers):
    n = len(numbers)
    max_product = 0
    for first in range(n):
        for second in range(first + 1, n):
            max_product = max(max_product,
                numbers[first] * numbers[second])

    return max_product


#input_n = int(input())
input_numbers = [int(x) for x in input().split()]
print(m_p_p(input_numbers))