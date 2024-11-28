Attribute VB_Name = "Module1"

Option Explicit

Public Sub AppendList()
Dim myRange As Range

Set myRange = Range("A1").CurrentRegion

Set myRange = myRange.Resize(myRange.Rows.Count + 1)

myRange.Cells(myRange.Rows.Count, 1).Value = Range("E4").Value
myRange.Cells(myRange.Rows.Count, 2).Value = Range("E6").Value

End Sub
   
