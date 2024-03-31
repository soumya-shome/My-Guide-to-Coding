Attribute VB_Name = "Module2"
Sub ToggleGrid()
Attribute ToggleGrid.VB_ProcData.VB_Invoke_Func = " \n14"
'In this example, we recorded a simple macro to turn off the gridlines, just to see
'which object and property or method were involved. This can save you the time of searching
'help in order to discover this.

'The macro recorder produces the following line of code...

'ActiveWindow.DisplayGridlines = False

'Now, to make this macro more useful, we can change it to a toggle switch, to turn
'the gridlines either on or off every time we run it. To produce this effect,
'we simply place the same property (which will be either TRUE or FALSE) on both sides
'of the assignment statement, and use the Not keyword to reverse the value.

ActiveWindow.DisplayGridlines = Not ActiveWindow.DisplayGridlines
    
'This is our first simple example of how we can use elements of the VBA language
'-- in this case, the word Not -- to manipulate the Object library. In the next part
'of the course we will begin to explore the other elements of the language
'which will give us even greater control over the Excel Object Library.
    
End Sub
