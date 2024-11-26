#class and objects in python
#class is a blueprint for creating instances
#instances are objects of a class that are created at runtime
#class is a logical entity while object is a physical entity
#class does not allocate memory on declaration while objects allocate memory on instantiation

#syntax for class
#class Class_Name:
#    Initializer
#    attributes
#    methods   
#    <statement-1>
#    .
#    .
#    .
#    <statement-N>

#syntax for object
#object_name = ClassName()

#example
class Employee:
    pass

emp1 = Employee()
emp2 = Employee()

print(emp1) #<__main__.Employee object at 0x0000020F4F6F4E80>
print(emp2) #<__main__.Employee object at 0x0000020F4F6F4F10>

#each object has a unique address in memory

#class variables or attributes
#class variables are variables that are shared among all instances of a class

#syntax for class variable
#class ClassName:
#    class_variable = value

class Rectangle:
    length=0
    breadth=0
    pass
R1=Rectangle()

#accessing class variable
#ClassName.class_variable

print(R1.length)
print(R1.breadth)

#changing class variable using object
#object_name.class_variable = new_value
R1.length=20
R1.breadth=30
print(R1.length)
print(R1.breadth)

#Adding methods to a class
#class Class_Name:
#    instance variable
#    def method_name(self):
#        method body

#Self parameter
class MethodDemo:
    def Display_Message(self):
        print('Welcome')
ob1 = MethodDemo()
ob1.Display_Message() #Welcome

#self parameter and other parameters
class Rectangle2:
    def Calc_Area_Rect(self,length,breadth):
        return length * breadth
ob1 = Rectangle2()
print(ob1.Calc_Area_Rect(10,20)) #200

#syntax for instance variable
#class ClassName:
#    def __init__(self):
#        self.instance_variable = value

#accessing instance variable
#object_name.instance_variable

class Prac:
    x=5
    def disp(self,x):
        x=30
        print(x)
        print(self.x)
ob1 = Prac()
ob1.disp(10) #30 5

#self parameter with methods

class Self_Demo:
    def Method_A(self):
        print('In Method A')
        print('wow got a called from A!!!')
    def Method_B(self):
        print('In Method B calling Method A')
        self.Method_A()
Q=Self_Demo()
Q.Method_B() #In Method B calling Method A 
# In Method A 
# wow got a called from A!!!

#changing class variable using class
#ClassName.class_variable = new_value

#Display Class attributes and Methods
#dir(name_of_class) or dir(object_name)
print(dir(Prac)) #['x', '__class__', '__delattr__', '__dict__', '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__',

#Class_name.__dict__ or object_name.__dict__
print(Prac.__dict__) #{'__module__': '__main__', 'x': 5, 'disp': <function Prac.disp at 0x0000020F4F6F1CA0>, '__dict__': <attribute '__dict__' of 'Prac' objects>, '__weakref__': <attribute '__weakref__' of 'Prac' objects>, '__doc__': None}

#Special Class Attributes
Prac.__class__ #<class 'type'>
Prac.__name__ #'Prac'
Prac.__module__ #'__main__'
Prac.__bases__ #(<class 'object'>,)
Prac.__dict__ #{'__module__': '__main__', 'x': 5, 'disp': <function Prac.disp at 0x0000020F4F6F1CA0>, '__dict__': <attribute '__dict__' of 'Prac' objects>, '__weakref__': <attribute '__weakref__' of 'Prac' objects>, '__doc__': None}
Prac.__doc__ #None

#changing class variable using class method
#class ClassName:
#    @classmethod
#    def class_method(cls):
#        cls.class_variable = new_value

#changing class variable using constructor
#class ClassName:
#    def __init__(self):
#        ClassName.class_variable = new_value

#changing class variable using instance method
#class ClassName:
#    def instance_method(self):
#        ClassName.class_variable = new_value

# __init__ method (constructor)
# __init__ method is used to initialize the instance variables of a class
# __init__ method is called automatically when an object is created

#syntax for __init__ method
#class ClassName:
#    def __init__(self):
#        self.instance_variable = value

#accessing instance variable
#object_name.instance_variable

class Rectangle3:
    def __init__(self):
        self.length=0
        self.breadth=0
    def Calc_Area(self):
        return self.length * self.breadth
ob1 = Rectangle3()
ob1.length=10
ob1.breadth=20
print(ob1.Calc_Area()) #200

