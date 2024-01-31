import math

class ParkingLot:
    def __init__ (self):
        self.vno = 0
        self.hours = 0
        self.bill = 0.0

    def input(self):
        self.vno = int(input("Enter vehicle number: "))
        self.hours = int(input("Enter number of hours: "))

    def calculate(self):
        if self.hours<=1:
            self.bill = 3
        else:
            self.bill = 3 + (self.hours-1)*1.5
    
    def display(self):
        print(f'Vehicle number : {self.vno}')
        print(f'Hours Parked : {self.hours} hrs')
        print(f'Total Bill : Rs {self.bill}')

if __name__ == "__main__":
    x = ParkingLot()
    x.input()
    x.calculate()
    x.display()