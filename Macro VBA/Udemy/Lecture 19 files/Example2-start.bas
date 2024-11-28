Attribute VB_Name = "Example2"
Option Explicit
Public Sub CharacterClass1()
'This sub requests a single character using the input box
'and then attempts to classify that character as vowel, consonant, punctuation, etc...
Dim theChar As String
Dim theResult As String

'This requests the character, and forces all characters to lowercase
'to reduce the number of comparisons necessary, ie, we don't need to
'check for both "A" and "a", since all characters will be lowercase
theChar = LCase(InputBox("Enter a single character:"))


'now use a long, ugly and unwieldy IF..ELSE to check for each
'possible character. Place a description of the character
'in the variable "theResult"

If theChar = "a" Or theChar = "e" Or theChar = "i" Or theChar = "o" Or theChar = "u" Then

    theResult = "vowel"
    
ElseIf theChar = "b" Or theChar = "c" Or theChar = "d" Or theChar = "f" Or theChar = "g" _
Or theChar = "h" Or theChar = "j" Or theChar = "k" Or theChar = "l" _
Or theChar = "m" Or theChar = "n" Or theChar = "p" Or theChar = "q" _
Or theChar = "r" Or theChar = "s" Or theChar = "t" Or theChar = "v" _
Or theChar = "x" Or theChar = "x" Or theChar = "y" Or theChar = "z" Then

    theResult = "consonant"
    
ElseIf theChar = "0" Or theChar = "1" Or theChar = "2" Or theChar = "3" Or theChar = "4" _
Or theChar = "5" Or theChar = "6" Or theChar = "7" Or theChar = "8" Or theChar = "9" Then

    theResult = "numeric"
    
ElseIf theChar = "," Or theChar = "." Or theChar = ";" Or theChar = ":" Or theChar = "!" Or theChar = "?" Then

    theResult = "punctuation"
    
Else
    theResult = "symbol"
End If
                            
'Report to the user the classification
MsgBox "Character type = " & theResult

End Sub

Public Sub CharacterClass2()
'This sub performs the same operation as the sub above, but uses
'a simpler SELECT CASE construct to do the comparisons
Dim theChar As String
Dim theResult As String

theChar = LCase(InputBox("Enter a single character:"))
                                    
'now, depending on the value of char
'classfify the letter according to the following categories

Select Case theChar     '<--- the value being compared in "theChar"

Case "a", "e", "i", "o", "u":        '<--- after each CASE, the values being compared TO
    theResult = "vowel"              '<--- the following line gets executed if a match is found

Case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z":
    theResult = "consonant"
    
Case "0" To "9":
    theResult = "numeric"
    
Case ",", ".", ";", ":", "!", "?":
    theResult = "punctuation"
    
Case Else   '<--- the "default case, if no matches are found, this case is executed
    theResult = "symbol"

End Select

MsgBox "Character type = " & theResult

End Sub


