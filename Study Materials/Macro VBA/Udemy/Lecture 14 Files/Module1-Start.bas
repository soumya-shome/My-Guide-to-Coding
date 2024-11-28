Attribute VB_Name = "Module1"

Public Sub BMI()
'Our original Body Mass Index calculator which we will modify in
'lecture 14 to use variables

Range("M1").Value = InputBox("Enter your weight in lbs.")

Range("M2").Value = InputBox("Enter your height in inches.")

Range("M3").Value = (Range("M1").Value * 703) / (Range("M2").Value) ^ 2

MsgBox "Your BMI is " & Range("M3").Value

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

