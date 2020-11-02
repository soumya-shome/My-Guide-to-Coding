class Error(Exception):
    pass
class InvalidNumberError(Error):
    def __init__(self,statement,s):
        self.statement=statement
        self.s=s
number=int(input("enter a number: "))
try:
    if number<1:
        raise InvalidNumberError("you have entered a negative number",number)
    else:
        print("the square root of the number:",(number)**0.5)
except InvalidNumberError as e:
    print(e.statement)
