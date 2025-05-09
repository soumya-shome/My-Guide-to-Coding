Attribute VB_Name = "Module1"
'The macros in this module are designed to illustrate some of the handy
'Range properties which give you access to a modified range, based on the
'original range. It is best to step through each of these while viewing
'the code and workbook window simultaneously. Use the F8 key to initiate
'step mode (or Debug/Step Into) then press F8 again to execute each
'subsequent line

Public Sub RangeClear()
'This simple utility sub just uses the Cells property
'with no parameters to refer to the entire worksheet range
'to clear all the contents and formatting. You can run this between
'each of the example subs in this module.

Application.Cells.Clear

End Sub

Public Sub RangeRow()

ActiveCell.Interior.Color = vbGreen

ActiveCell.EntireRow.Interior.Color = vbRed

End Sub


Public Sub RangeColumn()

ActiveCell.Interior.Color = vbGreen

ActiveCell.EntireColumn.Interior.Color = vbRed

End Sub

Public Sub RangeOffset()

Range("I3:K5").Interior.Color = vbGreen

Range("I3:K5").Offset(4, -2).Interior.Color = vbRed


End Sub

Public Sub RangeResize()

Range("I3:K5").Interior.Color = vbGreen

Range("I3:K5").Resize(, 4).Interior.Color = vbRed

End Sub

Public Sub RangeRegion()

ActiveCell.Interior.Color = vbGreen

ActiveCell.CurrentRegion.Interior.Color = vbRed

End Sub
