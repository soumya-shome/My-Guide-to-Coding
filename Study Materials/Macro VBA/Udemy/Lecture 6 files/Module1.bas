Attribute VB_Name = "Module1"
Sub ConvertToValues()
Attribute ConvertToValues.VB_ProcData.VB_Invoke_Func = " \n14"
'A short macro that will convert the selected range of formulas to values

    'Call the Copy method of the Selection object, ex: 'Object_name.Method'
    'Remember Selection is of type RANGE, and all ranges have a Copy method.
    
    Selection.Copy
    
    'Call the PasteSpecial method of the Selection object
    'This method requires parameters to provide additional information about the paste
    'The macro recorder uses named parameters, separating the name from the value with a := like this "name:=value"
    
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks:=False, Transpose:=False
    
    'This method call to PasteSpecial would also work, that is, without the names (named parameters are optional)
    '
     'Selection.PasteSpecial xlPasteValues, xlNone, False, False
    
    'Set the CutCopyMode property of the Application object to the value FALSE
    'this will eliminate the animated selection marquee that appears around the selected range
    Application.CutCopyMode = False

End Sub
