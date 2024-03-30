# VBA

## Materials
https://cognizant.udemy.com/course/ultimate-excel-vba/learn/lecture/361330#overview
https://www.youtube.com/watch?v=yebsZPhpGzc
https://www.javatpoint.com/vba


## What is Macro VBA?
- VBA stands for Visual Basic for Applications, and event-driven programming language from Microsoft. It is now predominantly used with Microsoft Office applications such as MS Excel, MS-Word, and MS-Access.
- VBA allows you to automate various activities in Excel such as generating reports, preparing charts & graphs, doing calculations, etc. This automation activity is also known as Macro.
- VBA is a high-level language. VBA is a subset of Visual Basic 6.0 BASIC stands for Beginners All-Purpose Symbolic Instruction Code.

## Why VBA?
- VBA uses simple English statements to write the instructions.
- Creating the user interface is a drag, drop, and align the graphical user interface controls in VBA.
- VBA is very simple to learn and required basics programming skill.
- VBA enhance the functionality of excel by allowing you to make excel behave according to your need.

## Ways to open VBA
- Alt key and press the F11 key (Alt + F11).
- Step 1: Go to the Worksheet tab. <br> Step 2: Right-click on the tab.<br>Step 3: Then, select the View Code option.
- From Developer tab


# Data Types

| Type |Storage | Range of Values | 
| --- | --- | --- |
| Byte	| 1 byte | 0 to 255 | 
| Integer | 2 bytes | -32,768 to 32,767| 
| Long | 	4 bytes | -2,147,483,648 to 2,147,483,648 | 
| Single | 	4 bytes | -3.402823E+38 to -1.401298E-45 for negative values 1.401298E-45 to 3.402823E+38 for positive values. | 
| Double | 	8 bytes | -1.79769313486232e+308 to -4. | 94065645841247E-324 for negative values 4.94065645841247E-324 to 1.79769313486232e+308 for positive values. | 
| Currency | 	8 bytes	-922,337,203,685,477.5808 to 922,337,203,685,477.5807| 
| Decimal  |  12 bytes | | 
| **Data Type** | **Bytes Used** | **Range of values** |
| String (fixed-length) | Length of string | 1 to 65,400 characters | 
| String (variable length) | Length + 10 bytes| 0 to 2 billion characters| 
| Boolean| 2 bytes| True or False | 
| Date| 8 bytes	January 1, 100 to December 31, 9999 | 
| Object| 4 bytes	Any embedded object | 
| Variant (numeric)| 16 bytes| Any value as large as double| 
| Variant (text)| Length + 22 bytes| Same as variable-length string| 
|  User-defined | Varies| The range of each element is the same as the range of its data type. | 

## Variables

Variable is a specific memory used to hold values that are stored in a storage system and computer memory. You can use these values in the code, and it can be changed during script execution. The computer fetches these values from the system and shown in the output.
```
Sub Exercise ( )  
Dim << variable_name >> As << variable_type >>  
End Sub  
```
In VBA, variables are either declared implicitly or explicitly.
Implicitly: let's see through an example of a variable declared implicitly.
Label = javaTpoint
Volume = 10

Explicitly: let's see through an example of a variable declared explicitly.
Dim Num as Integer
Dim password as String

To declare a variable in VBA, you can use the "Dim" keyword in syntax.

## Constants

Constant is a memory location used to hold value like a variable, but you cannot be changed or modify it during the script execution.

If the user tries to change a Constant value, the script execution ends up with an error. Constants are declared the same way the variables are declared. To maintain a constant use the keyword Const in VBA.

**Rules**
- You must use a letter as the first character.
- You cannot use space, period (.), exclamation marks and the characters in the name.
- It cannot exceed 255 characters in length.
- You cannot use the reserved keywords of visual basic as the variable name.

Two Types of Contant
- Built-in or intrinsic provided by the application.
- Symbolic or user-defined.
You can specify the scope as private (by default) or the public.

```
Const << constant_name >> As << constant_type >> = << constant_value>>  
```

## Arrays

The array is a memory location which is capable of storing more than one value. All the values must be of the same data type. If you want to store a list of the same data type in a single variable, you can use an array to store.By using an array, you can mention the related values by the same name. You can use the subscript or an index to tell them apart. The individual values are referred to as the elements of the array. They are contiguous from index 0 to the highest index value.

**Types of Array**
1. Static: static displays have a fixed, pre-determined number of elements that can be stored. You cannot change the size of the data type of a static array. These are very useful when you work with known entities such as gender, number of days in a week, etc.
2. Dynamic: The dynamic array does not have a fixed, pre-determined number of elements that can be stored. These are very useful when working with entities that you cannot pre-determine the number.

**ReDim Statement :** ReDim statements are used to declare the dynamic array variables and are also used to allocate or reallocate the storage space.
```
ReDim [Preserve] varname (subscripts) [As type], [varname (subscripts) [As type]].  
```

