# VBA

## Materials
https://cognizant.udemy.com/course/ultimate-excel-vba/learn/lecture/361330#overview
https://www.youtube.com/watch?v=yebsZPhpGzc
https://www.javatpoint.com/vba

## Keyboard Shortcuts
| Keys | Function |
| --- | --- |
| Alt + F11 | Switch between VBA Studio and Sheet | 

## Extensions
Save/Export Macro codes as *.BAS
Save Excel workbook with Macro as *.xslm

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

# Objects

Excel Objects
|Object|Description|
|---|---|
|Application|Represents the entire Excel application.|
|Workbook|Represents an Excel workbook.|
|Worksheet|Represents a worksheet.|
|Range|Represents a cell, or a selection of cells.|
|Chart|Represents a chart in a workbook.|
|PivotTable|Represents a Pivot Table report on the worksheet.|
|Shape|Represents an object in the drawing layer, such as an AutoShape, freeform, OLE object, or picture.|

Object_Name.PROPERTY => Set properties

Object_Name.Method => Execute Methods


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
| **+** | Addition | `Dim x As Integer = 10 + 5` |
| **-** | Subtraction | `Dim x As Integer = 20 - 15` |
| **~** | Negation | `Dim y As Integer = -50` |
| **\*** | Multiplication | `Dim x As Double = 10 * 55.23` |
| **/** | Division | `Dim x As Double = 50 / 5` |
| **^** | Exponentiation | `Dim z As Double = 4 ^ 2` |
| **Mod** | Modulus | `Dim r As Integer = 100 Mod 6` |

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

**Logical Operators**
| Operator | Description | Example |
| --- | --- | --- |
| **AND** | Combines conditions. Returns True if all conditions are True, otherwise False. | `If Age > 10 And Age < 20 Then` |
| **OR** | Combines conditions. Returns True if any condition is True, otherwise False. | `If x = 10 Or y = 20 Then` |
| **NOT** | Inverts a condition. Returns True if the original condition is False, and vice versa. | `If NOT BooleanFlag = False Then` |

**Compression Operator**
Certainly! Here's a concise version of the table:

| Operator | Description |
| --- | --- |
| Equal (=) | Checks if two values are equal. | `If int x = int y then` |
| Not equal to (<>) | Checks if two values are not equal. | `If int x <> int y then`|
| Greater than (>) | Compares if the first value is greater than the second. | `If int x > int y then` |
| Greater than equal to (>=) | Compares if the first value is greater than or equal to the second. | `If int x >= int y then` |
| Less than (<) | Compares if the first value is less than the second. | `If int x < int y then` |
| Less than equal to (<=) | Compares if the first value is less than or equal to the second. | `If int x <= int y then` |

# Condition Statements

## Select (Switch) Case
VBA Select Case statement is used instead of multiple Nested If statements. The VBA Select Case makes the VBA program easy to understand and faster in execution time.The Select Case statement is an alternative of the If Else If statement. It is another way to select a value from a list of values.

```
Select Case test_expression  
Case condition_1   
Result_1  
Case condition_2  
Result_2   
.....  
.....  
Case condition_n  
Result_n  
Case Else   
Result_else  
End Select   
```
Explanation:
- test_expression: It is a string or numeric value that comparing to the list of the conditions.
- condition_1 to condition_n: These are the conditions that evaluated in the order listed. If a condition is true, it will execute the corresponding code and not execute the further conditions of the code.
- Result_1 to result_n: The code that is executed when a condition is true.
- Case Else: If no condition is met to be accurate, then the else statement will be executed in the code.

## If Then, If Else
If Then, If Then Else and If Else If statements allows the programmers to control the execution flow of a script or one of its sections.
### 1. If Then
```
If (Boolean_expression) Then  
    Statement 1  
    ........  
    ........  
    ........  
    Statement n  
End If  
```
**Example:**
```
Sub FixDate ()   
    myDate = #10/03/1997#   
    If myDate < Now Then myDate = Now   
End Sub  


Sub AlertUser (value as Long)   
    If value = 1 Then   
    AlertLabel.ForeColor = "yellow"   
    AlertLabel.Font.Bold = True   
    AlertLabel.Font.Italic = True   
  End If   
End Sub


Private Sub If_demo_Click ()  
     Dim x As Integer  
     Dim y As Integer  
     x = 20  
     y = 10  
     If x > y Then   
        MsgBox "x is greater than y"  
     End If   
End Sub  

Sub evenOdd ()  
    If Range ("X1") Mod 2 = 0 Then   
        MsgBox "X1 is even"  
    End If  
End Sub  
```

### 2. If Then Else
An If statement contains a Boolean expression that allows one or more statements, if the condition is True, the statements under If condition is executed. If the condition is false, the statement under the Else condition is executed.

```
If (Boolean_expression) Then  
Statement 1  
.........  
.........  
.........  
Statement n  
Else  
Statement 1  
.........  
.........  
Statement n  
End If  
```
**Example:**
```
Sub evenOdd ()  
If Range ("A1") mod 2 = 0 Then  
MsgBox "A1 is even"  
Else  
MsgBox "A1 is odd"  
End If  
End Sub


Private Sub If_demo_Click ()  
Dim x As Integer  
Dim y As Integer  
x = 20  
y = 40  
If x > y Then   
MsgBox "x is greater than y"  
Else  
MsgBox "y is greater than x"  
End If   
End Sub  


Dim score As Integer, result As String  
Score = Range ("A1").Value  
If score >= 60 Then  
Result = "Pass"  
Else  
Result = "Fail"  
End If  
Range ("B1").Value = result  
```

###  3. If Else If
```
If (Boolean_expression) Then  
Statement 1  
........  
........  
........  
Statement n  
ElseIf (Boolean_expression) Then  
Statement 1  
.........  
.........  
Statement n  
ElseIf (Boolean_expression) Then  
Statement 1  
.........  
.........  
Statement n  
Else  
Statement 1  
.........  
.........  
Statement n  
End If  
```

**Example:**
```
Private Sub If_demo_Click ()  
Dim x As Integer  
Dim y As Integer  
x = 40  
y = 40  
If x > y Then   
MsgBox "x is greater than y"  
ElseIf y > x Then  
MsgBox "y is greater than x"  
Else  
MsgBox "x and y are Equal"  
End If   
End Sub  

Sub Macro1()  
 btnVal = MsgBox("Press a button and program will tell which button was pressed?", 3, "Demo")  
   
   If btnVal = 1 Then  
   
      MsgBox "User pressed Yes!"  
   
   ElseIf btnVal = 2 Then  
   
      MsgBox "User Pressed No!"  
   
   Else  
   
      MsgBox "User Pressed Cancel!"  
   
   End If  
  
End Sub  
```

## Nested If
An If or ElseIf statement inside another If or ElseIf statement. The inner If statements execution is based on the outermost If statements. This enables VBScript to handle complicated conditions.
```
If (Boolean_expression) Then  
Statement 1  
........  
........  
........  
Statement n  
If (Boolean_expression) Then  
Statement 1  
.........  
.........  
Statement n  
ElseIf (Boolean_expression) Then  
Statement 1  
.........  
.........  
Statement n  
Else  
Statement 1  
.........  
.........  
Statement n  
End If  
Else  
Statement 1  
.........  
.........  
Statement n  
End If  
```

**Example:**
```
Sub Macro1()  
Dim sngMarks As Single  
sngMarks = 70  
If sngMarks >= 80 Then  
MsgBox "Excellent"  
End If  
If sngMarks >= 60 And sngMarks < 80 Then  
MsgBox "Good"  
End If  
If sngMarks >= 40 And sngMarks < 60 Then  
MsgBox "Average"  
End If  
If sngMarks < 40 Then  
MsgBox "Poor"  
End If  
End Sub  

Private Sub nested_If_demo_Click ()  
Dim x As Integer   
x = 30   
If x > 0 Then   
MsgBox "a number is a positive number"  
If x = 1 Then  
MsgBox "A number is neither prime nor composite"  
ElseIf x = 2 Then   
MsgBox "A number is the only prime even prime number"  
ElseIf x = 3 Then   
MsgBox "A number is the least odd prime number"  
Else   
MsgBox "The number is not 0, 1, 2, or 3"  
End If   
Else If x < 0 Then  
MsgBox "A number is a negative number"  
Else   
MsgBox "the number is zero"  
End If  
End Sub  
```
## Switch
To execute a group of statements depending upon the value of an Expression, then we use the Switch Case. Here, each value is called a Case, and the variable is being switched ON based on each case. Else statement case is executed if the test expression doesn't match with any of the Case specified by the user.

Case Else is an optional statement within the select Case. However, it is a good programming practice always to have a Case Else statement.
```
Select Case expression  
   Case expressionlist1  
      Statement 1  
      Statement 2  
      .................  
      .................  
      Statement n  
   Case expressionlist2  
      Statement 1  
      Statement 2  
      .................  
      .................  
      Statement n  
   Case expressionlistn  
      Statement 1  
      Statement 2  
      .................  
      .................  
      Statement n  
   Case Else  
      Elsestatement 1  
      Elsestatement 2  
      ....  
      ....  
End Select  
```

**Example:**
```
Private Sub switch_demo_Click ()  
Dim MyVar As Integer  
MyVar = 1  
Select Case MyVar  
Case 1  
MsgBox "A number is the least composite number"  
Case 2  
MsgBox "A number is the only even prime number"  
Case 3  
MsgBox "A number is the least odd prime number"  
Case Else   
MsgBox "unknown number"  
End Select  
End Sub   

Function GetGrade(StudentMarks As Integer)  
Dim FinalGrade As String  
  
Select Case StudentMarks  
  
Case Is < 33  
FinalGrade = "F"  
  
Case 33 To 50  
FinalGrade = "E"  
  
Case 51 To 60  
FinalGrade = "D"  
  
Case 61 To 70  
FinalGrade = "C"  
  
Case 71 To 90  
FinalGrade = "B"  
  
Case Else  
FinalGrade = "A"  
  
End Select  
GetGrade = FinalGrade  
  
End Function  
```
# Loops

## For Loops
It executed a sequence of statements multiple times and compressed the code that manages the loop variable. For loop uses a variable which cycle goes through a series of values within a specified range. The code inside the loop is then executed for each value in VBA.
```
For counter_variable = start_value To end_value  
........  
........  
[Block of code]  
.........  
.........  
Next conter_varaiable  
```

**Example:**
```
For i = 1 to 20  
Total = Total + iArray(i)    
Next i  

Sub forNext ()  
Dim i As Integer   
Dim iTotal As Integer   
iTotal = 0  
For i = 1 to 10  
      iTotal = I + iTotal  
Next i  
MsgBox iTotal  
End Sub  
```

## For Each Loop
It executes the block of code if there is at least one element that exists in the group and iterated for each element in a group.
```
For Each object_variable In group_object_variable  
........  
........  
[Block of code]  
........  
Next object_variable 
```

## Do While Loop
It executed as long as the condition is True or the loop should be repeated only when the situation is False.
```
The do...While loop statement   
Do   
........  
........  
[Block of code]  
........  
Loop while (condition)  
```

## Do Until Loop
It will be executed as long as the condition is False or the loop should be repeated only when the situation is True.

```
The Do...Until loop statement   
Do  
........  
........  
[Block of code]  
Loop Until [condition]  
```

## Loop control statements
Loop control statements can change execution from its normal sequence. When execution leaves a scope, all the remaining statements in the loop are NOT executed.

There are the following control statements supported by the VBA.
- Exit for statement: It terminates the For loop statements and transfers the execution to the statement immaterially following the loop.
- Exit do statement: It terminates the do-while statement and transfers the execution to the statement immediately following the loop.



ActiveCell => The Cell currently selected (`ActiveCell. `)
Selection => The current Selection
