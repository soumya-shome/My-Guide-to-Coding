#set is mutable, unordered, iterable, not sliceable, cannot contain duplicate values.

#dictionary is mutable, unordered, iterable, not sliceable, cannot contain duplicate keys but can contain duplicate values.

#creating a dictionary
#1. using curly braces
#dict_name = {}
#dict_name = {key1:value1, key2:value2, key3:value3, key4:value4, key5:value5}
x={1:'a',2:'b',3:'c',4:'d',5:'e'}
print(x) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e'}
print(type(x)) #<class 'dict'>

#2. using dict() constructor
#dict_name = dict()
#dict_name = dict({key1:value1, key2:value2, key3:value3, key4:value4, key5:value5})
y=dict({1:'a',2:'b',3:'c',4:'d',5:'e'})
print(y) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e'}
print(type(y)) #<class 'dict'>

#---------------------Add---------------------

#1. using update() method
#dict_name.update({key1:value1, key2:value2, key3:value3, key4:value4, key5:value5})
x.update({6:'f'})
print(x) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e', 6: 'f'}

#---------------------Remove---------------------

#1. using pop() method
#dict_name.pop(key)
x.pop(6)
print(x) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e'}

#2. using popitem() method
#dict_name.popitem()
x.popitem()
print(x) #{1: 'a', 2: 'b', 3: 'c', 4: 'd'}

#3. using clear() method
#dict_name.clear()
x.clear()
print(x) #{}

#---------------------Update---------------------

#1. using update() method
#dict_name.update({key1:value1, key2:value2, key3:value3, key4:value4, key5:value5})
x.update({1:'a',2:'b',3:'c',4:'d',5:'e'})
print(x) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e'}

#---------------------Access---------------------

#1. using get() method
#dict_name.get(key)
print(x.get(1)) #a

#2. using keys() method
#dict_name.keys()
print(x.keys()) #dict_keys([1, 2, 3, 4, 5])

#3. using values() method
#dict_name.values()
print(x.values()) #dict_values(['a', 'b', 'c', 'd', 'e'])

#4. using items() method
#dict_name.items()
print(x.items()) #dict_items([(1, 'a'), (2, 'b'), (3, 'c'), (4, 'd'), (5, 'e')])

#---------------------Built-in Functions---------------------

#1. len()
#len(dict_name)
print(len(x)) #5

#2. type()
#type(dict_name)
print(type(x)) #<class 'dict'>

#3. setdefault()
#dict_name.setdefault(key, default_value)
print(x.setdefault(1,'a')) #a

#4. all()
#all(dict_name)
print(all(x)) #True

#5. any()
#any(dict_name)
print(any(x)) #True

#6. sorted()
#sorted(dict_name)
print(sorted(x)) #[1, 2, 3, 4, 5]

#7. reversed()
#reversed(dict_name)
print(reversed(x)) #<dict_reversekeyiterator object at 0x0000020B0F3F4D30>

#8. enumerate()
#enumerate(dict_name)
print(enumerate(x)) #<enumerate object at 0x0000020B0F3F4D80>

#9. copy()
#dict_name.copy()
print(x.copy()) #{1: 'a', 2: 'b', 3: 'c', 4: 'd', 5: 'e'}

#10. fromkeys()
#dict_name.fromkeys()
print(dict.fromkeys(x)) #{1: None, 2: None, 3: None, 4: None, 5: None}

#11. has_key()
#dict_name.has_key(key)
print(x.has_key(1)) #True

#12. cmp()
#cmp(dict_name1, dict_name2)
print(cmp(x,y)) #0

#13. iter()
#iter(dict_name)
print(iter(x)) #<dict_keyiterator object at 0x0000020B0F3F4D30>

#14. max()
#max(dict_name)
print(max(x)) #5

#15. min()
#min(dict_name)
print(min(x)) #1

#16. sum()
#sum(dict_name)
print(sum(x)) #15

#17. filter()
#filter(dict_name)
print(filter(x)) #<filter object at 0x0000020B0F3F4D30>

#18. map()
#map(dict_name)
print(map(x)) #<map object at 0x0000020B0F3F4D30>

#19. reduce()
#reduce(dict_name)
print(reduce(x)) #<reduce object at 0x0000020B0F3F4D30>

#20. zip()
#zip(dict_name)
print(zip(x)) #<zip object at 0x0000020B0F3F4D30>

#---------------------Dictionary Comprehension---------------------

#1. using for loop
#dict_name = {key:value for (key,value) in iterable}
dict1 = {x:x*x for x in range(1,6)}
print(dict1) #{1: 1, 2: 4, 3: 9, 4: 16, 5: 25}

#2. using if condition
#dict_name = {key:value for (key,value) in iterable if (key,value) in iterable}
dict2 = {x:x*x for x in range(1,6) if x%2==0}
print(dict2) #{2: 4, 4: 16}

#3. using if else condition
#dict_name = {key:value if (key,value) in iterable else key:value for (key,value) in iterable}
dict3 = {x:x*x if x%2==0 else x for x in range(1,6)}
print(dict3) #{1: 1, 2: 4, 3: 3, 4: 16, 5: 5}




