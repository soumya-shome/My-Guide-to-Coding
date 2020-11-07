class Message(object):
    def __init__(self):
        self.msg=None
    def assignValue(self):
        self.msg="Hello world"
    def getValue(self,str):
        self.msg=str
    def printValue(self):
        print ("Message: ",self.msg)

m=Message()
print (m.printValue())
m.assignValue()
print (m.printValue())
m.getValue("Hello")
print (m.printValue())
