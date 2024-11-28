# Python

## Contents
Beginner Level:
1. Introduction to Python
- Overview of Python
- Installing Python and an IDE
- Basic syntax and data types
2. Control Flow and Functions
- Conditional statements (if. else, elif)
- Loops (for, while)
- Functions and modular programming
3. Data Structures
- Lists, tuples, and dictionaries
- String manipulation
- Basic input/output
4. File Handling
- Reading and writing files
- Working with different file formats (text, csv)
5. Exception Handling
- Handling errors and exceptions
- using try-except blocks
6. Introduction to OOP (Object-Oriented Programming)
- Classes and objects
- Inheritance and polymorphism
7. Introduction to Libraries
- Overview of standard libraries (e.g., math, random)
- Introduction to external libraries (e.g., NumPy for numerical operations)

Intermediate Level
1. Advanced OOP
- Encapsulation, abstraction, and inheritance
- Advanced topics in polymorphism
2. Advanced Data Structures
- Sets and frozensets
- Stacks and queues
- Advanced list comprehensions
3. Functional Programming
- Lambda functions
- Map. filter, and reduce functions
- Decorators and closures
4. Working With APIS
- Making API requests (e.g.. using requests library)
- Parsing JSON responses
5. Database Interaction
- Basics of database connectivity (e.g., SQLite)
- CRUD operations with databases
6. Web Development Basics
- Introduction to web frameworks (e.g„ Flask. Django)
- Handling HTTP requests and responses
7. Testing and Debugging
- Writing test cases
- Debugging techniques

Expert Level:
1. Advanced Web Development
- RESTful APIs
- Authentication and authorization
- Front-end frameworks (e.g., React, Angular)
2. Concurrency and Parallelism
- Threading and multiprocessing
- Asyncio for asynchronous programming
3. Advanced Libraries and Frameworks
- Deep dive into popular libraries (e.g., Pandas, NumPy, TensorFlow)
- Customizing and extending frameworks
4. Security in Python
- Best practices for secure coding
- Handling common security vulnerabilities
5. Optimization and Performance
- Profiling and optimizing code
- Memory management and optimization techniques
6. Advanced Topics in Data Science
- Machine learning with Python (e.g„ scikit-learn)
- Data visualization with Matplotlib and Seaborn
7. Contributing to Open Source Projects
- Understanding open Source contribution workflows
- Collaborating on GitHub and other version control systems


## Introduction

<p>
Python is a general-purpose interpreted, interactive, object-oriented, and high-level programming language. It was created by Guido van Rossum during 1985- 1990. Like Perl, Python source code is also available under the GNU General Public License (GPL). This tutorial gives enough understanding on Python programming language.
</p>

### Features of Python
<p>
- Easy-to-learn </br>
- Easy-to-read </br>
- Easy-to-maintain </br>
- A broad standard library </br>
- Interactive Mode </br>
- Portable </br>
- Extendable </br>
- Databases </br>
- GUI Programming </br>
- Scalable </br>
</p>

### Applications of Python
<p>
- GUI based desktop applications </br>
- Image processing and graphic design applications </br>
- Web frameworks and applications </br>
- Enterprise and business applications </br>
- Operating systems </br>
- Language development </br>
- Prototyping </br>
</p>

## [Basics](basics.py)

Literals / Datatypes<br>
|-- Integer => int => int()<br>
|-- Float => float => float()<br>
|-- String => str => str()<br>
|-- Boolean => bool => bool()<br>

| Statement | Description |
| --- | --- |
| print() | 1. using end and sep <br> 2. using format <br> 3. using f-string <br> 3. using %  |
| input() | 1. using input() <br> 2. using eval() |
| type() | 1. using type()  |
| Operators | <br> 1. Arithmetic Operators <br> 2. Assignment Operators <br> 3. Comparison Operators <br> 4. Logical Operators <br> 5. Identity Operators <br> 6. Membership Operators <br> 7. Bitwise Operators |
| Control Flow | <br> 1. If-else <br> 2. For <br> 3. While <br> 4. Break <br> 5. Continue <br> 6. Pass|
| range() |  <br> 2. using range() <br> 2. using range() with step  <br> 2. using range() with start, stop and step |
| List Comprehension | <br> 1. using List Comprehension <br> 2. >using List Comprehension with if <br> 3. using List Comprehension with if-else <br> 4. using List Comprehension with nested if <br> 5. using List Comprehension with nested if-else |
|Concatenation and Replication |  <br> 2. Concatenation <br> 2. Replication |

### [Control Flow: Conditional statements and Loops](basics.py)

