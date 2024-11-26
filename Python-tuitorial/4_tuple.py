#tuple is immutable, ordered, iterable, sliceable, can contain duplicate values.

#creating a tuple
#1. using parentheses
#tuple_name = ()
#tuple_name = (element1, element2, element3, element4, element5)
x=(1,2,3,4,5)
print(x) #(1, 2, 3, 4, 5)
print(type(x)) #<class 'tuple'>

#2. using tuple() constructor
#tuple_name = tuple()
#tuple_name = tuple([element1, element2, element3, element4, element5])
y=tuple([1,2,3,4,5])
print(y) #(1, 2, 3, 4, 5)
print(type(y)) #<class 'tuple'>

#---------------------Add---------------------

#adding elements to a tuple is not possible as tuples are immutable

#---------------------Remove---------------------

#removing elements from a tuple is not possible as tuples are immutable

#---------------------Update---------------------

#updating elements of a tuple is not possible as tuples are immutable

#---------------------Access---------------------

#1. using index
#tuple_name[index]
print(x[0]) #1
print(x[1]) #2

#2. using negative index
#tuple_name[-index]
print(x[-1]) #5
print(x[-2]) #4

#3. using slice
#tuple_name[start_index:end_index]
print(x[0:2]) #(1, 2)
print(x[1:3]) #(2, 3)

#4. using negative slice
#tuple_name[start_index:end_index]
print(x[-2:-1]) #(4,)
print(x[-3:-1]) #(3, 4)

#5. using stride
#tuple_name[start_index:end_index:stride]
print(x[0:4:2]) #(1, 3)
print(x[1:5:2]) #(2, 4)

#6. using negative stride
#tuple_name[start_index:end_index:stride]
print(x[-1:-5:-2]) #(5, 3)
print(x[-2:-6:-2]) #(4, 2)

#7. using stride with no start_index and end_index
#tuple_name[::stride]
print(x[::2]) #(1, 3, 5)
print(x[1::2]) #(2, 4)

#---------------------Others---------------------

#iterating through a tuple
for i in x:
    print(i) #1 2 3 4 5

#iterating through a tuple using index
for i in range(len(x)):
    print(x[i]) #1 2 3 4 5

#iterating through a tuple using enumerate()
for i, j in enumerate(x):
    print(i, j) #0 1 1 2 2 3 3 4 4 5

#---------------------Built-in functions---------------------

#1. all()
#returns True if all elements of the tuple are true or if the tuple is empty
#returns False if any element of the tuple is false
#syntax: all(tuple_name)
print(all(x)) #True

#2. any()
#returns True if any element of the tuple is true
#returns False if all elements of the tuple are false or if the tuple is empty
#syntax: any(tuple_name)

#3. enumerate()
#returns an enumerate object
#syntax: enumerate(tuple_name)
print(enumerate(x)) #<enumerate object at 0x0000020B0F6F0F00>

#4. len()
#returns the length of the tuple
#syntax: len(tuple_name)
print(len(x)) #5

#5. max()
#returns the maximum value in the tuple
#syntax: max(tuple_name)
print(max(x)) #5

#6. min()
#returns the minimum value in the tuple
#syntax: min(tuple_name)
print(min(x)) #1

#7. sorted()
#returns a sorted list of the given iterable
#syntax: sorted(tuple_name)
print(sorted(x)) #[1, 2, 3, 4, 5]

#8. sum()
#returns the sum of all elements in the tuple
#syntax: sum(tuple_name)
print(sum(x)) #15

#9. tuple()

#10. zip()
#returns an iterator of tuples
#syntax: zip(tuple_name1, tuple_name2)
print(zip(x, y)) #<zip object at 0x0000020B0F6F0F00>

#---------------------Built-in methods---------------------

#1. count()
#returns the number of times the specified element appears in the tuple
#syntax: tuple_name.count(element)
print(x.count(1)) #1

#2. index()
#returns the index of the first element with the specified value
#syntax: tuple_name.index(element)
print(x.index(1)) #0

#3.cmp()
#compares elements of both tuples
#syntax: cmp(tuple1, tuple2)
#returns 0 if both tuples are equal
#returns 1 if tuple1 is greater than tuple2
#returns -1 if tuple1 is less than tuple2
print(cmp(x, y)) #1

#4.filter()
#constructs an iterator from elements of an iterable for which a function returns true
#syntax: filter(function, iterable)
def greater_than_2(x):
    return x > 2

print(tuple(filter(greater_than_2, x))) #(3, 4, 5)

#5. map()
#returns an iterator after applying a function to each element of an iterable
#syntax: map(function, iterable)
def square(x):
    return x*x

print(tuple(map(square, x))) #(1, 4, 9, 16, 25) 

#6. reduce()
#applies a rolling computation to sequential pairs of values in a list
#syntax: reduce(function, iterable)
def add(x, y):
    return x+y

print(reduce(add, x)) #15

#7. reversed()
#returns a reversed iterator
#syntax: reversed(tuple_name)
print(tuple(reversed(x))) #(5, 4, 3, 2, 1)

#tuple comprehension
#syntax: tuple_name = (expression for item in iterable)
print(tuple(i for i in x)) #(1, 2, 3, 4, 5)



    





