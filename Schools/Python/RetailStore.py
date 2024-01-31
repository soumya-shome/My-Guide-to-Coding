class RetailStore:
    def __init__(self):
        self.itemtype = 0
        self.itemname = ""
        self.price = 0.0
        self.discount = 0.0
        self.finalprice = 0.0

    def input(self):
        self.itemtype = int(input("Enter the type of item \n1. CD\n2. TV\n3. Music Sytem\n Enter : "))
        self.price = float(input("Enter Price of Item : "))

    def calculate(self):
        match(self.itemtype):
            case 1:
                self.itemname = "CD"
                if self.price>0 and self.price<=7500:
                    self.discount = 0.02
                elif self.price>7500 and self.price<=12500:
                    self.discount = 0.035
                elif self.price>12500 and self.price<=18000:
                    self.discount = 0.06
                elif self.price>18000:
                    self.discount = 0.08

            case 2:
                self.itemname = "TV"
                if self.price>0 and self.price<=7500:
                    self.discount = 0.02
                elif self.price>7500 and self.price<=12500:
                    self.discount = 0.035
                elif self.price>12500 and self.price<=18000:
                    self.discount = 0.06
                elif self.price>18000:
                    self.discount = 0.0834
                
            case 3:
                self.itemname = "Music System"
                if self.price>0 and self.price<=5000:
                    self.discount = 0.125
                elif self.price>5000 and self.price<=15000:
                    self.discount = 0.145
                elif self.price>15000 and self.price<=18000:
                    self.discount = 0.155
                elif self.price>18000:
                    self.discount = 0.18
            
            case _:
                print("<< -- Wrong item entered -- >>")
        
        self.finalprice = self.price - (self.price*self.discount)

    def output(self):
        print(f'Type of Item : {self.itemtype}')
        print(f'Item Name : {self.itemname}')
        print(f'Price of item : {self.price}')
        print(f'Discount : {self.discount*100}%')
        print(f'Amount to be paid : {self.finalprice}')


if __name__ == '__main__':
    ob = RetailStore()
    ob.input()
    ob.calculate()
    ob.output()