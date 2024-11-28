Attribute VB_Name = "Module1"
Option Explicit
'This module demonstrates several variations on the For...Each Loop.
'Use For...Each to loop through all of the items in a collection.
'This makes it useful for processing all the worksheets in a workbook,
'all open workbooks, or each invidual cell in a range.
'
Public Sub GroupHide()
'You must declare an object variable of whatever type the collection
'contains. For example, to loop thought the Worksheets, you need
'to declare a "Worksheet" type object variable.
Dim ws As Worksheet


'This will loop once for each item in the worksheets collection
'of the workbook containing this code.
'Each time through the loop, the variable "ws" will contain a
'reference to the next worksheet in the workbook.
'We can use this variable to check to see if cell B1 on that
'sheet is empty. If not, we consider this as a flag to hide
'the worksheet.
For Each ws In ThisWorkbook.Worksheets
    If ws.Range("B1").Value <> "" Then
        ws.Visible = xlSheetHidden
    End If
Next

End Sub
Public Sub GroupUnhide()
Dim ws As Worksheet

'This simply loops through all of the worksheets and insures that
'they are all visible.

For Each ws In ThisWorkbook.Worksheets
    ws.Visible = xlSheetVisible
Next

End Sub

Public Sub CreateBooks()
'Review of a simple For...Next loop. This is used to create 10
'new workbooks for use with the next sub...CloseAllExcept

Dim x As Integer

For x = 1 To 10
    Workbooks.Add
Next

'This will tile all the new workbook windows so we can see all of
'them on the screen.

Application.Windows.Arrange xlArrangeStyleTiled
End Sub

Public Sub CloseAllExcept()
Dim wb As Workbook

'Now we loop through the workbooks collection, closing all of the
'workbooks except this one, the one containing the macro.
'Note that you don't use equality operators to compare objects.
'You can use the "Is" operator to determine if two references
'point to the same object.

For Each wb In Workbooks
    If Not wb Is ThisWorkbook Then wb.Close
Next

'this will zoom the remaining window to fill the screen

Application.Windows.Arrange xlArrangeStyleVertical

End Sub

Public Sub CreatePattern()
'One very handy use of For...Each is to loop through a range as if
'it were a collection of single-cell ranges. This allows you to
'quickly process each individual cell in a multi-cell range.

'In this example, we demonstrate this by using the worksheet function
'RandBetween to fill each cell in Selection with a random color.
'ColorIndex takes a number between 1 and 56 to indicate a color from
'the fill palette.
Dim myCell As Range

For Each myCell In Selection
    myCell.Interior.ColorIndex = WorksheetFunction.RandBetween(1, 56)
Next

End Sub

