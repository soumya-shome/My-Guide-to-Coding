Attribute VB_Name = "Module1"
Option Explicit
'The purpose of this sub is to illustrate that you can use any
'style of loop for any kind of looping problem, however, there
'is usually one style of loop more suitable for any particular
'kind of problem. For example, we will see how using For...Next is
'the best way to loop some predetermined number of times -- in this
'case to put a sequence of numbers in a column -- but you can do the
'exact same thing using a Do...While loop as seen here...
Public Sub EnterSeries1()
Dim x As Integer

x = 1

Do While x <= 10
    
    ActiveCell.Value = x
    ActiveCell.Offset(1, 0).Select
    
    x = x + 1
Loop

End Sub

Public Sub EnterSeries2()
'This sub demonstrates a better way to enter a sequence of values
'in a column, using a For...Next loop. Note that we don't need
'to explicitly intialize our counging variable x, or increment its
'value, as we did above. The loop takes care of it for us.
'Several variations of For...Next are illustrated in this sub.
Dim x As Integer


'simple and most common use... increment by one from some lower
'boundary to some upper boundary.

For x = 1 To 10
    ActiveCell.Value = x
    ActiveCell.Offset(1, 0).Select
Next

'Note you don't have to begin from 1.
'You could write For x = 5 to 10, for example
'
'You can also count by a value other than 1 by using the
'keyword "Step". Here we will only loop 5 times because
'we are counting by two...

'For x = 1 To 10 Step 2
'    ActiveCell.Value = x
'    ActiveCell.Offset(1, 0).Select
'Next

'You can also use the Step keyword with a negative value
'to count down from a larger initial value to a smaller
'one...

'For x = 10 To 1 Step -1
'    ActiveCell.Value = x
'    ActiveCell.Offset(1, 0).Select
'Next

'Finally, if you change the data type of your counting variable
'from a whole number type (integer or long) to a decimal
'(double) you can step by fractional values. In this case, the
'loop will repeat 20 times, because it would count from 1 to 10
'by .5. Note that although VBA lets you do this, it is very
'rare. Most problems center on how many times you need to repeat,
'not on what number you count by.


'For x = 1 To 10 Step 0.5      'first declare x as double
'    ActiveCell.Value = x
'    ActiveCell.Offset(1, 0).Select
'Next

End Sub

Public Sub EnterSeries3()
'This sum illustrates that you can also use variables for the
'boundaries of your loop, so that you can determine the number
'of times the loop will iterate at runtime. For example, here
'the user can determine the number of iterations through an
'input box.

Dim x As Integer
Dim count As Integer

count = InputBox("How many values?")

For x = 1 To count
    ActiveCell.Value = x
    ActiveCell.Offset(1, 0).Select
Next

End Sub
