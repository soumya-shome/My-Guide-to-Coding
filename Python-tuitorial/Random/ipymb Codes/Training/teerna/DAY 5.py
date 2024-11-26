#!/usr/bin/env python
# coding: utf-8

# #  Keyword Arguments

# In[1]:


def print_emp(fn,ln):
    print(f'First name:{fn}')
    print(f'Last name:{ln}')


# In[2]:


print_emp('Yann','Lecun')


# In[3]:


print_emp('Lecun','Yann')


# In[4]:


print_emp(ln='Lecun',fn='Yann')


# In[5]:


print_emp(ln='Lecun',fn='Yann',salary=600000)


# In[ ]:


def print_emp(fn,ln,**kwargs):
    print(f'First name:{fn}')
    print(f'Last name:{ln}')
    for i in kwargs:
        print(f'key:{kwargs[i]}')


# In[ ]:


print_emp(ln='Lecun',fn='Yann',age=60,kwargs=600000,kwargs2=75000)


# # Lambda Expression

# In[ ]:


def comp(a,b):
    return a>b


# In[ ]:


comp(12,5)


# In[ ]:


(lambda a,b:a>b)(12,5)                                       


# In[ ]:


f=comp


# In[ ]:


f(12,5)


# In[ ]:


comp1=lambda a,b:a>b


# In[ ]:


comp1(12,5)


# In[6]:


from sorting import get_max


# In[7]:


a=[('ram',20,18000),('sam',19,20000),('jadu',21,19000)]


# In[8]:


def comp(e1,e2):
    return e1[2]>e2[2]


# In[9]:


get_max(a,comp)


# In[11]:


get_max(a,lambda e1,e2:e1[1]>e2[1])


# In[12]:


from sorting import get_max


# In[13]:


def comp(a1,a2):
    return a1[1]>a2[1]


# In[14]:


get_max(a,comp)


# In[ ]:




