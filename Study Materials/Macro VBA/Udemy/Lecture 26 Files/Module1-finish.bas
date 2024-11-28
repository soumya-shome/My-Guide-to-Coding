Attribute VB_Name = "Module1"
Option Explicit

Public Sub ZoomIn()
Dim i As Integer

'Animate zooming the window by incrementing zoom
'from 100% to 400% by 4.

For i = 100 To 400 Step 4
 ActiveWindow.Zoom = i
 DoEvents                   'Yield some time to the system so screen updating appears smooth
Next


End Sub

Public Sub ZoomOut()
Dim i As Integer

'Animate zooming the window by decrementing zoom
'from 400% to 100% by -4.


For i = 400 To 100 Step -4
 ActiveWindow.Zoom = i
 DoEvents                    'Yield some time to the system so screen updating appears smooth
Next

End Sub

Public Sub ToggleAll()

'This sub simply reverses several visual properties that effect the Excel
'workspace.

Application.DisplayScrollBars = Not Application.DisplayScrollBars
Application.DisplayStatusBar = Not Application.DisplayStatusBar
Application.DisplayFormulaBar = Not Application.DisplayFormulaBar

ActiveWindow.DisplayHeadings = Not ActiveWindow.DisplayHeadings
ActiveWindow.DisplayGridlines = Not ActiveWindow.DisplayGridlines

End Sub


