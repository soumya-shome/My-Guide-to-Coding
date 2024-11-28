Attribute VB_Name = "Module1"
Option Explicit

Public Sub BMI()
Dim wtInLbs As Double
Dim htInches As Double
Dim myBMI As Double

wtInLbs = InputBox("Enter your weight in lbs.")

htInches = InputBox("Enter your height in inches.")

myBMI = (wtInLbs * 703) / (htInches) ^ 2

MsgBox "Your BMI is " & myBMI

End Sub

