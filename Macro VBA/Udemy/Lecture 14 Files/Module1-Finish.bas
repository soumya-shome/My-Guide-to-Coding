Attribute VB_Name = "Module1"
'Using Option Explict at the top of your Modules will enforce variable
'declaration, which is STRONLY advised.
'Use Tools/Options... and check the "Require Variable Declaration" box to
'add Option Explicit automatically to all new code modules you create.
Option Explicit

''Original Body Mass Index macro using cells for temporary storage
'.................................................................
'Public Sub BMI()
'
'Range("M1").Value = InputBox("Enter your weight in lbs.")
'
'Range("M2").Value = InputBox("Enter your height in inches.")
'
'Range("M3").Value = (Range("M1").Value * 703) / (Range("M2").Value) ^ 2
'
'MsgBox "Your BMI is " & Range("M3").Value
'
'End Sub
'..................................................................
'New and improved BMI, using variables instead of worksheet cells
'Note this sub is "pure VBA" - no Excel or object library involved.
Public Sub BMI()
Dim wtInLbs As Double
Dim htInches As Double
Dim myBMI As Double

wtInLbs = InputBox("Enter your weight in lbs.")

htInches = InputBox("Enter your height in inches.")

myBMI = (wtInLbs * 703) / (htInches) ^ 2

MsgBox "Your BMI is " & myBMI

End Sub
 
Public Sub VariableTypes()
'This sub has no purpose, other than to illustrate which variable types
'to use for different situations...
'These are the most common simple variable types
Dim myInput As String
Dim gridState As Boolean
Dim ageInYrs As Integer
Dim distanceToSun As Long
Dim pi As Double
Dim anything As Variant

'String type for "text strings". The InputBox function returns a
'text string as its result, therefore this will work fine...
myInput = InputBox("Enter Something.")


'Boolean type for logical True/False values. The DisplayGridlines property
'is a boolean type, so we could temporarily hold that value in a variable
'like this...
gridState = ActiveWindow.DisplayGridlines


'a simple integer for "relatively small" whole numbers (no decimals)
ageInYrs = 35

'for larger whole numbers (greater than 32,767), use a long type
distanceToSun = 93000000

'for anything involving decimals, we will use a double, like this...
pi = 3.1416

'Finally, a variant can accomodate any data type, and will morph into the correct
'type based on what you assign to it. While this sounds handy, don't abuse this
'capability or you will end up with slow, buggy code that will be hard to
'fix and maintain. Variants should only be used in those rare situations where you
'may have no choice but to acommodate more than one data type. Most variable
'situations are far less ambigous.
anything = 5
anything = 5.5
anything = 5000000
anything = True
anything = "vba"

'To see the complete list and descriptions of data types in VBA
'search: "VBA data type summary" in Help. You should find a table of
'all the valid types.

End Sub


Public Sub ImplicitCovert()
'This sub is NOT used in the Lecture 14 screencast, but
'you can use it to experiment with implicit type conversions
'on your own.
'
'Step through this sub using F8 to see how VBA will
'perform implicit type conversions so that an assignment
'statement might succeed even though the value is of the wrong
'data type for the variable. Some will work, some won't.

'After you observe a failure, comment out that line, and step through
'again.

'First declare a handful of variables of different types
Dim myString As String
Dim myBool As Boolean
Dim myDouble As Double
Dim myInt As Integer
Dim myLong As Long

'Every assignment will work for a string variable, because
'"almost anything" can be coverted into a string

'String type variable holds "text"
myString = 0
myString = 5
myString = 500.5248
myString = True
myString = "vba"

'Boolean type variable holds logical values true/false

myBool = 0              'numbers will work because 0 converts to False
myBool = 5              'and any non-zero converts to True
myBool = 500.5248       'also converts to True
myBool = True           'obviously works
myBool = False          'also obviously works
myBool = "True"         'Yes! It works because the word "True" coverts to the logical value True
myBool = "vba"         'This fails, because the word "vba" cannot be converts to a logical value

'Integer type variable holds whole numbers (no decimals) between -32,768 and 32,767
myInt = 5               'small whole number works fine
myInt = 500.5248        'Cannot contain decimal, so rounds to 501
myInt = True            'Logical values convert: True = -1, False =  0
myInt = "500"           'Text value "500" is converted to the number 500
myInt = "text"          'Fails because this string has no numerical equivalent
myInt = 50000           'Fails because number exceeds the range for an integer type


'Long type variable holds whole a larger range of whole numbers (no decimals)
'This has the same results as Integer above, for the same reasons, except...
myLong = 5
myLong = 500.5248
myLong = True
myLong = "500"
myLong = "text"
myLong = 50000           '...this succeeds because a long is large enough to accommodate


'Double type holds floating point numbers (including decimal values)

myDouble = 5                'works fine
myDouble = 500.5248         'also works, because the decimals can be accomodates
myDouble = True             'True convers to -1 as always

'The word "True" can be converted to a boolean, and a boolean to a number,
'but not all in one step, so this next line will fail...

myDouble = "True"

'But you could do this. Of course, why you would want to do it is another story

myBool = "True"
myDouble = myBool   'after these two lines run, myDouble will contain -1

End Sub

