#!/usr/bin/env python
# coding: utf-8

# # Flow of Control

# ## Sequencial
# ## Conditional
# ## Iterative

# In[1]:


marks = int(input("Enter your marks: "))
if marks>=80:
    print('Good')
    print('Grade A')
print('End')


# In[2]:


marks = int(input("Enter your marks: "))
if marks>=80:
    print('Good')
    print('Grade A')
else:
    print('Bad')
print('End')


# In[3]:


marks = int(input("Enter your marks: "))
if marks>=80 and marks<=100:
    Grade='A'
else:
    if marks>=60:
        Grade='B'
    else:
        if marks>=40:
            Grade='C'
        else:
            Grade='D'
print(f'Grade = {Grade}')


# In[4]:


marks = int(input("Enter your marks: "))
if marks>=80 and marks<=100:
    Grade='A'
else:
    if marks>=60:
        Grade='B'
    else:
        if marks>=40:
            Grade='C'
        else:
            Grade='D'
print(f'Grade = {Grade}')


# In[6]:


marks = int(input("Enter your marks: "))
if marks>=80 and marks<=100:
    Grade='A'
    if marks>=90:
        Grade='A+'
else:
    if marks>=60:
        Grade='B'
    else:
        if marks>=40:
            Grade='C'
        else:
            Grade='D'
print(f'Grade = {Grade}')


# In[7]:


marks = int(input("Enter your marks: "))
if marks>=80 and marks<=100:
    Grade='A'
    if marks>=90:
        Grade='A+'
elif marks>=60:
        Grade='B'
elif marks>=40:
            Grade='C'
else:
    Grade='D'
print(f'Grade = {Grade}')


# In[11]:


marks=int(input("Enter marks: "))
print('Good' if marks>=80 else 'Bad')


# In[17]:


marks=int(input("Enter marks: "))
print('grade=A' if marks>=80 and marks<=100 else 'grade=B'if marks>=60 else'grade=C'if marks>=40  else 'Bad')


# In[18]:


def factorial(n):
    return 1 if n==0 else n*factorial(n-1)


# In[19]:


factorial(3)


# In[28]:


def fibo(n):
    return 0 if n==1 else 1 if n==2 else fibo(n-2)+fibo(n-1)


# In[29]:


fibo(6)


# In[31]:


n=int(input("Enter one number: "))
f=1
i=2
while i<=n:
    f*=i
    i+=1
print(f'{n}!={f}')


# In[ ]:




