#Exception handling in python

# Exception handling is a mechanism in python to handle run time errors.
# It is a way of handling errors by changing the normal flow of the program.
# It is a way to prevent the program from crashing when an error occurs.

# try:
#     # code block where exception can occur
# except:
#     # code block that executes if an exception occurs in try block
# else:
#     # code block that executes if no exception occurs
# finally:
#     # code block that executes regardless of exception occurrence
# raise:
#     # raise an exception when a certain condition occurs
# assert:
#     # raise an exception if a certain condition does not occur

# 1. try and except block

# try:
#     # code block where exception can occur
# except:
#     # code block that executes if an exception occurs in try block

#Example: 
try:
    a = 10
    b = 0
    print(a/b)
except:
    print("Exception occured")

# 2. try, except and else block

# try:
#     # code block where exception can occur
# except:
#     # code block that executes if an exception occurs in try block
# else:
#     # code block that executes if no exception occurs

#Example:
try:
    a = 10
    b = 5
    print(a/b)
except:
    print("Exception occured")
else:
    print("No exception occured")

# 3. try, except, else and finally block

# try:
#     # code block where exception can occur
# except:
#     # code block that executes if an exception occurs in try block
# else:
#     # code block that executes if no exception occurs
# finally:
#     # code block that executes regardless of exception occurrence

#Example:
try:
    a = 10
    b = 5
    print(a/b)
except:
    print("Exception occured")
else:
    print("No exception occured")
finally:
    print("Finally block executed")

# 4. raise block

# raise:
#     # raise an exception when a certain condition occurs

#Example:
try:
    a = 10
    b = 5
    if b > a:
        raise Exception("b is greater than a")
except:
    print("Exception occured")
else:
    print("No exception occured")
finally:
    print("Finally block executed")

# 5. assert block

# assert:
#     # raise an exception if a certain condition does not occur

#Example:
try:
    a = 10
    b = 5
    assert(b < a)
except:
    print("Exception occured")
else:
    print("No exception occured")
finally:
    print("Finally block executed")

# 6. Custom exception

#Example:
class Error(Exception):
    pass

class dobException(Error):
    pass

year = int(input("Enter the year of birth: "))
age = 2021 - year

try:
    if age <= 30 & age > 20:
        pass
    else:
        raise dobException
except dobException:
    print("The age is valid. Age is between 20 and 30")
else:
    print("Age is not valid")

# 8. know the type of exception

#Example:
try:
    a = 10
    b = 0
    print(a/b)
except Exception as e:
    print("Exception occured: ", e)

# 9. Multiple exceptions

#Example:
try:
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    print(a/b)
except ZeroDivisionError:
    print("Division by zero is not allowed")
except ValueError:
    print("Only integer value is allowed")

# 10. Multiple exceptions using tuple

#Example:
try:
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    print(a/b)
except (ZeroDivisionError, ValueError):
    print("Invalid input")
    
# 11. Multiple exceptions using parent class

#Example:
try:
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    print(a/b)
except (ZeroDivisionError, ValueError) as e:
    print("Exception occured: ", e)

# 12. Else block with multiple exceptions

#Example:
try:
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    print(a/b)
except ZeroDivisionError:
    print("Division by zero is not allowed")
except ValueError:
    print("Only integer value is allowed")
else:
    print("No exception occured")

    
