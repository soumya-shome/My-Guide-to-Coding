#Regular Expressions in Python

#Regular expressions are a powerful tool for various kinds of string manipulation.
#They are a domain specific language (DSL) that is present as a library in most modern programming languages,
#not just Python. They are useful for two main tasks:

#1. verifying that strings match a pattern (for instance, that a string has the format of an email address),
#2. performing substitutions in a string (such as changing all American spellings to British ones).

#In Python, regular expressions are supported by the re module. That module provides
#one function to compile regular expressions into objects, and then other functions
#that can be used on these objects to carry out a match or substitution.

#1. re.match() function
#This function attempts to match RE pattern to string with optional flags.

#Syntax:
#re.match(pattern, string, flags=0)

#Example:
import re
pattern = r"spam"

if re.match(pattern, "spamspamspam"):
    print("Match") 
else:
    print("No match")

#Output: Match

#2. re.search() function
#This function searches for first occurrence of RE pattern within string with optional flags.

#Syntax:
#re.search(pattern, string, flags=0)

#Example:
import re
pattern = r"spam"

if re.match(pattern, "eggspamsausagespam"):
    print("Match")
else:
    print("No match")

if re.search(pattern, "eggspamsausagespam"):
    print("Match")
else:
    print("No match")

#Output: No match
#        Match

#3. re.findall() function
#This function returns a list of all substrings that match a pattern.

#Syntax:
#re.findall(pattern, string, flags=0)

#Example:
import re
pattern = r"spam"

print(re.findall(pattern, "eggspamsausagespam"))

#Output: ['spam', 'spam']

#4. re.finditer() function
#This function returns an iterator that yields match objects for all the matches of a pattern in a string.

#Syntax:
#re.finditer(pattern, string, flags=0)

#Example:
import re
pattern = r"spam"

iterator = re.finditer(pattern, "eggspamsausagespam")
for match in iterator:
    print(match)

#Output: <_sre.SRE_Match object; span=(4, 8), match='spam'>
#        <_sre.SRE_Match object; span=(18, 22), match='spam'>

#5. re.split() function
#This function splits the given string by the occurrences of the pattern.

#Syntax:
#re.split(pattern, string, maxsplit=0, flags=0)

#Example:
import re
pattern = r"[0-9]+"

print(re.split(pattern, "There are 12 eggs, 30 breads, 100 cakes"))
#Output: ['There are ', ' eggs, ', ' breads, ', ' cakes']

pattern = r"[0-9]"
print(re.split(pattern, "There are 12 eggs, 30 breads, 100 cakes"))
#Output: ['There are ', '', ' eggs, ', '', ' breads, ', '', '', '', ' cakes']

print(re.split(pattern, "There are 12 eggs, 30 breads, 100 cakes", maxsplit=1))
#Output: ['There are ', '2 eggs, 30 breads, 100 cakes']

#6. re.sub() function
#This function replaces occurrences of the pattern in string with repl, substituting all occurrences unless max provided.

#Syntax:
#re.sub(pattern, repl, string, count=0, flags=0)

#Example:
import re
pattern = r"gr.y"

print(re.sub(pattern, "food", "grapy"))
#Output: grapy

pattern = r"gr"
print(re.sub(pattern, "food", "grapy"))
#Output: foodyapy

#7. re.subn() function
#This function does the same work as re.sub() function but returns a tuple of 2 items containing the new string and the number of substitutions made.

#Syntax:
#re.subn(pattern, repl, string, count=0, flags=0)

#Example:
import re
pattern = r"gr.y"

print(re.subn(pattern, "food", "grapy"))
#Output: ('grapy', 0)

pattern = r"gr"
print(re.subn(pattern, "food", "grapy"))
#Output: ('foodyapy', 1)

#8. re.escape() function
#This function returns a string with all non-alphanumeric characters backslashed.

#Syntax:
#re.escape(pattern)