| Part | Description |
| --- | --- |
|Preserve | (Optional) It used to preserve the data in an existing array when you change the size of the last dimension.
| varname |(Required) It is the name of the variable.
| Subscripts |(Required) It is the dimensions of an array variable. It may be declared up to 60 multiple dimensions. The subscripts argument uses the following syntax:<br><code> [lowerTo] upper, [[lowerTo] upper], ....... </code> <br> The lower bound of an array is controlled by an option base statement when no explicitly stated in lower. If no option base statement is present, then the lower bound is zero. |
| Type | (Optional) It is the data type of the variable. It may be Byte, Boolean, Long, Integer, Single, Double, Currency, Date, String, Object, Variant, a user-defined or an object type. | 

The ReDim statement is used to size or resize a dynamic array which is already declared by using a private, public or Dim comment with empty parentheses.You can use the ReDim statement frequently to change the number of an element and the dimensions in an array. You cannot declare an array of one data type. If the array is contained in a variant, then the type of elements can be changed by using an As type. If you are using the preserve keyword, there is no permission to change the data type.

**Array Dimensions**
1. One Dimension: the array is used only one index in the one dimension.
```
Dim agecount (100) As UInteger
```
2. Two Dimension: the array uses two indexes in the two-dimension.
```
Dim studentscounts (50, 5) As Byte
```
3. Multi dimension: the array is used more than two indexes in the multi-array.
```
Dim temperature (29, 30, 32) As single
```

## Operators

**Arithmatic Operators**
| Operator | Description | Example |
| --- | --- | --- |
| Addition (+) | You can add two number in an expression together with the addition operator. | `Dim x As Integer` <br> `x = 10 + 5` |
| Subtraction (-) | You can subtract the two numbers in an expression together with the subtraction operator. | `Dim x As Integer  `<br>`x = 20 - 15 `|
| Negation (~) | Negation also uses the subtraction operator, but with only one number or operand. | `Dim x As Integer = 50 `<br> `Dim y As Integer  `<br>`y = -x  `|
| Multiplication (*) | You can multiply the two numbers in an expression together with the multiplication operator. | `Dim x As Double  `<br>`x = 10 * 55.23  ` |
|Division (/) | You can divide the two numbers in an expression together with the division operator.The divisor and the dividend both must be integral types (Byte, SByte, Short, UShort, Integer, UInteger, Long, and ULong) for this operator. First, all other types must be converted to an integral type. | `Dim x As Double` <br> `X = 50 / 5`|
|Exponentiation (^) | Exponentiation operator is used to raising a number to the power of another number.| `Dim y As Double`<br>`z = 4 ^ 2  ` |
|Modulus Operator (Mod) | modulus arithmetic is performed using the Mod operator. This operator dividing the divisor into the dividend an integral number of times and returns the remainder.If divisor and dividend both are integral types, then the return value is integral. And if the divisor and dividend both are the floating-point types then return value is also a floating-point. | `Dim p As Integer = 100`<br>`Dim q As Integer = 6`<br>`Dim r As Integer`<br>`r = p Mod q`|

**Bit-Shift Operation**
A bit-shift operation is to perform an arithmetic shift on a bit pattern. This pattern is contained in the operand on the left. And the operand on the right specifies the number of positions to shift the pattern. You can shift the pattern into the right with >> operator or into the left with << operator. The data type of the pattern operand is Byte, SByte, Short, UShort, Integer, UInteger, Long, or ULong. Arithmetic shifts are not circular, means the bits shifted off one end of the result are not redefined at the other end. The vacated positions of the bit by a shift are set as follows:
- 0 for the arithmetic left shit.
- 0 for the arithmetic right shift of a positive number.
- 0 for the arithmetic right shift of the unsigned data type (Byte, UShort, Uinteger, ULong).
- 1 for the arithmetic right shift of the negative number (SByte, Integer, Short, or Long).

```
Dim lResult, rResult As Integer  
Dim pattern As Integer = 15  
' The low-order bits of the pattern are 0000 1100.   
lResult = pattern << 3  
' A left shift of 3 bits produces a value of 96.  
rResult = pattern >> 2  
' A right shift of 2 bits produces a value of 3.   
```

**Bitwise Operations**
In addition to being logical operators, And, Or, Not, and Xor also perform bitwise arithmetic when used on numeric values.

**String Operators**
The string data is used to hold a sequence of characters that can consist of numbers, alphabets, special characters (symbols) or all of them.
String operators are used to manipulating string data.
A variable is said to be a string if it is enclosed within double quotes ("").

```
VariableName = "String"
```

Example
```
Str1 = "String" (only Alphabets)  
Str2 = "145.32" (only Numbers)  
Str3 = "!@#$" (only symbols or special characters)  
Str4 = "Mar-1997" (character (Mar), symbol (-), number (1997), has all of above)  
```

| String Operator | Description | Example |
| --- | --- | --- |
| Concatenate (&) | This operator is used to concatenate the two strings or values together. | `"Mary" & "Kom"` |