| Statement | Description |
| --- | --- |
| if-else | Conditional statement for decision-making |
| for | Loop for iterating over a sequence (can be a list, tuple, string, etc.) |
| while | Loop that continues as long as a certain condition is true |
| break | Exit the current loop prematurely |
| continue | Skip the rest of the code inside a loop for the current iteration |
| pass | Placeholder indicating that no action should be taken |


## Data Structures

| Data Structure | Mutability | Hashable |
| --- | --- | --- |
| [**List**](list.py)  | Mutable | No |
| [**Set**](set.py) | Mutable (can be made immutable) | Yes |
| [**Tuple**](tuple.py) | Immutable | Yes |
| [**Dictionary**](dictionary.py) | Mutable | Keys must be hashable |

| Data Structure | Ordered | Duplicates |
| --- | --- | --- |
| [**List**](list.py)  | Yes | Yes |
| [**Set**](set.py) | No | No |
| [**Tuple**](tuple.py) | Yes | Yes |
| [**Dictionary**](dictionary.py) | Yes (since Python 3.7) | No (for keys) / Yes (for values) |

- **Mutability:** Indicates whether the data structure can be modified after creation.
- **Hashable:** Determines if the structure can be used as a key in a dictionary or an element in a set.
- **Ordered:** Specifies whether the elements have a defined order.
- **Duplicate Elements:** Indicates whether the structure allows duplicate elements.
- **Use Cases:** Common scenarios where each data structure is typically used.
Note: The ordering of sets was introduced in Python 3.7. In earlier versions, sets were unordered.

| Data Structure | Create | Add | Remove |
| --- | --- | --- | --- |
| [**List**](list.py)  | [ ], list() | append( element ), insert( index, element ), extend( iterable ) | pop(), pop(index), remove( element ), clear() |
| [**Tuple**](tuple.py) | ( ), tuple() | Immutable | Immutable |
| [**Set**](set.py) | { }, set() | add( element ), update( iterable ) | pop(), remove( element ), discard( element ), clear() |
| [**Dictionary**](dictionary.py) | { }, dict() | update(key=value) | pop( key ), popitem(), clear() |

| Data Structure | Modify                                  | Access                                              | Others                                                   |
| --------------- | ----------------------------------------| ---------------------------------------------------- | -------------------------------------------------------- |
| [**List**](list.py)         | `my_list[index] = new_value`,<br>`my_list[start:stop:step] = iterable` | `my_list[index]`,<br>`my_list[start:stop:step]`       | Iteration, `len(my_list)`, `my_list.count(element)`, `my_list.sort()`, `my_list.reverse()`, `my_list.copy()`, `max(my_list)`, `min(my_list)`, `sum(my_list)`, `enumerate(my_list)`, `list(iterable)`, `filter()`, `map()`, `reduce()`, List Comprehension |
| [**Tuple**](tuple.py)       | Not Applicable                          | `my_tuple[index]`,<br>`my_tuple[start:stop:step]`    | `len(my_tuple)`, `max(my_tuple)`, `min(my_tuple)`, `sorted(my_tuple)`, `sum(my_tuple)`, `zip(my_tuple)`, `count(my_tuple, element)`, `index(my_tuple, element)`, `filter()`, `map()`, `reduce()`, Reversed, Tuple Comprehension |
| [**Set**](set.py)         | Not Applicable                          | Iteration, `len(my_set)`, `max(my_set)`, `min(my_set)`, `sum(my_set)`, `sorted(my_set)`, `set()`, `zip(my_set)`, `my_set.copy()`, `isdisjoint()`, `issubset()`, `issuperset()`, `difference()`, `intersection()`, `union()`, `symmetric_difference()`, Set Comprehension |
| [**Dictionary**](dictionary.py)  | `my_dict[key] = new_value`,<br>`my_dict.update({key: new_value})` | `my_dict[key]`, `my_dict.keys()`, `my_dict.values()`, `my_dict.items()` | `len(my_dict)`, `type(my_dict)`, `my_dict.setdefault(key, default)`, `all(my_dict)`, `any(my_dict)`, `sorted(my_dict)`, `reversed(my_dict)`, `enumerate(my_dict)`, `my_dict.copy()`, `fromkeys(iterable)`, `haskeys(key)`, `iter(my_dict)`, `max(my_dict)`, `min(my_dict)`, `sum(my_dict)`, `filter()`, `map()`, `reduce()`, `zip(my_dict)`, Dictionary Comprehension |



