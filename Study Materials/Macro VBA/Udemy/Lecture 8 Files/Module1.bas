Attribute VB_Name = "Module1"

Public Sub RangeExamples()
'There are many ways of referencing ranges in your macros
'Here are some examples. Each of these will place some text
'in the cell by way of the value property.

'The two we have already seen are Selection in ActiveCell.
'These are similar, except that Selection might refer to
'a multi-cell range, where as ActiveCell will always refer
'to the ONE and ONLY active cell. Note that if you have
'only one cell selected, then ActiveCell and Selection
'refer to the same cell.

Selection.Value = "Selection"

ActiveCell.Value = "ActiveCell"

'Another useful technique is to use the Range() property (Application.Range())
'The range property can take any cell reference (as a "text string") and
'return the corresponding range object...

Range("L3:N7").Value = "cell L3:N7"

'The range propery can also take a "named range", a range that you
'name in Excel using the Define Name command. In this workbook we named
'a range "lecture8" which we can refer to like this...

Range("lecture8").Value = "named range"

'Sometimes it is useful to refer to a range by a row and column index number.
'For this, you can use the Cells() property. (Application.Cells())
'Used as an application propery, cells counts the numbers of rows and columns
'from the upper left corner of the active worksheet. So the following code would
'place a value in the 5th row and 3rd column of the worksheet

Cells(5, 3).Value = "cells 5,3"

'Every range object ALSO has a Cells property. Used in this context, Cells references
'the row and column from the upper left hand corner of the range it is used on.
'For example, the following line would reference the 2nd row and 2nd column from the upper
'left corner of the named range "lecture8"...

Range("lecture8").Cells(2, 2).Value = "defined name 2,2"

'Finally, Cells used by itself, with now row and column paremeters provided, refers to the
'range of ALL cells. By careful with this, because many operations involving ALL cells will
'max out Excel's capacity. The following line can be used safely to set the fill color of the
'entire worksheet to Red...

Cells.Interior.Color = vbRed

'-----------------------------------------------------------------
'One final note on the difference between Selection and ActiveCell:
'You will note that typing ActiveCell followed by a "." will produce a list
'of range properties and methods, where as typing Selection followed by a "."
'will not.
'This is because ActiveCell will ALWAYS be a range, whereas Selection, might be
'on of several objects, for example, a graphical shape on the worksheet. This is an important
'reason why using Selection is risky and should be avoided. The macro recorder uses Selection
'extensively, and if a different object is "Selected" when you play a macro from when you
'recorded it, it will crash.

ActiveCell.Value = "ActiveCell"     '<---this will always work

Selection.Value = "Selection"       '<--this might not! What if something other than a range is selected?


End Sub


