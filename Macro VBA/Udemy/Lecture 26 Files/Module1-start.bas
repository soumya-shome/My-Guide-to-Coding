Attribute VB_Name = "Module1"
Option Explicit

Public Sub ToggleAll()

Application.DisplayScrollBars = Not Application.DisplayScrollBars
Application.DisplayStatusBar = Not Application.DisplayStatusBar
Application.DisplayFormulaBar = Not Application.DisplayFormulaBar

ActiveWindow.DisplayHeadings = Not ActiveWindow.DisplayHeadings
ActiveWindow.DisplayGridlines = Not ActiveWindow.DisplayGridlines

End Sub



