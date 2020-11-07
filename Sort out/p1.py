a=int(input("Enter a value for a: "))
b=int(input("Enter a value for b: "))
try:
    print ("a/b",a/b)
except ZeroDivisionError:
    print("Sorry,Wrong value for denominator")
