prin=int(input("Enter Principal : "))
rate=int(input("Enter Rate : "))
time=int(input("Enter Time : "))
inter=(prin*rate*time)//100
amt=inter+prin
print("Interest : ",inter)
print("Amount : ",amt)