class Circle:
    pi=0
    radius=0
    def __init__(self):
        self.pi=3.14
        self.radius=5
    def Calc_Area(self):
        print('Radius of circle is',self.radius)
        return self.pi * self.radius ** 2
ob1 = Circle()
print('Area of Circle :',ob1.Calc_Area()) #Area of Circle : 78.5

#Accessibility

#no keyword for public, private, protected
#public - accessible from anywhere
#private - accessible only from within the class
#protected - accessible only from within the class and its subclasses

#private
#class ClassName:
#    def __init__(self):
#        self.__instance_variable = value

#accessing private variable
#object_name._ClassName__instance_variable

class Private:
    def __init__(self):
        self.__x=10
    def display(self):
        print(self.__x)
ob1 = Private()
ob1.display() #10
print(ob1._Private__x) #10

#protected
#class ClassName:
#    def __init__(self):
#        self._instance_variable = value

#accessing protected variable
#object_name._instance_variable

class Protected:
    def __init__(self):
        self._x=10
    def display(self):
        print(self._x)
ob1 = Protected()
ob1.display() #10
print(ob1._x) #10

#Passing an object as an argument to a method

class Test:
    a=0
    b=0
    def __init__(self,x,y):
        self.a=x
        self.b=y
    def equals(self,obj):
        if self.a == obj.a and self.b == obj.b:
            return True
        else:
            return False
ob1 = Test(10,20)
ob2 = Test(10,20)
ob3 = Test(30,40)
print(ob1.equals(ob2)) #True


#__del__ method (destructor)

#syntax for __del__ method
#class ClassName:
#    def __del__(self):
#        body of destructor

class Desctructor_Demo:
    def __init__(self):
        print('Welcome')
    def __del__(self):
        print('Destructor Executed Successfully')
ob1 = Desctructor_Demo() #Welcome
ob2 = ob1
ob3 = ob1
print('ID of Ob1',id(ob1)) #ID of Ob1 2299730286928
print('ID of Ob2',id(ob2)) #ID of Ob2 2299730286928
print('ID of Ob3',id(ob3)) #ID of Ob3 2299730286928
del ob2
del ob1
del ob3

#class memebeship test

#syntax for class membership test
#class ClassName:
#    body of class
#    if 'attribute_name' in ClassName:
#        body of if

class Class_Membership_Test:
    x=10
    y=20
    def display(self):
        print('In display')
ob1 = Class_Membership_Test()
print('x' in Class_Membership_Test.__dict__) #True
print('y' in Class_Membership_Test.__dict__) #True
print('display' in Class_Membership_Test.__dict__) #True
print('z' in Class_Membership_Test.__dict__) #False

#isInstance() function

#syntax for isinstance() function
#isinstance(object_name, class_name)

class A:
    pass
class B:
    pass
class C:
    pass
ob1 = A()
ob2 = B()
ob3 = C()

print(isinstance(ob1,A)) #True
print(isinstance(ob2,B)) #True
print(isinstance(ob3,B)) #False
print(isinstance(ob3,B)) #False
print(isinstance(ob1,(A,B,C))) #True
print(isinstance(ob3,C)) #True

#polymorphism

#Polymorphism is the ability of the object to take many forms
#Polymorphism is achieved by method overloading and method overriding

#Method Overloading

#Method Overloading is not supported in Python
#Method Overloading is the ability to define more than one method with the same name in a class
#Method Overloading is achieved by using default arguments

#isinatnceof - to check whether an object is an instance of a particular class or not

class Demo1:
    result=0
    def add(self, instanceOf=None, *args):
        if instanceOf =='init':
            self.result=0
        if instanceOf =='str':
            self.result=''
        for x in args:
            self.result += x
        return self.result
ob1 = Demo1()
print(ob1.add('init',10,20,30)) #60
print(ob1.add('str','Hello','World')) #HelloWorld

#operator overloading

#operator overloading is the ability to define operators for user defined classes
#operator overloading is achieved by using special methods

#special methods
#special methods are also called as magic methods
#special methods are used to overload operators
#special methods are always preceded and followed by double underscores

#syntax for special methods
#__method_name__(self, other)

#overloading + operator
class Demo2:
    def __init__(self,x):
        self.x=x
    def __add__(self, other):
        return self.x + other.x
ob1 = Demo2(10)
ob2 = Demo2(20)
print(ob1 + ob2) #30

