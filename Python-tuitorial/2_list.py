#list is mutable, ordered, iterable, sliceable, can contain duplicate values.

#creating a list
#1. using square brackets
#list_name = []
#list_name = [element1, element2, element3, element4, element5]
x=[1,2,3,4,5]
print(x) #[1, 2, 3, 4, 5]
print(type(x)) #<class 'list'>

#2. using list() constructor
#list_name = list()
#list_name = list([element1, element2, element3, element4, element5])
y=list([1,2,3,4,5])
print(y) #[1, 2, 3, 4, 5]
print(type(y)) #<class 'list'>

#---------------------Add---------------------

#1. list_name.append(element)
#adds element to the end of the list
x.append(1)
print(x) #[1]
x.append(2)
print(x) #[1, 2]
x.append(3)
print(x) #[1, 2, 3]

#2. list_name.insert(index, element)
#adds element at the specified index
x.insert(0, 0)
print(x) #[0, 1, 2, 3]
x.insert(2, 4)
print(x) #[0, 1, 4, 2, 3]
x.insert(5, 5)

#3. list_name.extend(iterable)
#adds elements of iterable to the end of the list
x.extend([6,7,8,9,10])
print(x) #[0, 1, 4, 2, 3, 5, 6, 7, 8, 9, 10]

#---------------------Remove---------------------

#1. list_name.pop()
#removes and returns the last element of the list
x.pop()
print(x) #[0, 1, 4, 2, 3, 5, 6, 7, 8, 9]

#2. list_name.pop(index)
#removes and returns the element at the specified index
x.pop(0)
print(x) #[1, 4, 2, 3, 5, 6, 7, 8, 9]

#3. list_name.remove(element)
#removes the first occurence of the specified element
x.remove(4)
print(x) #[1, 2, 3, 5, 6, 7, 8, 9]

#4. list_name.clear()
#removes all the elements from the list
x.clear()
print(x) #[]
print(len(x)) #0

#---------------------Modify---------------------


#1. list_name[index] = new_element
#modifies the element at the specified index
x=[1,2,3,4,5,6,7,8,9,10]
x[0] = 0
print(x) #[0, 2, 3, 4, 5, 6, 7, 8, 9, 10]
x[9] = 11
print(x) #[0, 2, 3, 4, 5, 6, 7, 8, 9, 11]

#2. list_name[start_index:end_index] = new_list
#modifies the elements from start_index to end_index-1
x[0:5] = [1,2,3,4,5]
print(x) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 11]
x[2:5] = [3,4,5]
print(x) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 11]

#3. list_name[start_index:end_index:step_size] = new_list
#modifies the elements from start_index to end_index-1 with step_size
x[0:10:2] = [1,3,5,7,9]
print(x) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 11]

#---------------------Access---------------------

x=[1,2,3,4,5,6,7,8,9,10]

#1. list_name[index]
#returns the element at the specified index
print(x[0]) #1
print(x[1]) #2

#2. list_name[start_index:end_index]
#returns the elements from start_index to end_index-1
print(x[0:5]) #[1, 2, 3, 4, 5]
print(x[2:5]) #[3, 4, 5]
print(x[0:10]) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#3. list_name[start_index:end_index:step_size]
#returns the elements from start_index to end_index-1 with step_size
print(x[0:10:2]) #[1, 3, 5, 7, 9]
print(x[0:10:3]) #[1, 4, 7, 10]

#---------------------Others---------------------

#iterating over the list
#list_name = [element1, element2, element3, element4, element5]
# for element in list_name:
#     print(element)

for element in x:
    print(element) #1 2 3 4 5 6 7 8 9 10

#list_name = [element1, element2, element3, element4, element5]
# for index, element in enumerate(list_name):
#    print(index, element)

for index, element in enumerate(x):
    print(index, element) #0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10

#list_name = [element1, element2, element3, element4, element5]
# for index in range(len(list_name)):
#    print(index, list_name[index])

for index in range(len(x)):
    print(index, x[index]) #0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10

#length of the list
#len(list_name)

print(len(x)) #10

#count the number of occurences of an element
#list_name.count(element)

print(x.count(1)) #1

#sort the list
#list_name.sort()

x=[10,9,8,7,6,5,4,3,2,1]
x.sort()
print(x) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#reverse the list
#list_name.reverse()

x.reverse()
print(x) #[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

#copy the list
#list_name.copy()

y = x.copy()
print(y) #[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

#max element in the list
#max(list_name)

print(max(x)) #10

#min element in the list
#min(list_name)

print(min(x)) #1

#sum of all the elements in the list
#sum(list_name)

print(sum(x)) #55

#any element in the list is True
#any(list_name)

print(any(5)) #True
print(any(0)) #False

#all elements in the list are True
#all(list_name)

print(all(5)) #True
print(all(0)) #False

#enumerate the list
#enumerate(list_name)

print(list(enumerate(x))) #[(0, 10), (1, 9), (2, 8), (3, 7), (4, 6), (5, 5), (6, 4), (7, 3), (8, 2), (9, 1)]

#zip the lists
#zip(list1, list2)

list1 = [1,2,3,4,5]
list2 = [6,7,8,9,10]
print(list(zip(list1, list2))) #[(1, 6), (2, 7), (3, 8), (4, 9), (5, 10)]

#compare two lists
#cmp(list1, list2)

list1 = [1,2,3,4,5]
list2 = [5,4,3,2,1]
print(list1 == list2) #False
print(cmp(list1, list2)) #1
print(cmp(list1, list1)) #0
print(cmp(list2, list1)) #-1
print(list1 is list2) #False
print(list1 is not list2) #True

#filter the list
#filter(function, list_name)

def is_even(x):
    return x%2 == 0

x = [1,2,3,4,5,6,7,8,9,10]
print(list(filter(is_even, x))) #[2, 4, 6, 8, 10]

#map the list
#map(function, list_name)

def square(x):
    return x*x

x = [1,2,3,4,5,6,7,8,9,10]
print(list(map(square, x))) #[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

#reduce the list
#reduce(function, list_name)

from functools import reduce

def add(x,y):
    return x+y

x = [1,2,3,4,5,6,7,8,9,10]
print(reduce(add, x)) #55

#---------------------List Comprehension---------------------

#list_name = [expression for element in list_name]

x = [1,2,3,4,5,6,7,8,9,10]
y = [element for element in x]
print(y) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

#list_name = [expression for element in list_name if condition]

x = [1,2,3,4,5,6,7,8,9,10]
y = [element for element in x if element%2 == 0]
print(y) #[2, 4, 6, 8, 10]

#list_name = [expression if condition else expression for element in list_name]

x = [1,2,3,4,5,6,7,8,9,10]
y = [element if element%2 == 0 else 0 for element in x]




