#set is mutable, unordered, iterable, not sliceable, cannot contain duplicate values.

#creating a set
#1. using curly braces
#set_name = {}
#set_name = {element1, element2, element3, element4, element5}
x={1,2,3,4,5}
print(x) #{1, 2, 3, 4, 5}
print(type(x)) #<class 'set'>

#2. using set() constructor
#set_name = set()
#set_name = set([element1, element2, element3, element4, element5])
y=set([1,2,3,4,5])
print(y) #{1, 2, 3, 4, 5}
print(type(y)) #<class 'set'>

#---------------------Add---------------------

#1. using add() method
#set_name.add(element)
x.add(6)
print(x) #{1, 2, 3, 4, 5, 6}

#2. using update() method
#set_name.update([element1, element2, element3, element4, element5])
x.update([7,8,9,10])
print(x) #{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})

#---------------------Remove---------------------

#1. using remove() method\
#set_name.remove(element)
x.remove(10)
print(x) #{1, 2, 3, 4, 5, 6, 7, 8, 9}

#2. using discard() method
#set_name.discard(element)
x.discard(9)
print(x) #{1, 2, 3, 4, 5, 6, 7, 8}

#3. using pop() method
#set_name.pop()
x.pop()
print(x) #{2, 3, 4, 5, 6, 7, 8}

#4. using clear() method
#set_name.clear()
x.clear()

#---------------------Update---------------------

#1. using update() method
#set_name.update([element1, element2, element3, element4, element5])
x.update([1,2,3,4,5])
print(x) #{1, 2, 3, 4, 5}



#---------------------Access---------------------

#1. using for loop
# for element in set_name:
#     print(element)
for i in x:
    print(i) #1 2 3 4 5

#---------------------Built-in functions---------------------

#1. all()
#all(set_name)
print(all(x)) #True

#2. any()
#any(set_name)
print(any(x)) #True

#3. enumerate()
#enumerate(set_name)
print(set(enumerate(x))) #{(0, 1), (1, 2), (2, 3), (3, 4), (4, 5)}

#4. len()
#len(set_name)
print(len(x)) #5

#5. max()
#max(set_name)
print(max(x)) #5

#6. min()
#min(set_name)
print(min(x)) #1

#7. sum()
#sum(set_name)
print(sum(x)) #15

#8. sorted()
#sorted(set_name)
print(sorted(x)) #[1, 2, 3, 4, 5]

#9. set()

#10. zip()
#zip(set_name1, set_name2)
x={1,2,3,4,5}
y={6,7,8,9,10}
print(set(zip(x,y))) #{(1, 6), (2, 7), (3, 8), (4, 9), (5, 10)}

#---------------------Built-in methods---------------------

#1. copy()
#set_name.copy()
x={1,2,3,4,5}
y=x.copy()
print(y) #{1, 2, 3, 4, 5}

#2. cmp()
#set_name1.cmp(set_name2)
x={1,2,3,4,5}
y={6,7,8,9,10}
print(x==y) #False
print(cmp(x,y)) #1
print(cmp(y,x)) #-1

#3. filter()
#filter(function, set_name)
def func(x):
    if x>3:
        return x
print(set(filter(func,x))) #{4, 5}

#4. map()
#map(function, set_name)
def func(x):
    return x+1
print(set(map(func,x))) #{2, 3, 4, 5, 6}

#5. reduce()
#reduce(function, set_name)
def func(x,y):
    return x+y
print(reduce(func,x)) #15

#6.reverse()
#set_name.reverse()
x={1,2,3,4,5}
x.reverse()
print(x) #{1, 2, 3, 4, 5}

#8. isdisjoint()
#set_name1.isdisjoint(set_name2)
x={1,2,3,4,5}
y={6,7,8,9,10}
print(x.isdisjoint(y)) #True

#9. issubset()
#set_name1.issubset(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(x.issubset(y)) #True

#10. issuperset()
#set_name1.issuperset(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(y.issuperset(x)) #True

#11. difference()
#set_name1.difference(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(y.difference(x)) #{6, 7, 8, 9, 10}

#12. intersection()
#set_name1.intersection(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(y.intersection(x)) #{1, 2, 3, 4, 5}

#13. union()
#set_name1.union(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(y.union(x)) #{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

#14. symmetric_difference()
#set_name1.symmetric_difference(set_name2)
x={1,2,3,4,5}
y={1,2,3,4,5,6,7,8,9,10}
print(y.symmetric_difference(x)) #{6, 7, 8, 9, 10}

#set comprehension
x={i for i in range(1,6)}
print(x) #{1, 2, 3, 4, 5}


