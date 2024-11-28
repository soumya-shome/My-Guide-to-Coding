Attribute VB_Name = "BMImodule"
Option Explicit
'User defined funtion to compute Body Mass Index
Public Function BMI(wtInLbs As Double, htInches As Double) As Double
Dim myBMI As Double

myBMI = (wtInLbs * 703) / (htInches) ^ 2

BMI = Round(myBMI, 1)
End Function

Public Sub CheckBMI()
Dim wt As Double
Dim ht As Double

wt = InputBox("Enter your weight in lbs.")

ht = InputBox("Enter your height in inches.")

MsgBox "Your BMI is " & BMI(wt, ht)

End Sub
