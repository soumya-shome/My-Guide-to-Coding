Attribute VB_Name = "BMImodule"
Option Explicit
'In this module we have re-implemented our Body Mass Index calculating
'sub as a user-defined funtion. This way, we can also use the function in
'the worksheet to calculate BMI on a series of values, as is demonstrated
'in Sheet1 of this workbook.
'

Public Function BMI(wtInLbs As Double, htInches As Double) As Double
'We have changed the variables wtInLbs and htInches into parameters
'as we will now be passing those values into the function whenever we
'call it.

Dim myBMI As Double     'declare one variable to compute our BMI in

myBMI = (wtInLbs * 703) / (htInches) ^ 2

BMI = Round(myBMI, 1)   'Now, round and return the result
End Function

Public Sub CheckBMI()
'This sub replaces our previous BMI sub, but now uses the BMI user-defined
'function to calculate the BMI...
Dim wt As Double
Dim ht As Double

wt = InputBox("Enter your weight in lbs.")

ht = InputBox("Enter your height in inches.")

MsgBox "Your BMI is " & BMI(wt, ht)

End Sub
