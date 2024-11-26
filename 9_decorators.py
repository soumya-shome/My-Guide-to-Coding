#decorators are used to modify the behavior of function or class

#syntax of decorator
# @decorator_name
# def function_name():
#     function_suite
#     return function_result
#
# def function_name():
#     function_suite
#     return function_result
# function_name = decorator_name(function_name) #this is how decorator is used

#example
def hello_decorator(func):
    def inner1():
        print("Hello, this is before function execution")
        func()
        print("This is after function execution")
    return inner1
def function_to_be_used():
    print("This is inside the function !!")
function_to_be_used = hello_decorator(function_to_be_used)
function_to_be_used() #Hello, this is before function execution
                        #This is inside the function !!
                        #This is after function execution


#using @ symbol
def hello_decorator2(func):
    def inner1():
        print("Hello, this is before function execution")
        func()
        print("This is after function execution")
    return inner1
@hello_decorator
def function_to_be_used():
    print("This is inside the function !!")
function_to_be_used() #Hello, this is before function execution
                        #This is inside the function !!                 
                        #This is after function execution

#example 2
def hello_decorator(func):
    def inner1(*args, **kwargs):
        print("Hello, this is before function execution")
        func(*args, **kwargs)
        print("This is after function execution")
    return inner1
@hello_decorator
def function_to_be_used(name):
    print("This is inside the function !!", name)
function_to_be_used("Rishabh") #Hello, this is before function execution
                                #This is inside the function !! Rishabh     
                                #This is after function execution

#example 3
def hello_decorator(func):
    def inner1(*args, **kwargs):
        print("Hello, this is before function execution")
        returned_value = func(*args, **kwargs)
        print("This is after function execution")
        return returned_value
    return inner1
@hello_decorator
def sum_two_numbers(a, b):
    print("Inside the function")
    return a + b
a, b = 1, 2
print("Sum =", sum_two_numbers(a, b)) #Hello, this is before function execution
                                        #Inside the function            
                                        #This is after function execution
                                        #Sum = 3

#decorator with arguments
def decorator_func(x, y):
    def inner_func(func):
        def wrapper(*args, **kwargs):
            print("I like Geeksforgeeks")
            print("Summation of values - {}".format(x+y))
            func(*args, **kwargs)
        return wrapper
    return inner_func
@decorator_func(12, 15)
def my_func(*args):
    for ele in args:
        print(ele)
my_func('John', 'peter') #I like Geeksforgeeks
                            #Summation of values - 27   
                            #John
                            #peter

#decorator with arguments and return value
def decorator_func(x, y):
    def inner_func(func):
        def wrapper(*args, **kwargs):
            print("I like Geeksforgeeks")
            print("Summation of values - {}".format(x+y))
            return func(*args, **kwargs)
        return wrapper
    return inner_func
@decorator_func(12, 15)
def my_func(*args):
    for ele in args:
        print(ele)
my_func('John', 'peter') #I like Geeksforgeeks
                            #Summation of values - 27   
                            #John
                            #peter

#chaining decorators in python
def decor1(func):
    def inner():
        x = func()
        return x * x
    return inner
def decor(func):
    def inner():
        x = func()
        return 2 * x
    return inner
@decor1
@decor
def num():
    return 10
print(num()) #400

#decorators with parameters
def decorator(*args, **kwargs):
    print("Inside decorator")
    def inner(func):
        print("Inside inner function")
        print("I like", kwargs['like'])
        func()
    return inner
@decorator(like = "geeksforgeeks")
def my_func():
    print("Inside actual function")
#Inside decorator
#Inside inner function
#I like geeksforgeeks
#Inside actual function

