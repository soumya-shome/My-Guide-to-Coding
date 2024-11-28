a=int(input("Enter a number: "))
if(a>10 and a<=20):
    if(a%2==0):
        print("the entered number is perfect.")
    elif(a%3==1):
        print ("entered number is moderateky perfect")
    else:
        print("the entered number is permissible to be used")
else:
    print("The entered number cannot be used")
