Attribute VB_Name = "Practice"
Option Explicit
'User-defined functions are very similar to a normal Sub
'macro, except that 1) a function returns a result and
'2) functions can be used in the Worksheet in the same
'way as normal Excel functions.
'

Public Function Greeting(name As String) As String
'This function takes a single string as a parameter, for
'a person's name, and then returns as a result a string
'greeting that person. To return a result from a function,
'all you do is assign a value to it in the same way you would
'assign a value to a variable.

Greeting = "Hello, " & name & ", how are you today?"

End Function

Public Sub TestFunction()
'We can use this simple sub to test our user-defined functions
'in VBA, by placing the result of the function in a MsgBox.
'We can also test them in the worksheet by entering them in a cell
'like any other function.

MsgBox Greeting("Ariel")

End Sub

Public Function MyTimer() As Double
'Although you cannot use VBA functions directly in the worksheet,
'you can use a technique like this to "wrap" the VBA function inside of
'a user-defined function that you can use in the worksheet.
'Here we make the Timer() function available in the worksheet by wrapping
'the function inside a custom function named "MyTimer()". (Do not try
'to use the exact same name for a custom function that is already used
'by a native VBA function.) The Timer() function returns the number of
'seconds that have elapsed since midnight.

MyTimer = Timer()

End Function
