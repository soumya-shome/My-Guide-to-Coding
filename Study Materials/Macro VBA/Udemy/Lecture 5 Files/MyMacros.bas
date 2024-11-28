Attribute VB_Name = "MyMacros"
Sub AbsoluteRecording()
Attribute AbsoluteRecording.VB_ProcData.VB_Invoke_Func = " \n14"
'
' AbsoluteRecording Macro
'

'
    Range("A2").Select
    ActiveCell.FormulaR1C1 = "Absolute"
    Range("A3").Select
End Sub
Sub RelativeRecording()
Attribute RelativeRecording.VB_ProcData.VB_Invoke_Func = " \n14"
'
' RelativeRecording Macro
'

'
    ActiveCell.Offset(1, 0).Range("A1").Select
    ActiveCell.FormulaR1C1 = "Relative"
    ActiveCell.Offset(1, 0).Range("A1").Select
End Sub
Sub FillMonths()
'
' FillMonths Macro
' This is where the description appears.
'

'
    ActiveCell.Select
    ActiveCell.FormulaR1C1 = "Jan"
    ActiveCell.Select
    Selection.AutoFill Destination:=ActiveCell.Range("A1:A12"), Type:= _
        xlFillDefault
    ActiveCell.Range("A1:A12").Select
End Sub


