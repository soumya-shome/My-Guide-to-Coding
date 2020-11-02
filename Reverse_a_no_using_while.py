# Python Program to Reverse a Number using While loop    
     
def intreverse(Number):
    Reverse = 0    
    while(Number > 0):    
        Reminder = Number %10    
        Reverse = (Reverse *10) + Reminder    
        Number = Number//10    
    print("%d" %Reverse) 