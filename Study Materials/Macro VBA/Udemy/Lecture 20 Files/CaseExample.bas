Attribute VB_Name = "CaseExample"
Option Explicit

Public Sub CharacterClass()
'This sub is looks at the character in the active cell, and classifies it according to
'several categories. The Select Case statement is used to perform the actual
'comparison
Dim theChar As String
Dim theResult As String

theChar = LCase(ActiveCell.Text)    'get the value of the activeCell, force to lowercase
                                    'so we compare apples and apples
                                    
'now, depending on the value of char, use a Select...Case statement to
'classfify the letter according to the following categories
Select Case theChar

Case "a", "e", "i", "o", "u":
    theResult = "vowel"

Case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z":
    theResult = "consonant"
    
Case "0" To "9":
    theResult = "numeric"
    
Case ",", ".", ";", ":", "!", "?":
    theResult = "punctuation"
    
Case Else
    theResult = "symbol"

End Select

'put the result in the cell one column to the right of the active cell
ActiveCell.Offset(0, 1).Value = theResult

End Sub



