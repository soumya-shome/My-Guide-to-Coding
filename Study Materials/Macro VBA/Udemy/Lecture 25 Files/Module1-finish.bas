Attribute VB_Name = "Module1"

Option Explicit
'This sub takes two string type parameters for first and last name
'and adds them to the bottom of the list in the first two columns
'of the sheet named "List"
Public Sub AppendList(fName As String, lName As String)
Dim myRange As Range

'Begin in cell A1 and use currentregion to find all of the rows that currently
'contain data, and assign this range to the variable myRange
Set myRange = ThisWorkbook.Worksheets("List").Range("A1").CurrentRegion

'Resize this range by one more row, to include one empty row at the bottom
Set myRange = myRange.Resize(myRange.Rows.Count + 1)

'now use the cells property, to index in to the last row of myRange
'column 1 = first name
'column 2 = last name
myRange.Cells(myRange.Rows.Count, 1).Value = fName
myRange.Cells(myRange.Rows.Count, 2).Value = lName

End Sub
'
'This is the "Main" sub, run whenever the activecell is within any range containing "lastname,firstname" data.
Public Sub AddNames()
Dim myRange As Range      'the range containing data to loop through
Dim myCell As Range        'the for each looping variable
Dim first As String         'string to hold first name
Dim last As String          'string to hold last name

'Use the activecell and current region to get the entire range containing data
Set myRange = ActiveCell.CurrentRegion


'loop through each cell one at a time and parse out the name data
For Each myCell In myRange

    last = Left(myCell.Value, InStr(myCell.Value, ",") - 1)     'Extract everthing to the left of the comma
    first = Mid(myCell.Value, InStr(myCell.Value, ",") + 1)     'Extract everything following the comma
    
    AppendList first, last                'Call the sub Appendlist, and pass the first and last names to add

Next


End Sub
