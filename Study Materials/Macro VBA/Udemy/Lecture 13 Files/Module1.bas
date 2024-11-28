Attribute VB_Name = "Module1"
'You can accomplish simple input and output in your macros by
'using the MsgBox and InputBox functions

Public Sub InputOutput()

'MESSAGE BOX---------------------------"
'We will explore more sophisticated uses for MsgBox in future lectures
'For now, the simple form of MsgBox involves only a single required
'parameter: PROMPT. This is simply a text string, that is, "text between quotes."
'MsgBox will display the prompt in a pop up dialog box with a single OK button.

MsgBox "This is message box."

'However, MsgBox will take almost anything you give it and convert it
'into the text equivalent for display. So even an arithemetic expression
'like this will work.
MsgBox 5 * 2    '(Will display the result = 10)

'Or you can retrieve properties, such as displaying whatever
'cell M1 contains...

MsgBox Range("M1").Value

'Or build a more complex expression by joining segments together
'using the "&" operator.

MsgBox "Cell M1 contains " & Range("M1").Value

'INPUT BOX---------------------------"
'Similar to Message Box, the Input box will prompt the user for input
'and return the input value to you. For this reason, it can only be
'used as a FUNCTION (unlike MsgBox which can be used as both SUB and
'FUNCTION, but more on that later).
'So, you should make it part of an assignment statement like this.

Range("M1").Value = InputBox("Whatever you enter here will go into cell M1.")

'Optional parameters allow you to customize the title of the input dialog box
'and the default text to appear in the input field.

Range("M1").Value = InputBox("Please type your name:", "My First InputBox", "Mark")

End Sub

Public Sub BMI()
'This sub will calculate Body Mass Index (BMI)
'BMI is used to help gauge whether you are at a healthy weight
'relative to your height. The formula used is like this:
'
'BMI = (weight * 703) / height^2

'Use an InputBox to request weight and store it temporarily in M1
Range("M1").Value = InputBox("Enter your weight in lbs.")

'Use another InputBox to request height and store it temporarily in M2
Range("M2").Value = InputBox("Enter your height in inches.")

'Now use the values in M1 and M2 to calculate BMI using the formula above
'Store the result in M3
Range("M3").Value = (Range("M1").Value * 703) / (Range("M2").Value) ^ 2

'Finally, use MsgBox to report the result to the user...
MsgBox "Your BMI is " & Range("M3").Value


End Sub
