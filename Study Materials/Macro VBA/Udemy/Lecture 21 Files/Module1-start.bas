Attribute VB_Name = "Module1"
Option Explicit
'Using a Do While loop to enter a series of values
'in a column
Public Sub EnterSeries1()
Dim x As Integer

x = 1

Do While x <= 10
    
    ActiveCell.Value = x
    ActiveCell.Offset(1, 0).Select
    
    x = x + 1
Loop

End Sub

