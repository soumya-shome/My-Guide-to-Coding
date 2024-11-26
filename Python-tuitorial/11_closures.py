#closures in python

# def outer_func():
#     message = 'Hi'
#     def inner_func():
#         print(message)
#     return inner_func()
# outer_func() #Hi
#
# def outer_func():
#     message = 'Hi'
#     def inner_func():
#         print(message)
#     return inner_func
# outer_func() #<function outer_func.<locals>.inner_func at 0x000001F3F9F4F1F8>
# my_func = outer_func()
# print(my_func) #<function outer_func.<locals>.inner_func at 0x000001F3F9F4F1F8>
# my_func() #Hi
#
# def outer_func(msg):
#     message = msg
#     def inner_func():
#         print(message)
#     return inner_func
# hi_func = outer_func('Hi')
# hello_func = outer_func('Hello')
# hi_func() #Hi
# hello_func() #Hello
#

# def outer_func(msg):
#     def inner_func():
#         print(msg)
#     return inner_func
# hi_func = outer_func('Hi')
# hello_func = outer_func('Hello')
# hi_func() #Hi
# hello_func() #Hello
#


def outer_func(msg):
    def inner_func():
        print(msg)
    return inner_func
hi_func = outer_func('Hi')
hello_func = outer_func('Hello')
hi_func() #Hi
hello_func() #Hello

#example of closure
def outer_func(msg):
    def inner_func():
        print(msg)
    return inner_func
hi_func = outer_func('Hi')
hello_func = outer_func('Hello')
hi_func() #Hi
hello_func() #Hello

#example 2
def make_multiplier_of(n):
    def multiplier(x):
        return x * n
    return multiplier

# Multiplier of 3
times3 = make_multiplier_of(3) #n=3

# Multiplier of 5
times5 = make_multiplier_of(5) #n=5

# Output: 27
print(times3(9)) #x=9

# Output: 15
print(times5(3)) #x=3

# Output: 30
print(times5(times3(2))) #x=2