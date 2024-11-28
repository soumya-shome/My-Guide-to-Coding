Attribute VB_Name = "Example1"
Option Explicit

Public Sub GetType()
'Using the TypeName() function to determine the data type of a variable, property or constant
Dim myVar As Long


MsgBox TypeName(ActiveCell.Value)

MsgBox TypeName(myVar)

MsgBox TypeName("This is a string")

End Sub

Public Sub Classify1()

'This will label the data type in the ActiveCell in the ajacent cell

ActiveCell.Offset(0, 1).Value = TypeName(ActiveCell.Value)

'Using a multiple if..else construct to check for multiple conditions
'in this case, data types, and fills each one with a different color

If TypeName(ActiveCell.Value) = "Double" Then
    ActiveCell.Interior.Color = vbRed
ElseIf TypeName(ActiveCell.Value) = "String" Then
    ActiveCell.Interior.Color = vbGreen
ElseIf TypeName(ActiveCell.Value) = "Date" Then
    ActiveCell.Interior.Color = vbBlue
ElseIf TypeName(ActiveCell.Value) = "Boolean" Then
    ActiveCell.Interior.Color = vbYellow
Else
   ActiveCell.Interior.Color = vbWhite
End If

End Sub

Public Sub Classify2()
'performs the same function as the sub above,
'except uses the Select..Case statement.
'These statements (If and Select..Case) can be used interchangably,
'but often Select..Case is easier and more flexible when
'you have many conditions

ActiveCell.Offset(0, 1).Value = TypeName(ActiveCell.Value)

Select Case TypeName(ActiveCell.Value)
    
    Case "Double"
        ActiveCell.Interior.Color = vbRed
    
    Case "String"
        ActiveCell.Interior.Color = vbGreen
        
    Case "Date"
        ActiveCell.Interior.Color = vbBlue
        
    Case "Boolean"
        ActiveCell.Interior.Color = vbYellow
        
    Case Else   'if none of the above are satisfied, this line will execute
        ActiveCell.Interior.Color = vbWhite
    
End Select

End Sub


