class Employee:
    def __init__(self):
        self.__id=0
        self.__name=""
        self.__gender=""
        self.__city=""
        self.__salary=0
        print("Object Initialized")
    def __del__(self):
        print("Obejct Destroyed")
    def setData(self):
        self.__id=int(input("Enter ID\t:"))
        self.__name=input("Enter Name\t:")
        self.__gender=input("Enter Gender\t:")
        self.__city=input("Enter City\t:")
        self.__salary=int(input("Enter Salary\t:"))
    def __str__(self):
        data="["+str(self.__id)+","+self.__name+","+self.__gender+","+self.__city+","+str(self.__salary)+"]"
        return data
    def showData(self):
        print("Id\t\t:",self.__id)
        print("Name\t\t:",self.__name)
        print("Gender\t\t:",self.__gender)
        print("City\t\t:",self.__city)
        print("Salary\t\t:",self.__salary)

def main():
    emp=Employee()
    emp.setData()
    emp.showData()
    print(emp)

if __name__=="__main__":
    main()
