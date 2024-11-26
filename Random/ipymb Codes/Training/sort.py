def get_max(a,compare):
    largest=a[0]
    for item in a[1:]:
        if compare(item,largest):
            largest=item
    return largest

def bubble_sort(a,compare):
    for i in range(len(a)-1):
        for j in range(0,len(a)-i-1):
            if compare(a[j],a[j+1]):
                a[j],a[j+1]=a[j+1],a[j]
    return a