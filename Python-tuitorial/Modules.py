#Modules in python are simply python files with .py extension, which implement a set of functions.

# Modules are imported from other modules using the import command.
# In this example, the math module is imported in the file named example.py.

# 1. Importing Modules

# import example
# This does not import the names of the functions defined in example directly in the current symbol table.
# It only imports the module name example there.

# By using the module name you can access the functions.
# example.add(10, 20)
# example.sub(10, 20)

# Python has a ton of standard modules available.
# You can check out the full list of Python standard modules and what they are for here.

# Few commonly used standard modules are os, sys, math, random etc.

# The dir() built-in function returns a sorted list of strings containing the names defined by a module.
# The globals() and locals() functions can be used to return the names in the global and local namespaces depending on the location from where they are called.
# The reload() function available inside the imp module is used to reload a module. This is useful in some circumstances where some changes in a module are not reflected in the importer.

#syntax for import
# import module1[, module2[,... moduleN]

import math
print("The value of pi is", math.pi)

# 2. Importing from Modules
# 3. Importing Specific Items
# The from...import Statement
# Python's from statement lets you import specific attributes from a module into the current namespace.
# Syntax :
# from modname import name1[, name2[, ... nameN]]

# For example, to import the function fibonacci from the module fib, use the following statement −
# from fib import fibonacci

# This statement does not import the entire module fib into the current namespace; it just introduces the item fibonacci from the module fib into the global symbol table of the importing module.

from math import pi
print("The value of pi is", pi)

# 4. Importing All Names

# The from...import * Statement
# It is also possible to import all names from a module into the current namespace by using the following import statement −
# from modname import *
# This provides an easy way to import all the items from a module into the current namespace; however, this statement should be used sparingly.

# 5. Locating Modules

# When you import a module, the Python interpreter searches for the module in the following sequences −
# The current directory.
# If the module isn't found, Python then searches each directory in the shell variable PYTHONPATH.
# If all else fails, Python checks the default path. On UNIX, this default path is normally /usr/local/lib/python/.

# 6. The PYTHONPATH Variable

# The PYTHONPATH is an environment variable, consisting of a list of directories.
# The syntax of PYTHONPATH is the same as that of the shell variable PATH.

# Here is a typical PYTHONPATH from a Windows system −
# set PYTHONPATH = c:\python20\lib;
# And here is a typical PYTHONPATH from a UNIX system −
# set PYTHONPATH = /usr/local/lib/python
# typical PYTHONPATH on a Mac OS X system −
# set PYTHONPATH = /usr/local/lib/python

# 7. Namespaces and Scoping

# Variables are names (identifiers) that map to objects.
# A namespace is a dictionary of variable names (keys) and their corresponding objects (values).
# A Python statement can access variables in a local namespace and in the global namespace.
# If a local and a global variable have the same name, the local variable shadows the global variable.

# Each function has its own local namespace.
# Class methods follow the same scoping rule as ordinary functions.
# Python makes educated guesses on whether variables are local or global.
# It assumes that any variable assigned a value in a function is local.
# Therefore, in order to assign a value to a global variable within a function, you must first use the global statement.

# The statement global VarName tells Python that VarName is a global variable.
# Python stops searching the local namespace for the variable.
# For example, we define a variable Money in the global namespace.
# Within the function Money, we assign Money a value, therefore Python assumes Money as a local variable.
# However, we accessed the value of the local variable Money before setting it, so an UnboundLocalError is the result.
# Uncommenting the global statement fixes the problem.

Money = 2000
def AddMoney():
    # Uncomment the following line to fix the code:
    global Money
    Money = Money + 1
    print(Money)

#without global keyword
AddMoney() #UnboundLocalError: local variable 'Money' referenced before assignment

#with global keyword
AddMoney() #2001

# 8. The dir( ) Function

# The dir() built-in function returns a sorted list of strings containing the names defined by a module.
# The list contains the names of all the modules, variables and functions that are defined in a module.
