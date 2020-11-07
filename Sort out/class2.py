class person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        
    def myfunc(abc):
        print("My name is "+abc.name)

p1=person("John",36)
p1.myfunc()