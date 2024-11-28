Attribute VB_Name = "Module1"
Option Explicit

Public Sub MakeSheets1()
Dim myCell As Range
Dim newSheet As Worksheet

For Each myCell In Selection
    Set newSheet = ThisWorkbook.Worksheets.Add
    newSheet.Name = myCell.Value
Next

End Sub