#__add__(self,other) => X+Y => overloads + operator => Add X and Y
#__sub__(self,other) => X-Y => overloads - operator => Subtract X and Y
#__mul__(self,other) => X*Y => overloads * operator => Multiply X and Y
#__truediv__(self,other) => X/Y => overloads / operator => Divide X and Y
#__floordiv__(self,other) => X//Y => overloads // operator => Floor Divide X and Y
#__mod__(self,other) => X%Y => overloads % operator => Modulus X and Y
#__neg__(self,other) => -X => -overloads => Arithmatic Negation of X
#__pow__(self,other) => X**Y => overloads ** operator => Power X and Y

#__eq__(self,other) => X==Y => overloads == operator => is X equal to Y?
#__ne__(self,other) => X!=Y => overloads != operator => is X not equal to Y?
#__lt__(self,other) => X<Y => overloads < operator => is X less than Y?
#__gt__(self,other) => X>Y => overloads > operator => is X greater than Y?
#__le__(self,other) => X<=Y => overloads <= operator => is X less than or equal to Y?
#__ge__(self,other) => X>=Y => overloads >= operator => is X greater than or equal to Y?

#__str__(self) => str(X) => overloads str() function => String representation of X
#__len__(self) => len(X) => overloads len() function => Length of X
#__abs__(self) => abs(X) => overloads abs() function => Absolute value of X
#__bool__(self) => bool(X) => overloads bool() function => Boolean value of X
#__float__(self) => float(X) => overloads float() function => Floating point value of X
#__int__(self) => int(X) => overloads int() function => Integer value of X
#__complex__(self) => complex(X) => overloads complex() function => Complex value of X
#__itr__(self) => itr(X) => overloads itr() function => Iterator of X
#__hash__(self) => hash(X) => overloads hash() function => Hash value of X

class CmpOprDemo:
    def __init__(self,x):
        self.x=x

    def __lt__(self, other):
        print(' The value of Ob1 : ',self.x)
        print(' The value of Ob2 : ',other.x)
        print(' The value of Ob1 < Ob2 : ',end='')
        return self.x < other.x
    
    def __gt__(self, other):
        print(' The value of Ob1 > Ob2 : ',end='')
        return self.x > other.x
    
    def __le__(self, other):
        print(' The value of Ob1 <= Ob2 : ',end='')
        return self.x <= other.x
    
    def __ge__(self, other):
        print(' The value of Ob1 >= Ob2 : ',end='')
        return self.x >= other.x
    
ob1 = CmpOprDemo(20)
ob2 = CmpOprDemo(30)
print(ob1 < ob2) #True
print(ob1 > ob2) #False
print(ob1 <= ob2) #True

#Method Overriding

#Method Overriding is the ability of the child class to change the implementation of the method inherited from the parent class

class A5():
    i=0
    def display(self):
        print(' I am in super class')

class B5(A5):
    i=0
    def display(self):
        print(' I am in sub class')

D1=B5()
D1.display() #I am in sub class

class A6:
    i=0
    def display(self):
        print(' I am in super class')

class B6(A6):
    i=0
    def display(self):
        print(' I am in sub class')
        super.display()

D1=B6()
D1.display() #I am in sub class #I am in super class

class A7(object):
    def Display(self):
        print('I am in class A')

class B7(A7):
    def Display(self):
        print('I am in class B')
        A7.Display(self)

class C7(A7):
    def Display(self):
        print('I am in class C')
        A7.Display(self)

class D7(B7,C7):
    def Display(self):
        print('I am in class D')
        B7.Display(self)
        C7.Display(self)

ob1=D7()
ob1.Display() #I am in class D #I am in class B #I am in class A #I am in class C #I am in class A

class A8(object):
    def Display(self):
        print('I am in class A')
class B8(A8):
    def Display(self):
        print('I am in class B')
        super().Display()
class C8(A8):
    def Display(self):
        print('I am in class C')
        super().Display()
class D8(B8,C8):
    def Display(self):
        print('I am in class D')
        super().Display()

ob1=D8()
ob1.Display() #I am in class D #I am in class B #I am in class C #I am in class A

#inheritance

#inheritance is the ability to inherit the properties of one class into another class
#inheritance is achieved by using the keyword 'class' followed by the name of the class and the name of the parent class
#inheritance is also called as subclassing
#the class which inherits the properties of another class is called as child class or derived class
#the class whose properties are inherited by another class is called as parent class or base class
#the child class can access the properties of the parent class
#the child class can also have its own properties

#types of inheritance
# 1.single inheritance
# 2.multiple inheritance
# 3.multilevel inheritance

