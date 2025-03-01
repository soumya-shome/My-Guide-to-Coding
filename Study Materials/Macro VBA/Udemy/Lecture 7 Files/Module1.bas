Attribute VB_Name = "Module1"

Public Sub Lecture7()

'The following two lines are functionally identical...

ActiveCell.Value = "Active"

Application.ActiveCell.Value = "Active"

'...both will place the word "Active" into the current active cell.

'ActiveCell is actually a PROPERTY of the Application object
'Since properties "contain things" they can contain other objects,
'and in this case, the ActiveCell Property contains a RANGE object.
'Since there is ONLY ONE Application object, you can refer to any
'of its properties without expliciting writing "Application." in front
'of it. VBA will figure out that you are refering to a property of Application.

'This process of storing objects inside of properties of other objects
'is used extensively in the Excel object library (and all other application
'libraries). Consider the following line:

Application.ActiveCell.Interior.Color = vbRed

'This could be described thus...

'The APPLICATION object has a property named ActiveCell which contains a RANGE
'object, which has a property named Interior, which contains an INTERIOR
'object, which has a property named Color, which is given the value of
'vbRed. This has the effect of changing the fill color of the ActiveCell to red.

End Sub
