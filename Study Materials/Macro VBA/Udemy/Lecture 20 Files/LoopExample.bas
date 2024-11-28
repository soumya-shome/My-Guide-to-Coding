Attribute VB_Name = "LoopExample"
Option Explicit
Public Sub ClassifyAll1()
'This sub simply calls the CharaterClass sub for each cell in the column containing
'the active cell, until it encounters an empty cell, then it exits. Not the logical
'expression states: continue looping UNTIL the condition is TRUE.

Do Until ActiveCell.Value = ""

    CharacterClass
    ActiveCell.Offset(1, 0).Select
    
Loop

End Sub


Public Sub ClassifyAll2()
'This sub works similar, but the test has a slightly different logical expression:
'Continue looping AS LONG AS a condition is TRUE.

Do While ActiveCell.Value <> ""
    
    CharacterClass
    ActiveCell.Offset(1, 0).Select
    
Loop

End Sub

Public Sub ClassifyAll3()
'this Sub works in a similar manner as the above, but the loop continuation test
'is at the bottom of the loop, meaning the body of the loop will execute at least
'once. If we begin in an empty cell, this causes an undesirable result, so or this
'paticular problem, we would rather not do this, but some types of
'problems this is appropriate.

Do
    CharacterClass
    ActiveCell.Offset(1, 0).Select
    
Loop Until ActiveCell.Value = ""

End Sub

Public Sub ClassifyAll4()
'Same as ClassifyAll3, except using a WHILE test instead of an UNTIL. Again, it is
'better to use a loop with the test at the top in case you are beginning in an empty cell.

Do
    CharacterClass
    ActiveCell.Offset(1, 0).Select
    
Loop While ActiveCell.Value <> ""

End Sub

Public Sub Trouble()

'One potential problem with this type of loop -- that is, one with an
'"exit condition" -- is that you have to make sure that the exit condition
'is eventually met. Otherwise it will result in an "infinite loop" and
'either a freeze or a crash. For example, if you start this loop in a empty
'column it will loop madly until it eventually reaches the end of the worksheet
'and crashes.

'To exit this kind of problem, the ESC key will usually do the trick.
'For stubborn freezes, try CTRL-BREAK.

Do Until ActiveCell.Value <> ""

    ActiveCell.Offset(1, 0).Select

Loop

End Sub
