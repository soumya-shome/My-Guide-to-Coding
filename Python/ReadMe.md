# Python

### For Baics of Python , Visit the following link: https://www.w3schools.com/python/default.asp

## NumPy

In Python, everything is an object, which means that even simple ints are also objects, with all the required machinery to make object work. We call them "Boxed Ints". In contrast, NumPy uses primitive numeric types (floats, ints) which makes storing and computation efficient. NumPy is a Python library used for working with arrays. It also has functions for working in domain of linear algebra, fourier transform, and matrices. 
NumPy was created in 2005 by Travis Oliphant. It is an open source project and you can use it freely. 

### Installation of NumPy

!pip install numpy

### Import NumPy

from numpy import *
or 
import numpy as np

| NumPy Array | Python List |
| --- | --- |
| Fixed Size | Dynamic Size |
| Homogeneous elements | Heterogeneous elements |
| Fast | Slow |
| Less memory | More memory |

### Creating NumPy Arrays

#### 1D Array

arr = np.array([1,2,3,4,5])

#### 2D Array

arr = np.array([[1,2,3,4,5],[6,7,8,9,10]])

#### 3D Array

arr = np.array([[[1,2,3,4,5],[6,7,8,9,10]],[[11,12,13,14,15],[16,17,18,19,20]]])


### NumPy Array Indexing

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[0] = 1
arr[1] = 2

#### 2D Array

arr = np.array(
        [
            [1,2,3,4,5],
            [6,7,8,9,10]
        ]
    )

arr[0]= [1,2,3,4,5]
arr[0,0] = 1
arr[0,1] = 2

#### 3D Array

arr = np.array(
        [
            [
                [1,2,3,4,5],
                [6,7,8,9,10]
            ],
            [
                [11,12,13,14,15],
                [16,17,18,19,20]
            ]
        ]
    )

arr[0] = [[1,2,3,4,5],[6,7,8,9,10]]
arr[0,0] = [1,2,3,4,5]
arr[0,0,0] = 1

### NumPy Array Slicing

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[1:5] = [2,3,4,5]
arr[1:] = [2,3,4,5]
arr[:5] = [1,2,3,4,5]
arr[-3:-1] = [3,4]

#### 2D Array

arr = np.array(
        [
            [1,2,3,4,5],
            [6,7,8,9,10]
        ]
    )

arr[1,1:4] = [7,8,9]
arr[0:2,2] = [3,8]
arr[0:2,1:4] = [[2,3,4],[7,8,9]]

#### 3D Array

arr = np.array(
        [
            [
                [1,2,3,4,5],
                [6,7,8,9,10]
            ],
            [
                [11,12,13,14,15],
                [16,17,18,19,20]
            ]
        ]
    )

arr[1,1,1:4] = [17,18,19]
arr[0:2,1,2] = [8,18]
arr[0:2,1,1:4] = [[7,8,9],[17,18,19]]

### NumPy Data Types

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr.dtype = int32

arr = np.array(
        [1.1,2.1,3.1,4.1,5.1]
    )

arr.dtype = float64

arr = np.array(
        [1,2,3,4,5],
        dtype = 'S'
    )
