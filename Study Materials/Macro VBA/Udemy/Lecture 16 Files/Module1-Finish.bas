Attribute VB_Name = "Module1"
Option Explicit

Public Sub BMI()
Dim wtInLbs As Double
Dim htInches As Double
Dim myBMI As Double

wtInLbs = InputBox("Enter your weight in lbs.")

htInches = InputBox("Enter your height in inches.")

myBMI = (wtInLbs * 703) / (htInches) ^ 2

'We modified this line of code to use the VBA Round
'function to we only receive one decimal place in our
'result...

MsgBox "Your BMI is " & Round(myBMI, 1)

End Sub


Public Sub UsingFunctions()
Dim myNum As Double

'VBA functions, like Excel worksheet functions, are said to
'"return a result." This means they are almost always used
'in a larger context, such as part of an assignment statement.

'Here the VBA Now() function places the current time and date
'(from the system clock) into the active cell value property.

ActiveCell.Value = Now()

'But you can also embed functions into expressions in other
'ways. Such as passing one as a paremeter to another function
'or method. In this example, passing Now() as a parameter
'to MsgBox() will display the current time and date in the
'Msgbox.

MsgBox Now()

'Some VBA functions, like Now(), have an identical Excel Worksheet
'function. Most,however, have no worksheet equivalent. Search
'VBA help for the complete list.

'Functions in VBA that have no parameters do not require empty
'parenthesis, unlike worksheet functions, which do. So in VBA,
'the following two statements are identical...

ActiveCell.Value = Now()
'and
ActiveCell.Value = Now

'I recommend including the empty parenthesis because it makes
'it easier to distinguish between function names and variable
'names.

'Like worksheet functions, many VBA functions take parameter
'values between the parenthesis, such as the RGB function,
'which takes three integer values between 0 and 255 for the
'amount of Red, Green and Blue respectively. This allows you
'more control over colors than simple color constants such
'as vbRed and vbBlue.

Selection.Interior.Color = RGB(147, 125, 239)

'Finally, you can use Excel Worksheet functions in VBA, by
'way of the WorksheetFunction property. The example below
'shows how to use the worksheet RandBetween() function to
'generate a random whole number between 1 and 100.

myNum = Application.WorksheetFunction.RandBetween(1, 100)

MsgBox myNum


End Sub
