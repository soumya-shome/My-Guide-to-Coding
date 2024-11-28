Attribute VB_Name = "Module1"
'A collection object is used to manage multiple objects of the same type
'Properties that contain collections are by convention named with the plural
'form of whatever object type they manage. For example the WorksheetS collection
'manages Worksheet objects. The WorkbookS collection manages Workbook objects.
'These code examples demonstrate how the Worksheet collection is used.
'
Public Sub UsingCollections()

'When you refer to a cell by its address there is potential ambiguity, since
'a workbook can contain multiple sheets. For example, this one has 3 Range A1s.
'If you don't specify which sheet, you will refer to the range on the ACTIVE sheet.
'The active sheet is the sheet that is frontmost in the workbook, in the frontmost
'window. You can explicitly refer to the active sheet as well. Therefore the
'following three lines are identical:

Range("A1").Value = "This is A1"
ActiveSheet.Range("A1").Value = "This is A1"
Application.ActiveSheet.Range("A1").Value = "This is A1"

'If you want to refer to some other sheet than the active sheet, you can use the
'Worksheets collection. This line refers to A1 in the second worksheet in the
'workbook.

Worksheets(2).Range("A1").Value = "This is A1 on sheet 2"

'Note that Worksheets is a property of Application, so this line is the same as...

Application.Worksheets(2).Range("A1").Value = "This is A1 on sheet 2"

'Don't confuse the NUMBER of the sheet in the collection, with the NAME of the
'sheet (which may contain a number). Note in this workbook, Worksheets(2) is actually
'named "Sheet3". NAME is whatever appears in the sheet tab.

'If you rename a sheet tab, that name can be used in your code like this...

Worksheets("Lecture10").Range("A1").Value = "This is A1 on sheet 2"

'Refering by name will work, even if the sheet tabs are rearranged, or if
'you add or delete sheets (as long as you don't delete the sheet with the
'name you are refering to).

'If you look in the project window, each Sheet object is followed by 2 names:
'Sheet1 (Sheet1)
'Initially they are the same, but if you rename a sheet tab the new name
'appears in the parenthesis:
'Sheet2 (Lecture10)

'I will sometimes refer to this as a front-of-house name (the name in the sheet tab)
'and the back-of-house name, which doesn't change when you change the sheet tab.
'You can bypass the collection and use the back-of-house name like this...

Sheet2.Range("A1").Value = "Original Sheet2 A1"

'While this is handy, and I may use it occaisionally in my examples, most of the time
'I will use the collection with the sheet tab name. I find this is least confusing
'for most people when the name in their code window matches the name in the sheet tab.

End Sub
