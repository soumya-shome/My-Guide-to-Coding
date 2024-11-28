Attribute VB_Name = "Example1"
Option Explicit

Public Sub Classify1()

ActiveCell.Offset(0, 1).Value = TypeName(ActiveCell.Value)

If TypeName(ActiveCell.Value) = "Double" Then
    ActiveCell.Interior.Color = vbRed
ElseIf TypeName(ActiveCell.Value) = "String" Then
    ActiveCell.Interior.Color = vbGreen
ElseIf TypeName(ActiveCell.Value) = "Date" Then
    ActiveCell.Interior.Color = vbBlue
ElseIf TypeName(ActiveCell.Value) = "Boolean" Then
    ActiveCell.Interior.Color = vbYellow
Else
   ActiveCell.Interior.Color = vbWhite
End If

End Sub

