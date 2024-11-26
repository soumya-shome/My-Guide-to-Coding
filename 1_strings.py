# String Creation
my_string = 'Hello'
another_string = str(123)



# Concatenation
concatenated_string = my_string + ' World'
# Method 1: Using the + operator
string1 = "Hello"
string2 = "World"
result1 = string1 + " " + string2

# Method 2: Using the join() method
result2 = " ".join([string1, string2])

# Method 3: Using formatted strings (f-strings)
result3 = f"{string1} {string2}"

# Method 4: Using the % operator (deprecated in Python 3.6+)
result4 = "%s %s" % (string1, string2)

# Displaying the results
print("Result 1:", result1)
print("Result 2:", result2)
print("Result 3:", result3)
print("Result 4:", result4)
print("Result 5:", result5.iloc[0])



# Repetition
repeated_string = my_string * 3


# Indexing
first_char = my_string[0]


# Slicing
substring = my_string[1:4]



# Length
string_length = len(my_string)



# String Methods
uppercase_string = my_string.upper()
replaced_string = my_string.replace('o', '0')
split_string = my_string.split('l')
stripped_string = my_string.strip()



# String Formatting
name = 'Alice'
formatted_string = f"Hello, {name}!"



# Substring Check
contains_substring = 'lo' in my_string




# String Comparison
string1 = 'abc'
string2 = 'abc'
are_equal = string1 == string2



# String Conversion
number_as_string = str(123)




# Escape Characters
new_line = "This is a line.\nThis is a new line."




# Print Results
print(f"Original String: {my_string}")
print(f"Another String: {another_string}")
print(f"Concatenated String: {concatenated_string}")
print(f"Repeated String: {repeated_string}")
print(f"First Character: {first_char}")
print(f"Sliced Substring: {substring}")
print(f"String Length: {string_length}")
print(f"Uppercase String: {uppercase_string}")
print(f"Replaced String: {replaced_string}")
print(f"Split String: {split_string}")
print(f"Stripped String: {stripped_string}")
print(f"Formatted String: {formatted_string}")
print(f"Contains Substring: {contains_substring}")
print(f"Are Strings Equal: {are_equal}")
print(f"Number as String: {number_as_string}")
print(f"New Line:\n{new_line}")
