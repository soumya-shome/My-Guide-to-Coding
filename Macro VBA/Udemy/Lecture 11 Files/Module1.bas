Attribute VB_Name = "Module1"

Public Sub UsingCollections()
'There are several ways to reference Workbook objects if it is possible that more
'than one Workbook is open when your code is running.

'Unless you specify otherwise, VBA will default to the "Active Workbook", that is
'the one front most on the screen, containing the currently active cell.

'With or without the explicit reference, all three of the following lines are
'identical...

Worksheets("monday").Range("A1").Value = "sheet monday A1"

ActiveWorkbook.Worksheets("monday").Range("A1").Value = "sheet monday A1"

Application.ActiveWorkbook.Worksheets("monday").Range("A1").Value = "sheet monday A1"

'You can use the Workbooks collection to refer to one of many open workbooks.
'As with other collections, you can either use an index number (numbered in the
'order the workbooks were opened or created) or the workbook name.

'This line will refer to the 3rd worksheet of the 2nd workbook opened...
Workbooks(2).Worksheets(3).Range("A1").Value = "A1 on 3rd sheet of 2nd workbook opened"

'This line will refer to the worksheet named "friday" of the workbook named "Lecture11.xlsm"
Workbooks("Lecture11.xlsm").Worksheets("friday").Range("A1").Value = "A1 on sheet Friday of book Lecture11.xlsm"


'If you open a second workbook and run these two lines, you will get two different results,
'Depending on which workbook is active...

ThisWorkbook.Worksheets(1).Range("A1").Value = "This workbook"

ActiveWorkbook.Worksheets(1).Range("A2").Value = "Active workbook"

'With collections, and other properties which yield objects, you can chain together
'very specific, unambigous object references for clean, robust code...and that's the whole point!
Application.Workbooks("Lecture11.xlsm").Worksheets("friday").Range("A1").Interior.Color = vbRed

End Sub
