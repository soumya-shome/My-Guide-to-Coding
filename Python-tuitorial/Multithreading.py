#Multithreading in Python

#Multithreading is defined as the ability of a processor to execute multiple threads concurrently.
#A thread is an execution path of a program. In simple words, a thread is a sequence of such instructions within a program that can be executed independently of other code.
#For example, consider a program that plays music in the background while you continue to work on other tasks. The music is played by a separate thread that runs concurrently.

# Python Multithreading
# Multithreading can be achieved in two ways:
# 1. Python Threading module
# 2. Python Multiprocessing module

# Python Threading module

# Python provides a module called threading for multi-threading. It provides a way to create threads and manage them.
# The threading module provides the following methods:
# 1. threading.activeCount(): Returns the number of thread objects that are active.
# 2. threading.currentThread(): Returns the number of thread objects in the caller's thread control.
# 3. threading.enumerate(): Returns a list of all thread objects that are currently active.
# 4. run(): The run() method is the entry point for a thread.
# 5. start(): The start() method starts a thread by calling the run method.
# 6. join([time]): The join() waits for threads to terminate.
# 7. isAlive(): The isAlive() method checks whether a thread is still executing.
# 8. getName(): The getName() method returns the name of a thread.
# 9. setName(): The setName() method sets the name of a thread.

# Python Multithreading Example
# Example 1: Creating Thread Using Threading Module
import threading
import time

class MyThread(threading.Thread):
    def __init__(self,threadID,name,counter):
        threading.Thread.__init__(self)
        self.threadID=threadID
        self.name=name
        self.counter=counter
    def run(self):
        print("Starting "+self.name)
        print_time(self.name,self.counter,5)
        print("Exiting "+self.name)
    
def print_time(threadName,delay,counter):
    while counter:
        time.sleep(delay)
        print("%s: %s"%(threadName,time.ctime(time.time())))
        counter-=1

# Create new threads
thread1=MyThread(1,"Thread-1",1)
thread2=MyThread(2,"Thread-2",2)

# Start new Threads
thread1.start()
thread2.start()

print("Exiting Main Thread")

#Output:
# Starting Thread-1
# Starting Thread-2
# Exiting Main Thread
# Thread-1: Mon Jun  7 11:48:38 2021
# Thread-1: Mon Jun  7 11:48:39 2021
# Thread-2: Mon Jun  7 11:48:39 2021
# Thread-1: Mon Jun  7 11:48:40 2021
# Thread-1: Mon Jun  7 11:48:41 2021
# Thread-2: Mon Jun  7 11:48:41 2021
# Thread-1: Mon Jun  7 11:48:42 2021


# Example 2: Creating Thread Without Using Threading Module
# Python program without using threading
import time

def print_square(num):
    print("Print square numbers")
    for n in num:
        time.sleep(0.2)
        print("Square: ",n*n)

def print_cube(num):
    print("Print cube of numbers")
    for n in num:
        time.sleep(0.2)
        print("Cube: ",n*n*n)

arr=[1,2,3,4,5,6,7,8,9,10]

t=time.time()
print_square(arr)
print_cube(arr)
print("Done in: ",time.time()-t)

#Output:
# Print square numbers
# Square:  1
# Square:  4
# Square:  9
# Square:  16
# Square:  25
# Square:  36
# Square:  49
# Square:  64
# Square:  81
# Square:  100
# Print cube of numbers
# Cube:  1
# Cube:  8
# Cube:  27
# Cube:  64
# Cube:  125
# Cube:  216
# Cube:  343
# Cube:  512
# Cube:  729
# Cube:  1000
# Done in:  4.015000104904175

# Startinf a new thread for each function call
import time
import threading

def print_square(num):
    print("Print square numbers")
    for n in num:
        time.sleep(0.2)
        print("Square: ",n*n)
        
def print_cube(num):
    print("Print cube of numbers")
    for n in num:
        time.sleep(0.2)
        print("Cube: ",n*n*n)

arr=[1,2,3,4,5,6,7,8,9,10]

t=time.time()
t1=threading.Thread(target=print_square,args=(arr,))
t2=threading.Thread(target=print_cube,args=(arr,))
t1.start()
t2.start()
t1.join()
t2.join()
print("Done in: ",time.time()-t)