## [Functions: Functions and Modular Programming ](functions_lambda.py)
| Function | Description |
| --- | --- |
| Function Definition | Defining a function using the `def` keyword |
| Function Arguments | Passing information to a function |
| Default Arguments | Providing default values for function parameters |
| Keyword Arguments | Passing arguments using the parameter names |
| Variable Length Arguments | Handling a variable number of arguments in a function |
| Anonymous Function (Lambda) | Creating small, anonymous functions using `lambda` |
| Recursion | Function calling itself, often used for solving problems recursively |

## [Strings](strings.py)
| Operation                 | Description                                      | Example                                          |
| ------------------------- | ------------------------------------------------ | ------------------------------------------------- |
| **String Creation**       | Creating strings with quotes or constructor      | `my_string = 'Hello'`<br>`my_string = str(123)`    |
| **Concatenation**         | Combining two or more strings                    | `result = string1 + string2` , `join([string1,string2])` , `f"{string1} {string2}"`|
| **Repetition**            | Repeating a string multiple times                | `result = string * 3`                            |
| **Indexing**              | Accessing characters by index                    | `char = my_string[0]`                            |
| **Slicing**               | Extracting a portion of the string               | `substring = my_string[start:end]`               |
| **Length**                | Finding the length of a string                   | `length = len(my_string)`                        |
| **String Methods**        | Various methods for manipulation                | `my_string.upper()`, `my_string.replace(old, new)`, `my_string.split(separator)`, `my_string.strip()` |
| **String Formatting**     | Formatting strings with placeholders or f-strings | `formatted_string = f"Hello, {name}!"`          |
| **Substring Check**       | Checking if a substring is present               | `contains_substring = substring in my_string`   |
| **String Comparison**     | Comparing strings lexicographically              | `result = string1 == string2`                   |
| **String Conversion**     | Converting other types to strings                | `string_representation = str(123)`              |
| **Escape Characters**     | Using special characters with backslashes        | `new_line = "This is a line.\nThis is a new line."` |

## [Lambda Functions](functions_lambda.py)
| Description | Lambda Example |
| --- | --- |
| Using lambda for simple expression | `square = lambda x: x**2` <br> `result = square(4)` |
| Using lambda with filter() for filtering elements | `numbers = [1, 2, 3, 4, 5]` <br> `filtered_numbers = list(filter(lambda x: x % 2 == 0, numbers))` |
| Using lambda with map() for applying a function to each element | `numbers = [1, 2, 3, 4, 5]`  <br> `squared_numbers = list(map(lambda x: x**2, numbers))` |
| Using lambda with reduce() for cumulative computation | `from functools import reduce`  <br> `numbers = [1, 2, 3, 4, 5]`  <br> `product = reduce(lambda x, y: x * y, numbers)` |

## [Iterators](iterators.py)
| Iterator Example | Description |
| --- | --- |
| `iterable = [1, 2, 3]`<br>`iterator = iter(iterable)` | Using iter() to create an iterator |
| `iterable = [1, 2, 3]`<br>`iterator = iter(iterable)`<br>`next(iterator)` | Using iter() with arguments to create and advance an iterator |
| `iterable = [1, 2, 3]`<br>`iterator = iter(iterable)`<br>`next(iterator)`<br>`def square(x): return x * x` | Using iter() with arguments and return value to create and advance an iterator |

## [Decorators](decorators.py)
| Decorator Example | Description |
| --- | --- |
| `@decorator` | Using basic decorator syntax |
| `@decorator(arg)` | Using decorator with arguments |
| `@decorator(arg, ret_val)` | Using decorator with arguments and return value |

## [Generators](generators.py)
| Generator Example | Description |
| --- | --- |
| `def simple_generator(): yield 1` | Creating a simple generator using `yield` |
| `def param_generator(x): yield x * 2` | Generator with arguments using `yield` |
| `def complex_generator(x): return x * 2` | Generator with arguments and return value using `yield` |

## [Closures](closures.py)
| Closure Example | Description |
| --- | --- |
| `def outer_function(): def inner_function(): return "Hello"` | Using nested function for closure |
| `def outer_function(x): def inner_function(y): return x + y` | Nested function with arguments for closure |
| `def outer_function(x): def inner_function(y): return x + y` | Nested function with arguments and return value for closure |


## [Classes and Objects](class_objects.py)
| Concept | Description |
| --- | --- |
| Class | Defining a class in Python |
| Object | Creating an object from a class |
| Constructor | Using `__init__` for initializing objects |
| Self | Understanding the use of `self` in class methods |
| Instance Variables | Creating variables specific to instances |
| Class Variables | Defining variables shared by all instances |
| Static Methods | Creating static methods in a class |
| Inheritance | Implementing inheritance in classes |
| Overriding Methods | Overriding methods in a subclass |
| Data Hiding | Using double underscores for data hiding |

