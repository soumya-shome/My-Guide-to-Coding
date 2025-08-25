def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid + 1
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

l = []
print("Enter 10 numbers :")
for i in range(10):
    n1 = int(input())
    l.append(n1)

l.sort()
print("Sorted list:", l)

n = int(input("Enter the number to be searched : "))
p = binary_search(l, n)

if p != -1:
    print(f"Found at {p} position")
else:
    print("Not Found")