#Output:
# Print square numbers
# Print cube of numbers
# Square:  1
# Cube:  1
# Square:  4
# Cube:  8
# Square:  9
# Cube:  27
# Square:  16
# Cube:  64
# Square:  25
# Cube:  125
# Square:  36
# Cube:  216
# Square:  49
# Cube:  343
# Square:  64
# Cube:  512
# Square:  81
# Cube:  729
# Square:  100
# Cube:  1000
# Done in:  2.0350000858306885


#3. Starting a Thread with Arguments

#Example 1: Starting a Thread with Arguments
import threading
import time

class MyThread(threading.Thread):
    def __init__(self,threadID,name,counter):
        threading.Thread.__init__(self)
        self.threadID=threadID
        self.name=name
        self.counter=counter
    def run(self):
        print("Starting "+self.name)
        print_time(self.name,self.counter,5)
        print("Exiting "+self.name)

def print_time(threadName,delay,counter):
    while counter:
        time.sleep(delay)
        print("%s: %s"%(threadName,time.ctime(time.time())))
        counter-=1

# Create new threads
thread1=MyThread(1,"Thread-1",1)
thread2=MyThread(2,"Thread-2",2)

# Start new Threads
thread1.start()
thread2.start()

print("Exiting Main Thread")

#Output:
# Starting Thread-1
# Starting Thread-2
# Exiting Main Thread
# Thread-1: Mon Jun  7 12:01:00 2021
# Thread-1: Mon Jun  7 12:01:01 2021
# Thread-2: Mon Jun  7 12:01:01 2021
# Thread-1: Mon Jun  7 12:01:02 2021
# Thread-1: Mon Jun  7 12:01:03 2021
# Thread-2: Mon Jun  7 12:01:03 2021
# Thread-1: Mon Jun  7 12:01:04 2021

#4. Starting a Thread with Keyword Arguments

#Example 1: Starting a Thread with Keyword Arguments
import threading
import time

class MyThread(threading.Thread):
    def __init__(self,threadID,name,counter):
        threading.Thread.__init__(self)
        self.threadID=threadID
        self.name=name
        self.counter=counter
    def run(self):
        print("Starting "+self.name)
        print_time(self.name,self.counter,5)
        print("Exiting "+self.name)
        
def print_time(threadName,delay,counter):
    while counter:
        time.sleep(delay)
        print("%s: %s"%(threadName,time.ctime(time.time())))
        counter-=1
        
# Create new threads
thread1=MyThread(1,"Thread-1",1)
thread2=MyThread(2,"Thread-2",2)

# Start new Threads
thread1.start()
thread2.start()

print("Exiting Main Thread")

#Output:
# Starting Thread-1
# Starting Thread-2
# Exiting Main Thread
# Thread-1: Mon Jun  7 12:04:00 2021
# Thread-1: Mon Jun  7 12:04:01 2021
# Thread-2: Mon Jun  7 12:04:01 2021
# Thread-1: Mon Jun  7 12:04:02 2021
# Thread-1: Mon Jun  7 12:04:03 2021


#5. Starting a Thread with Default Arguments

#Example 1: Starting a Thread with Default Arguments
import threading
import time

class MyThread(threading.Thread):
    def __init__(self,threadID,name,counter):
        threading.Thread.__init__(self)
        self.threadID=threadID
        self.name=name
        self.counter=counter
    def run(self):
        print("Starting "+self.name)
        print_time(self.name,self.counter,5)
        print("Exiting "+self.name)
        
def print_time(threadName,delay,counter):
    while counter:
        time.sleep(delay)
        print("%s: %s"%(threadName,time.ctime(time.time())))
        counter-=1

# Create new threads
thread1=MyThread(1,"Thread-1",1)
thread2=MyThread(2,"Thread-2",2)

# Start new Threads
thread1.start()
thread2.start()

print("Exiting Main Thread")


#Output:
# Starting Thread-1
# Starting Thread-2
# Exiting Main Thread
# Thread-1: Mon Jun  7 12:06:00 2021
# Thread-1: Mon Jun  7 12:06:01 2021
# Thread-2: Mon Jun  7 12:06:01 2021
# Thread-1: Mon Jun  7 12:06:02 2021
# Thread-1: Mon Jun  7 12:06:03 2021
# Thread-2: Mon Jun  7 12:06:03 2021
# Thread-1: Mon Jun  7 12:06:04 2021


