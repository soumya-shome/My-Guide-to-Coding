Attribute VB_Name = "BMImodule"
Option Explicit
'User-defined function to compute Body Mass Index
Public Function BMI(wtInLbs As Double, htInches As Double) As Double
Dim myBMI As Double

myBMI = (wtInLbs * 703) / (htInches) ^ 2

BMI = Round(myBMI, 1)
End Function
'--------------------------------------------------------
'This is the original CheckBMI sub
'Public Sub CheckBMI()
'Dim wt As Double
'Dim ht As Double
'
'wt = InputBox("Enter your weight in lbs.")
'
'ht = InputBox("Enter your height in inches.")
'
'MsgBox "Your BMI is " & BMI(wt, ht)
'
'End Sub
'-------------------------------------------------------
Public Sub CheckBMI()
Dim wt As Double
Dim ht As Double
Dim wtStr As String     'New variable to protect against input box errors
Dim htStr As String      'New variable to protect against input box errors
Dim myBMI As Double


'Since InputBox returns a string type, if it happens to be a value that cannot
'be converted to a number, the old code triggered an error. This is a fix to protect against
'that. Now we will put the value, whatever it is, into a string type variable, and then
'check to see if it is possible to covert into a number (using the IsNumeric() VBA function),
'before we attempt it. If it cannot be converted, we will exit the sub immediately using Exit Sub.

wtStr = InputBox("Enter your weight in lbs.")       'put the Inputbox result into a string-type variable first

If Not IsNumeric(wtStr) Then Exit Sub               'check to see if the string can be converted into a double, exit if not

htStr = InputBox("Enter your height in inches.")    'put the Inputbox result into a string-type variable first

If Not IsNumeric(htStr) Then Exit Sub               'check to see if the string can be converted into a double, exit if not

'If we know that both the height and weight strings can be converted into a double
'we use the CDble() function to covert each and assign it to a double type variable.
wt = CDbl(wtStr)
ht = CDbl(htStr)

myBMI = BMI(wt, ht)             'NOW, call the BMI function with doubles

MsgBox "Your BMI is " & myBMI



'Here are several variations on IF..THEN statements to give a more detailed response than
'simply the numeric BMI value...

'The first two versions, simply conditionally report some result
'In this case, if the BMI is greater than 30, states BMI is in the
'obese range...
'...............................................

'If myBMI > 30 Then MsgBox "Warning: you are classified as obese."
'...............................................
' This second version is identical, except that it allows for multiple statements
'to be executed conditionally...
'...............................................
'If myBMI > 30 Then
'    MsgBox "Warning: you are classified as obese."
'    ActiveCell.Value = myBMI
'End If


'An IF...ELSE construct allows you to execute one or more statements if the condition
'is TRUE, and another set of statements if the condition is FALSE.
'Here we report one messsage if BMI is in healthy range,
'another if not.

'Note also the use of the AND operator to combine two logical conditions
'TRUE AND TRUE = TRUE
'TRUE AND FALSE = FALSE
'FALSE AND FALSE = FALSE

'Likewise the OR operator works like this
'TRUE OR TRUE = TRUE
'TRUE OR FALSE = TRUE
'FALSE OR FALSE = FALSE

'...............................................
'If myBMI >= 18.5 And myBMI < 25 Then
'    MsgBox "You have a healthy BMI."
'Else
'    MsgBox "You should consult a dietician."
'End If
'...............................................


'Finally, ElseIf allows you to test for multiple logical conditions
'and execute any one that is true. Note the final Else executes if
'none of the previous conditions are satisfied.
If myBMI < 18.5 Then
    MsgBox "You are classified as underweight."
ElseIf myBMI >= 18.5 And myBMI < 25 Then
    MsgBox "You are classified as normal weight."
ElseIf myBMI >= 25 And myBMI < 30 Then
    MsgBox "You are classified as over weight."
Else
    MsgBox "You are classified as obese."
End If

End Sub