#Example:
import re
print(re.escape("This is Awseome even 1 AM"))
#Output: This\ is\ Awseome\ even\ 1\ AM

print(re.escape("I Asked what is this [a-9], he said \t ^WoW"))
#Output: I\ Asked\ what\ is\ this\ \[a\-9\]\,\ he\ said\ \\\t\ \^WoW

#9. re.compile() function
#This function is used to compile a regular expression pattern into a regular expression object, which can be used for matching using its match(), search() and other methods, described below.

#Syntax:
#re.compile(pattern, flags=0)

#Example:
import re
pattern = re.compile(r"spam")

if pattern.match("spamspamspam"):
    print("Match")
else:
    print("No match")

#Output: Match

#10. re.purge() function
#This function clears the regular expression cache.

#Syntax:
#re.purge()

#Example:
import re
re.purge()
pattern = re.compile(r"spam")

if pattern.match("spamspamspam"):
    print("Match")
else:
    print("No match")

#Output: Match

# Metacharacters and their meanings with examples

#[]	A set of characters	"[a-m]" => matches any character from a to m
#\	Signals a special sequence (can also be used to escape special characters)	"\d" => matches a digit
#.	Any character (except newline character)	"he..o" => matches any character except newline
#^	Starts with	"^hello" => matches if string starts with hello
#$	Ends with	"world$" => matches if string ends with world
#*	Zero or more occurrences	"aix*" => matches a followed by zero or more x
#+	One or more occurrences	"aix+" => matches a followed by one or more x
#{}	Exactly the specified number of occurrences	"al{2}" => matches a followed by exactly 2 l
#|	Either or	"falls|stays" => matches falls or stays
#()	Capture and group

#Special Sequences and their meanings with examples

#\A	Returns a match if the specified characters are at the beginning of the string	"\AThe" => matches if the string starts with The
#\b	Returns a match where the specified characters are at the beginning or at the end of a word	r"\bain" r"ain\b" => matches if the string contains ain
#\B	Returns a match where the specified characters are present, but NOT at the beginning (or at the end) of a word	r"\Bain" r"ain\B" => matches if the string contains ain
#\d	Returns a match where the string contains digits (numbers from 0-9)	"\d" => matches if the string contains digits
#\D	Returns a match where the string DOES NOT contain digits	"\D" => matches if the string does not contain digits
#\s	Returns a match where the string contains a white space character	"\s" => matches if the string contains a white space character
#\S	Returns a match where the string DOES NOT contain a white space character	"\S" => matches if the string does not contain a white space character
#\w	Returns a match where the string contains any word characters (characters from a to Z, digits from 0-9, and the underscore _ character)	"\w" => matches if the string contains any word characters
#\W	Returns a match where the string DOES NOT contain any word characters	"\W" => matches if the string does not contain any word characters
#\Z	Returns a match if the specified characters are at the end of the string	"Spain\Z" => matches if the string ends with Spain

#Sets and their meanings with examples

#[arn]	=> matches if the string contains either a or r or n => Returns a match where one of the specified characters (a, r, or n) are present
#[a-n]	=> matches if the string contains any character between a and n => Returns a match for any lower case character, alphabetically between a and n
#[^arn]	=> matches if the string does not contain either a or r or n => Returns a match for any character EXCEPT a, r, and n
#[0123]	=> matches if the string contains any of the specified digits => Returns a match where any of the specified digits (0, 1, 2, or 3) are present
#[0-9]	=> matches if the string contains any digit between 0 and 9 => Returns a match for any digit between 0 and 9
#[0-5][0-9]	=> matches if the string contains any two-digit numbers from 00 and 59 => Returns a match for any two-digit numbers from 00 and 59
#[a-zA-Z]	=> matches if the string contains any character from a to z or A to Z => Returns a match for any character alphabetically between a and z, lower case OR upper case
#[+]	=> In sets, +, *, ., |, (), $,{} has no special meaning, so [+] means: return a match for any + character in the string