#syntax for inheritance
#class child_class_name(parent_class_name):
#    pass


#syntac for multiple inheritance
#class child_class_name(parent_class_name1, parent_class_name2, parent_class_name3):
#    pass

class A1:
    print ('Hello I am in base class')
class B(A1):
    print ('Hello I am in derived class')
ob1 = A1() #Hello I am in base class #Hello I am in derived class

class Point:
    def set_cordinates(self,x,y):
        self.x=x
        self.y=y

class new_point(point):
    def draw(self):
        print('locate point x :',self.x,' on x axis')
        print('locate point y :',self.y,' on y axis')

p=new_point()
p.set_cordinates(10,20)
p.draw() #locate point x : 10  on x axis #locate point y : 20  on y axis

#subclass accessing attributes of parent class

class A2:
    i=0
    j=0
    def Showij(self):
        print('i : ',self.i, ' j : ',self.j)
class B2(A2):
    k=0
    def Showijk(self):
        print('i : ',self.i, ' j : ',self.j, ' k : ',self.k)
    def sum(self):
        print('i+j+k : ',self.i+self.j+self.k)

ob1=A2()
ob2=B2()
ob1.i=100
ob1.j=200
print('ob1 : ')
ob1.Showij() #ob1 : #i :  100  j :  200

ob2.i=100
ob2.j=200
ob2.k=300
print('ob2 : ')
ob2.Showij() #ob2 : #i :  100  j :  200
ob2.Showijk() #ob2 : #i :  100  j :  200  k :  300
ob2.sum() #ob2 : #i+j+k :  600

#multilevel inheritance
class A3:
    name=' '
    age=0

class B3(A3):
    height=' '

class C3(B3):
    weight=' '

    def Read(self):
        print('Please enter the following values')
        self.name=input('Enter name : ')
        self.age=int(input('Enter age : '))
        self.height=input('Enter height : ')
        self.weight=input('Enter weight : ')

    def Display(self):
        print('Name : ',self.name)
        print('Age : ',self.age)
        print('Height : ',self.height)
        print('Weight : ',self.weight)

ob1=C3()
ob1.Read()
ob1.Display()

class A4:
    a=0

class B4:
    b=0

class C4(A4,B4):
    c=0

    def Read(self):
        self.a=int(input('Enter a : '))
        self.b=int(input('Enter b : '))
        self.c=int(input('Enter c : '))

    def Display(self):
        print('a : ',self.a)
        print('b : ',self.b)
        print('c : ',self.c)

ob1=C4()
ob1.Read()
ob1.Display()

#super() function

#super() function is used to call the constructor of the parent class

#super().__init__(parameters)
#super(DerivedClassName, self).__init__(parameters)

class Demo3:
    a=0
    b=0
    c=0
    def __init__(self,a,b,c):
        self.a=a
        self.b=b
        self.c=c
    def Display(self):
        print('a : ',self.a)
        print('b : ',self.b)
        print('c : ',self.c)

class NewDemo(Demo3):
    d=0
    def __init__(self,a,b,c,d):
        super().__init__(a,b,c)
        self.d=d
    def Display(self):
        print('a : ',self.a)
        print('b : ',self.b)
        print('c : ',self.c)
        print('d : ',self.d)

ob1=Demo3(10,20,30,40)
ob1.Display()
ob2.NewDemo(10,20,30,40)
ob2.Display()

#encapsulation

#encapsulation is the process of binding the data members and member functions into a single unit
#encapsulation is also called as data hiding
#encapsulation is achieved by declaring the data members as private

#Data Hiding

#Data Hiding is the ability of the class to hide its data members from outside world
#Data Hiding is achieved by declaring the data members as private

#Private data members are accessed only within the class

class A9:
    __i=0
    def Display(self):
        print('I am in class A')
        print('i : ',self.__i)

ob1=A9()
ob1.Display() #I am in class A #i :  0
print(ob1.__i) #AttributeError: 'A9' object has no attribute '__i'

class A10:
    __i=0
    def Display(self):
        print('I am in class A')
        print('i : ',self.__i)

ob1=A10()
ob1.Display() #I am in class A #i :  0
print(ob1._A10__i) #0

class A11:
    __i=0
    def Display(self):
        print('I am in class A')
        print('i : ',self.__i)
    
    def Set(self):
        self.__i=int(input('Enter i : '))

ob1=A11()
ob1.Set()
ob1.Display() #I am in class A #i :  10

