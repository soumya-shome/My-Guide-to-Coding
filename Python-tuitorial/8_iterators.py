#iterator in python
#iterator is an object that contains a countable number of values
#iterator is an object that can be iterated upon, meaning that you can traverse through all the values
#iterator is an object which implements the iterator protocol, which consist of the methods __iter__() and __next__()
#iterable is an object which will return an iterator when iter() is called on it

#syntax of iterator
#iter(object[, sentinel])
#object - object whose iterator has to be created (can be sets, tuples, etc.)
#sentinel (optional) - special value that is used to represent the end of a sequence

a=iter('python')
print(next(a)) #p
print(next(a)) #y
print(next(a)) #t
print(next(a)) #h
print(next(a)) #o
print(next(a)) #n
print(next(a)) #StopIteration

#example of iterator
s = 'python'
for i in s:
    print(i)

#example of iterator using iter()
s = 'python'
a = iter(s)
print(next(a)) #p
print(next(a)) #y
print(next(a)) #t
print(next(a)) #h
print(next(a)) #o
print(next(a)) #n
print(next(a)) #StopIteration

#example of iterator using iter() and sentinel
s = 'python'
a = iter(s, 'n')
print(next(a)) #p
print(next(a)) #y
print(next(a)) #t
print(next(a)) #h
print(next(a)) #o
print(next(a)) #StopIteration

#example of iterator using iter() with tuple
s = ('p', 'y', 't', 'h', 'o', 'n')
a = iter(s)
print(next(a)) #p
print(next(a)) #y
print(next(a)) #t
print(next(a)) #h
print(next(a)) #o
print(next(a)) #n
print(next(a)) #StopIteration

#create an iterator
class MyNumbers:
    def __iter__(self):
        self.a = 1
        return self
    def __next__(self):
        x = self.a
        self.a +=1
        return x
myclass = MyNumbers()
myiter = iter(myclass)
print(next(myiter)) #1
print(next(myiter)) #2
print(next(myiter)) #3
print(next(myiter)) #4
print(next(myiter)) #5
print(next(myiter)) #6
print(next(myiter)) #7
print(next(myiter)) #8
print(next(myiter)) #9
print(next(myiter)) #10

#stop iteration
class MyNumbers:
    def __iter__(self):
        self.a = 1
        return self
    def __next__(self):
        if self.a <= 10:
            x = self.a
            self.a +=1
            return x
        else:
            raise StopIteration
myclass = MyNumbers()
myiter = iter(myclass)
print(next(myiter)) #1
print(next(myiter)) #2
print(next(myiter)) #3
print(next(myiter)) #4
print(next(myiter)) #5
print(next(myiter)) #6
print(next(myiter)) #7
print(next(myiter)) #8
print(next(myiter)) #9
print(next(myiter)) #10
print(next(myiter)) #StopIteration

#example of iterator using list