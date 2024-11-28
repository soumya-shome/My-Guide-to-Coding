#print hello world
print("Hello World") #Hello World

#declare variable  of each type
x = 1
y = 1.0
z = "1.0"
a = True

#check type of each variable
print(type(x)) #<class 'int'>
print(type(y)) #<class 'float'>
print(type(z)) #<class 'str'>
print(type(a)) #<class 'bool'>

#convert variable to other type
print(float(x)) #1.0
print(int(y)) #1
print(int(z)) #ValueError: invalid literal for int() with base 10: '1.0'
print(str(x)) #1
print(bool(x)) #True

#------------------------------------------------------------------------

#print statement using format{}
print("x is {} and y is {}".format(x,y)) #x is 1 and y is 1.0

#print statement using f-string
print(f"x is {x} and y is {y}") #x is 1 and y is 1.0

#print statement using % operator
print("x is %d and y is %f"%(x,y)) #x is 1 and y is 1.000000

#print statement with multiple lines
print("""this is a
        multiline
        statement""")  
#this is a
#multiline
#statement

print("this is a \nmultiline \nstatement") 
#this is a
#multiline
#statement

#print statement with end
print("this is a", end=" ") 
#this is a


#print statement with sep
print("this", "is", "a", "statement", sep="-") #this-is-a-statement

print("single line statement") #single line statement

#------------------------------------------------------------------------

#take a inout from the user and print it
x = input("Enter a number: ") # Enter a number: 1
print(x) #1

#take a inout from the user and print it using eval()
x = eval(input("Enter a number: ")) # Enter a number: 1
print(x) #1

#------------------------------------------------------------------------

#example of each artithmatic operator
print(2+3) #addition (5) 
print(2-3) #subtraction (-1)
print(2*3) #multiplication (6)
print(2/3) #division (0.6666666666666666)
print(2//3) #floor division (0)
print(2**3) #exponent (8)
print(2%3) #modulus (2)

#example of each assignment operator
x = 1 #equal to 
x += 1 #addition
x -= 1 #subtraction
x *= 1 #multiplication
x /= 1 #division
x //= 1 #floor division
x **= 1 #exponent
x %= 1 #modulus

#example of each comparison operator
print(2==3) #equal to (false)
print(2!=3) #not equal to (true)
print(2>3) #greater than (false)
print(2<3) #less than (true)
print(2>=3) #greater than or equal to  (false)
print(2<=3) #less than or equal to (true)

#example of each logical operator
print(2==3) #equal to (false)
print(2!=3) #not equal to (true)
print(2>3) #greater than (false)
print(2<3) #less than (true)
print(2>=3) #greater than or equal to  (false)
print(2<=3) #less than or equal to (true)

#example of each identity operator
print(2 is 3) #is (false)
print(2 is not 3) #is not (true)

#example of each membership operator
print(2 in [1,2,3]) #in (true)
print(2 not in [1,2,3]) #not in (false)

#example of each bitwise operator
print(2&3) #bitwise and (2)
print(2|3) #bitwise or (3)
print(2^3) #bitwise xor (1)
print(~2) #bitwise not (-3)
print(2<<3) #bitwise left shift (16)
print(2>>3) #bitwise right shift (0)

#------------------------------------------------------------------------

#example of if-else statement
if 2==3:
    print("2 is equal to 3")
else:
    print("2 is not equal to 3")
#Output: 2 is not equal to 3

#example of if-elif-else statement
if 2==3:
    print("2 is equal to 3")
elif 2==2:
    print("2 is equal to 2")
else:
    print("2 is not equal to 3")
#Output: 2 is equal to 2

#example of nested if-else statement
if 2==3:
    print("2 is equal to 3")
else:
    if 2==2:
        print("2 is equal to 2")
    else:
        print("2 is not equal to 3")
#Output: 2 is equal to 2

#example of for loop
for i in range(5):
    print(i) #0 1 2 3 4

#example of while loop
i = 0
while i<5:
    print(i) #0 1 2 3 4
    i+=1

#example of break statement
for i in range(5):
    if i==3:
        break
    print(i) #0 1 2

#example of continue statement 
for i in range(5):
    if i==3:
        continue
    print(i) #0 1 2 4

#example of pass statement
for i in range(5):
    if i==3:
        pass
    print(i) #0 1 2 3 4

#example of for loop without range()
for i in [1,2,3,4,5]:
    print(i) #1 2 3 4 5

#example of for loop with range() and step
for i in range(1,5,2):
    print(i) #1 3

#example of for loop with range() and negative step
for i in range(5,1,-2):
    print(i) #5 3

#example of list comprehension
x = [i for i in range(5)]
print(x) #[0, 1, 2, 3, 4]

#--------------------------------------------------------------

#example of concatenation
x = [1,2,3]
y = [4,5,6]
print(x+y) #[1, 2, 3, 4, 5, 6]

#example of repetition
x = [1,2,3]
print(x*2) #[1, 2, 3, 1, 2, 3]

#example of string concatenation
x = "hello"
y = "world"
print(x+y) #helloworld
print(x+" "+y) #hello world

#example of string repetition
x = "hello"
print(x*2) #hellohello
