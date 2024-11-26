## [NumPy](NumPy.ipynb)

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

| Data Type | Description |
| --- | --- |
| int8 | Integer, 1 byte |
| int16 | Integer, 2 bytes |
| int32 | Integer, 4 bytes |
| int64 | Integer, 8 bytes |
| float16 | Float, 2 bytes |
| float32 | Float, 4 bytes |
| float64 | Float, 8 bytes |
| complex64 | Complex number, represented by two 32-bit floats |
| complex128 | Complex number, represented by two 64-bit floats |
| bool | Boolean, stored as a byte |
| object | Python object type, stored as a pointer |
| S | String type, stored as a byte array |
| U | Unicode string type, stored as a Unicode byte array |

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

arr.dtype = S1

np.array(
        [1,2,3,4,5],
        dtype = float
    )

arr.dtype = float64

np.array([{'a':1} ,sys])

arr.dtype = object

### Dimensions and Shape

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr.ndim = 1
arr.shape = (5,)
arr.size = 5

### Replace Items

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[0] = 7
arr[1] = 5

arr # [7,5,3,4,5]

#### 2D Array

arr = np.array(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

arr[1] = np.array([9,9,9])

arr #[
        [1,2,3],
        [9,9,9],
        [7,8,9]
    ]

arr[2] = 88

arr #[
        [1,2,3],
        [9,9,9],
        [88,88,88]
    ]

### Summary Statistics

a = np.array([0,1,2,3,4,5,6,7,8,9]) 

| Function | Description | Example |
| --- | --- | --- |
| min() | Return the minimum value of the array | a.min() => 0 |
| max() | Return the maximum value of the array | a.max() => 9 |
| mean() | Return the average of the array | a.mean() => 4.5 |
| median() | Return the median of the array | a.median() => 4.5 |
| sum() | Return the sum of the array | a.sum() => 45 |
| std() | Return the standard deviation of the array | a.std() => 2.872 |
| var() | Return the variance of the array | a.var() => 8.25 |

### Reshaping and Flattening Multidimensional Arrays

#### Reshaping

arr = np.array(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

arr.reshape(1,9) => [[1,2,3,4,5,6,7,8,9]]
arr.reshape(3,3) => [
                        [1,2,3],
                        [4,5,6],
                        [7,8,9]
                    ]
arr.reshape(9,1) => [
                        [1],
                        [2],
                        [3],
                        [4],
                        [5],
                        [6],
                        [7],
                        [8],
                        [9]
                    ]

#### Flattening

arr = np.array(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

arr.flatten() => [1,2,3,4,5,6,7,8,9]

### Boolean Arrays (also called masks)

arr = np.array(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

arr > 5 => [
            [False,False,False],
            [False,False,True],
            [True,True,True]
        ]

arr[arr > 5] => [6,7,8,9]

a = np.array([1,2,3,4,5,6,7,8,9,10])

a[0] , a[-3] => (1,8)

a[[0,-3]] => [1,8]

a[[True,False,True,False,True,False,True,True,True,False]] => [1,3,5,7,8,9]

a[[a > 5]] => [6,7,8,9,10]

a[[a > 5] & [a < 8]] => [6,7]

a[[a > 5] | [a < 8]] => [1,3,5,6,7,8,9,10]

### Linear Algebra

A = np.array([
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
])

B = np.array([
    [6, 5],
    [4, 3],
    [2, 1]
])

| Function | Description | Example |
| --- | --- | --- |
| dot() | Matrix multiplication | np.dot(A,B) => [[20,14],[56,41],[92,68]] |
| @ | Matrix multiplication | A @ B => [[20,14],[56,41],[92,68]] |
| . | Matrix multiplication | A . B => [[20,14],[56,41],[92,68]] |
| vdot() | Vector dot product | np.vdot(A,B) => 90 |
| inner() | Inner product of two arrays | np.inner(A,B) => [[28,10,2],[64,25,6],[100,40,10]] |
| matmul() | Matrix multiplication of two arrays | np.matmul(A,B) => [[20,14],[56,41],[92,68]] |
| determinant() | Determinant of a matrix | np.linalg.det(A) => 0 |
| inv() | Inverse of a matrix | np.linalg.inv(A) => [[-0.33333333,-0.66666667,1.],[-0.33333333,1.33333333,-0.66666667],[0.33333333,-0.33333333,0.]] |

### Functions of NumPy

a = np.array([1,2,3,4,])

| Function | Description | Example |
| --- | --- | --- |
| random() | Return random floats in the half-open interval [0.0, 1.0) | np.random.random(5) => [0.37454012,0.95071431,0.73199394,0.59865848,0.15601864] |
| arange() | Return evenly spaced values within a given interval | np.arange(5) => [0,1,2,3,4] |
| reshape() | Gives a new shape to an array without changing its data | np.arange(8).reshape(2,4) => [[0,1,2,3],[4,5,6,7]] |
| linspace() | Return evenly spaced numbers over a specified interval | np.linspace(0,10,5) => [0.,2.5,5.,7.5,10.] |
| zeros() | Return a new array of given shape and type, filled with zeros | np.zeros(5) => [0.,0.,0.,0.,0.] |
| ones() | Return a new array of given shape and type, filled with ones | np.ones(5) => [1.,1.,1.,1.,1.] |
| empty() | Return a new array of given shape and type, without initializing entries | np.empty(5) => [0.,0.,0.,0.,0.] |
| identity() | Return the identity array | np.identity(5) => [[1.,0.,0.,0.,0.],[0.,1.,0.,0.,0.],[0.,0.,1.,0.,0.],[0.,0.,0.,1.,0.],[0.,0.,0.,0.,1.]] |
| eye() | Return a 2-D array with ones on the diagonal and zeros elsewhere | np.eye(5) => [[1.,0.,0.,0.,0.],[0.,1.,0.,0.,0.],[0.,0.,1.,0.,0.],[0.,0.,0.,1.,0.],[0.,0.,0.,0.,1.]] |

