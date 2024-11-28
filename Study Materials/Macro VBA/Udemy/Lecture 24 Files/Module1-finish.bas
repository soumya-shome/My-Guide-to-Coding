Attribute VB_Name = "Module1"
Option Explicit
'This is our simple, simple sub. It attempts to create a series
'of worksheets, and name each one after the contents of each
'cell in the range. As explained on the worksheet, there are
'many things that can go wrong here.

'One of the dangers of unhandled errors (besides looking very
'unprofessional) is that users can inadvertently get thrown into
'the editor and debugger, where they could do serious damage.

'A simple error handler only needs to trap and report the error.
'More sophisticated error handlers may actually attempt to recover
'from the error.

Public Sub MakeSheets1()
Dim myCell As Range
Dim newSheet As Worksheet

For Each myCell In Selection
    Set newSheet = ThisWorkbook.Worksheets.Add
    newSheet.Name = myCell.Value
Next

End Sub

'The second sub makes a noble attempt at anticipating the potential error,
'such as selecting a shape instead of a range, and taking defensive action.
'While this might be advisable for the most common type of error, attempting
'to anticipate every error is impossible, and all you will end up doing is
'making your code extremely convoluted.

Public Sub MakeSheets2()
Dim myCell As Range
Dim newSheet As Worksheet

'See if the selection is a Range, and if not, tell the user and bail out
If TypeName(Selection) <> "Range" Then
    MsgBox "You must select a range of cells."
    Exit Sub
End If

'Could STILL run into problems down here..
For Each myCell In Selection
    Set newSheet = ThisWorkbook.Worksheets.Add
    newSheet.Name = myCell.Value
Next

End Sub
'
'And now for tempting-but-deadly solution...
'The statement "On Error Resume Next" tells VBA to ignore any line
'that causes an error, and continue on the next line as if nothing
'happened. The good news is that your macro will run uninterruped until
'completion. No messy errors, no confused users. Perfect, right?
'
'Wrong. Imagine this nightmare scenario:
'
'1. Your ignored error causes serious problems downstream. Consider a macro
'that changes a date, and then updates numerous reports accordingly. The macro
'hits an error that causes it to not change the date correctly, so it then
'proceeds to update all your reports based on a bogus date, and ends up making
'a mess of everything.
'
'2. Because the above error was not reported, and the macro SEEMED to run ok,
'you assume everything went fine. You proudly deliver your erroneous reports
'to your boss, bragging about how VBA has made you more accurate and productive
'than your less competent VBA-challenged colleagues. Your boss inspects the
'unintelligible reports and concludes you are in need of professional care.
'
Public Sub MakeSheets3()
Dim myCell As Range
Dim newSheet As Worksheet

'Guarenteed to run, but...

On Error Resume Next '<--- a one-way ticket to hell, man.

For Each myCell In Selection
    Set newSheet = ThisWorkbook.Worksheets.Add
    newSheet.Name = myCell.Value
Next

End Sub

'This last sub presents the simplest acceptable solution. You invoke error handling at the
'beginning of your sub (using On Error GoTo), and any error that occurs after that will
'cause execution to jump to the error handler where you report whatever details of the
'error might be helpful, and then gracefully exit.

Public Sub MakeSheets4()
Dim myCell As Range
Dim newSheet As Worksheet

'This next line should appear immediately AFTER variable declarations
'but BEFORE the first line of executable code. It says that if
'an error occurs anywhere in the sub, jump to to the label "ErrorHandler"
'(note you can use any name you like) and run the code in the error handler.

On Error GoTo ErrorHandler

For Each myCell In Selection
    Set newSheet = ThisWorkbook.Worksheets.Add
    newSheet.Name = myCell.Value
Next

Exit Sub   '<-- if everything runs error-free, you will exit here, BEFORE the error handler.

ErrorHandler:
    'As a minimum, you can report the number and description properties of the ERR object.
    'This contains information about the last error encountered.
    
    MsgBox "Sorry, an error occurred." & vbCrLf & "Number: " & Err.Number & vbCrLf & _
    "Description: " & Err.Description, , "Error"
    
End Sub