## [Modules](Modules.py)
| Module Feature | Description |
| --- | --- |
| Importing Modules | Importing an entire module using `import` |
| Importing from Modules | Importing specific items from a module |
| Importing Specific Items | Selectively importing specific items |
| Importing with Alias | Importing with an alias for brevity |
| Importing Everything | Importing all items from a module using `*` |

## [File Handling](File_Handling.py)
| File Operation | Description |
| --- | --- |
| Opening a File | Opening a file using `open()` |
| Reading a File | Reading content from a file |
| Writing to a File | Writing content to a file |
| Appending to a File | Appending content to an existing file |
| Closing a File | Closing an open file using `close()` |

## [Exception Handling](Exception_handling.py)
| Exception Handling | Description |
| --- | --- |
| Try | Using `try` block to handle potential exceptions |
| Except | Catching specific exceptions using `except` |
| Finally | Executing code in `finally` block regardless of exceptions |
| Raise | Manually raising exceptions using `raise` |
| Assert | Using `assert` for debugging and error checking |

## [Regular Expressions](Regular_expressions.py)
| Regex Operation | Description |
| --- | --- |
| Match | Matching patterns at the beginning of a string |
| Search | Searching for a pattern in a string |
| Sub | Replacing matched patterns with a specified string |
| Subn | Replacing matched patterns with a tuple containing (new_string, count) |
| Group | Capturing groups in a regular expression |
| Flags | Using flags for modifying regular expression behavior |

## [Multithreading](Multithreading.py)
| Multithreading Feature | Description |
| --- | --- |
| Thread | Creating a thread in Python |
| Starting a Thread | Starting a thread using `start()` method |
| Starting a Thread with Arguments | Passing arguments to a thread |
| Starting a Thread with Keyword Arguments | Passing keyword arguments to a thread |
| Starting a Thread with Both Arguments and Keyword Arguments | Using both arguments and keyword arguments in a thread |

## [Database](Database.py)
| Database Operation | Description |
| --- | --- |
| Connecting to a Database | Establishing a connection to a database |
| Creating a Table | Creating a table in a database |
| Inserting Data | Inserting data into a database table |
| Selecting Data | Retrieving data from a database table |
| Updating Data | Modifying existing data in a database table |
| Deleting Data | Removing data from a database table |
|[Database](Database.py) |   1. Connecting to a Database </br> 2. Creating a Table </br> 3. Inserting Data </br> 4. Selecting Data </br> 5. Updating Data </br> 6. Deleting Data |


## Python - Different Connections
| Connection | Description |
| --- | --- |
| MySQL | 1. Connecting to MySQL </br> 2. Creating a Table </br> 3. Inserting Data </br> 4. Selecting Data |
| MongoDB | 1. Connecting to MongoDB </br> 2. Creating a Collection </br> 3. Inserting Data </br> 4. Selecting Data |
| SQLite | 1. Connecting to SQLite </br> 2. Creating a Table </br> 3. Inserting Data </br> 4. Selecting Data |
| PostgreSQL | 1. Connecting to PostgreSQL </br> 2. Creating a Table </br> 3. Inserting Data </br> 4. Selecting Data |
| XML | 1. Parsing XML </br> 2. Creating XML </br> 3. Modifying XML </br> 4. Deleting XML |
| JSON | 1. Parsing JSON </br> 2. Creating JSON </br> 3. Modifying JSON </br> 4. Deleting JSON |
| YAML | 1. Parsing YAML </br> 2. Creating YAML </br> 3. Modifying YAML </br> 4. Deleting YAML |
| CSV | 1. Reading CSV </br> 2. Writing to CSV </br> 3. Appending to CSV </br> 4. Deleting CSV |
| Excel | 1. Reading Excel </br> 2. Writing to Excel </br> 3. Appending to Excel </br> 4. Deleting Excel |

## Python - Web

| Web | Description |
| --- | --- |
|Web Scraping | 1. BeautifulSoup </br> 2. Scraping a Webpage </br> 3. Scraping Multiple Webpages |
|Networking | 1. Client </br> 2. Server |
|Sending Emails | 1. SMTP </br> 2. Sending a Plain Text Email </br> 3. Sending an HTML Email </br> 4. Sending an Email with Attachment |

## Python - GUI

| GUI | Description |
| --- | --- |
|GUI | 1. Label </br> 2. Button </br> 3. Entry </br> 4. Text </br> 5. Frame </br> 6. Checkbutton </br> 7. Radiobutton </br> 8. Listbox </br> 9. Menu </br> 10. Message </br> 11. OptionMenu </br> 12. Scale </br> 13. Scrollbar </br> 14. Toplevel |