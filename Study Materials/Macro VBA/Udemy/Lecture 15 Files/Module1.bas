Attribute VB_Name = "Module1"
'If you select Tools/Options... and Require Variable Declaration...
'... Option Explicit will be entered for you automatically when you
'create a new code module. This will enforce good programming practice
'requiring you to declare your variables
Option Explicit
'
'This first sub uses a Worksheet type variable to hold a reference to
'a new worksheet created with the Worksheets.Add method.
Public Sub CreateSheet()
Dim ws As Worksheet     'Variable of type Worksheet

'Object variable assignment works like any other variable assignment EXCEPT
'the line must begin with the word "Set"...

Set ws = ThisWorkbook.Worksheets.Add

'Now we can use this reference to the newly created sheet,
'in this case to place a time and date stamp (using the VBA =Now() function)
'in cell A1, and then resize the column to fit the cell entry...

ws.Range("A1").Value = Now()
ws.Range("A1").EntireColumn.AutoFit

'...and finally, color the sheet tab of the new sheet Red
ws.Tab.Color = vbRed

End Sub
'This sub performs a simple but common task in Excel, appending data to
'the bottom of a list. In this example we use a Range type object variable
'to manipulate the data range to find the first empty row.
Public Sub AppendList()
Dim myRange As Range

'Starting in A1, the CurrentRegion property will return a range containing
'all of the contiguous rows and columns of data. We will store that range
'in the variable myRange, and then manipulate it to add one extra row
'for the new name.

Set myRange = Range("A1").CurrentRegion   'Remember, you must begin the line with "Set"

'We use the Resize property to get a new range resized to the new number
'of rows and columns we specify. The new number of rows is just the current
'number of rows plus 1. We omit the new number of columns because we are not
'going to change the number of columns.
'We reassign the newly resized range to myRange.

Set myRange = myRange.Resize(myRange.Rows.Count + 1)

'Now myRange contains one additional empty row where we will place
'the new name. We can use the Cells property to provide the row
'and column index of the cell we want within myRange. myRange.rows.count
'means "the last row". In column 1 of the range we place First name (E4)
'and in column 2 of the range we place Last name (E6).

myRange.Cells(myRange.Rows.Count, 1).Value = Range("E4").Value
myRange.Cells(myRange.Rows.Count, 2).Value = Range("E6").Value

'You can use variations of this basic technique any time you have
'the need to append new data to a table of existing data.
End Sub
