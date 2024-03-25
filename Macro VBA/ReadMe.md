# VBA

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