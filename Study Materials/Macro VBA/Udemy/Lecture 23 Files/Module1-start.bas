Attribute VB_Name = "Module1"
Option Explicit
Public Sub CreateBooks()
Dim x As Integer
Dim numString As String
Dim numBooks As Integer

numString = InputBox("How many new workbooks?")

If Not IsNumeric(numString) Then Exit Sub

numBooks = CInt(numString)

For x = 1 To numBooks
    Workbooks.Add
Next

'This will tile all the new workbook windows so we can see all of
'them on the screen.

Application.Windows.Arrange xlArrangeStyleTiled
End Sub

Public Sub CloseAllExcept()
Dim wb As Workbook

For Each wb In Workbooks
    If Not wb Is ThisWorkbook Then wb.Close
Next

'this will zoom the remaining window to fill the screen

Application.Windows.Arrange xlArrangeStyleVertical

End Sub


