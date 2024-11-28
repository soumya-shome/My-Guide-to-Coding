Attribute VB_Name = "Module2"
Option Explicit
'Note that the variable "bookCount" is declared in the other module. We
'can access it in this module because it is declared as global (or public).
Public Sub GetBookCount()

'report the number of workbooks that have been created so far
'using the CreateBooks sub...

MsgBox "You have created " & bookCount & " workbooks so far."

End Sub

