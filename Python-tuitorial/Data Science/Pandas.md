## [Pandas](Pandas.ipynb)

Pandas is a Python library used for working with data sets. It has functions for analyzing, cleaning, exploring, and manipulating data. The name "Pandas" has a reference to both "Panel Data", and "Python Data Analysis" and was created by Wes McKinney in 2008. It is built on the Numpy package and its key data structure is called the DataFrame. DataFrames allow you to store and manipulate tabular data in rows of observations and columns of variables.

### Installation of Pandas

!pip install pandas

### Import Pandas

import pandas as pd

Pandas has two main data structures:
- Series
- DataFrames

### Series

A Pandas Series is like a column in a table. It is a one-dimensional array holding data of any type.

#### Create a Series

a = pd.Series([1,2,3,4,5])

b = pd.Series({'a':1,'b':2,'c':3,'d':4,'e':5})

s = pd.Series([1,2,3,4,5], index = ['a','b','c','d','e'])


#### Accessing Data from Series with Position

s[0] = 1
s[1] = 2

#### Accessing Data from Series with Label

s['a'] = 1
s['b'] = 2

#### Accessing Multiple Elements from Series

s[0:3] = [1,2,3]
s['a':'c'] = [1,2,3]

#### See Datatype of Elements in Series

s.dtype = int64

#### See Shape of Series

s.shape = (5,)
s.size = 5

#### Series Name

s.name = 'Numbers'

#### Series Location

s.loc['a'] = 1
s.iloc[0] = 1
s.iloc[(0,1)] = [1,2]
s.iloc[0:3] = [1,2,3]

#### Series Boolean

s > 3 => [False,False,False,True,True]

s[s > 3] => [4,5]

#### Series Operations

| Operation | Description | Example |
| --- | --- | --- |
| mean() | Return the mean of the values for the requested axis | s.mean() => 3.0 |
| median() | Return the median of the values for the requested axis | s.median() => 3.0 |
| mode() | Return the mode(s) of the dataset | s.mode() => 0    1 |
| + | Addition of series and other, element-wise (binary operator add) | s + 1 => [2,3,4,5,6] |
| - | Subtraction of series and other, element-wise (binary operator sub) | s - 1 => [0,1,2,3,4] |
| * | Multiplication of series and other, element-wise (binary operator mul) | s * 2 => [2,4,6,8,10] |
| / | Floating division of series and other, element-wise (binary operator truediv) | s / 2 => [0.5,1.0,1.5,2.0,2.5] |
| // | Integer division of series and other, element-wise (binary operator floordiv) | s // 2 => [0,1,1,2,2] |
| % | Modulo of series and other, element-wise (binary operator mod) | s % 2 => [1,0,1,0,1] |
| ** | Exponential power of series and other, element-wise (binary operator pow) | s ** 2 => [1,4,9,16,25] |
| abs() | Return a Series/DataFrame with absolute numeric value of each element | s.abs() => [1,2,3,4,5] |
| round() | Round each value in a Series to the given number of decimals | s.round() => [1,2,3,4,5] |
| sum() | Return the sum of the values for the requested axis | s.sum() => 15 |
| std() | Return sample standard deviation over requested axis | s.std() => 1.581139 |
| var() | Return unbiased variance over requested axis | s.var() => 2.5 |
| min() | Return the minimum of the values for the requested axis | s.min() => 1 |
| max() | Return the maximum of the values for the requested axis | s.max() => 5 |


### DataFrames

A Pandas DataFrame is a 2 dimensional data structure, like a 2 dimensional array, or a table with rows and columns.

#### Create a DataFrame

df = pd.DataFrame(
        [
            [1,2,3,4,5],
            [6,7,8,9,10]
        ]
    )

df = pd.DataFrame(
        {
            'a':[1,2,3,4,5],
            'b':[6,7,8,9,10]
        }
    )

df = pd.DataFrame(
        {
            'a':pd.Series([1,2,3,4,5]),
            'b':pd.Series([6,7,8,9,10])
        }
    )



#### Accessing Data from DataFrame with Position

df[0] = [1,6]
df[1] = [2,7]
df[2] = [3,8]

#### Accessing Data from DataFrame with Label

df['a'] = [1,6]
df['b'] = [2,7]
df['c'] = [3,8]

#### Accessing Multiple Elements from DataFrame

df[0:2] = [[1,2,3],[6,7,8]]
df['a':'b'] = [[1,2,3],[6,7,8]]

#### See Datatype of Elements in DataFrame

df.dtypes => int64

#### See Shape of DataFrame

df.shape => (2,3)

#### DataFrame Name

df.name = 'Numbers'

#### DataFrame Location

df = pd.DataFrame(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

df.loc[0] => [1,2,3]
df.iloc[0] => [1,2,3]
df.iloc[(0,1)] => [[1,2],[2,3]]
df.iloc[0:2] => [[1,2,3],[4,5,6]]

df.columns = ['a','b','c']

df.index = ['x','y','z']

df.loc['x'] => [1,2,3]
df.iloc[0] => [1,2,3]


#### DataFrame Boolean

df > 3 => [
            [False,False,False],
            [True,True,True],
            [True,True,True]
        ]

#### DataFrame Selection

df = pd.DataFrame(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

df.index = ['x','y','z']
df.columns = ['a','b','c']

df 

|  | a | b | c |
| --- | --- | --- | --- |
| x | 1 | 2 | 3 |
| y | 4 | 5 | 6 |
| z | 7 | 8 | 9 |

df['a'] => [1,4,7]

df[['a','b']] => [[1,2],[4,5],[7,8]]

df.loc['x'] => [1,2,3]

df.loc[['x','y']] => [[1,2,3],[4,5,6]]

df.loc[['x','y'],['a','b']] => [[1,2],[4,5]]

df.iloc[0] => [1,2,3]

df.iloc[[0,1]] => [[1,2,3],[4,5,6]]

df.iloc[[0,1],[0,1]] => [[1,2],[4,5]]

df.iloc[0:2] => [[1,2,3],[4,5,6]]

df.iloc[0:2,0:2] => [[1,2],[4,5]]

df[df > 3] => [
                [NaN,NaN,NaN],
                [4,5,6],
                [7,8,9]
            ]

df[df['a'] > 3] => [
                        [4,5,6],
                        [7,8,9]
                    ]

df[df['a'] > 3]['b'] => [5,8]

df[df['a'] > 3][['b','c']] => [[5,6],[8,9]]

df.drop('a') => [
                    [4,5,6],
                    [7,8,9]
                ]

df.drop(['x','z']) => [[4,5,6]]

df.drop('a',axis = 1) => [
                            [2,3],
                            [5,6],
                            [8,9]
                        ]


#### DataFrame Operations

| Operation | Description | Example |
| --- | --- | --- |
| mean() | Return the mean of the values for the requested axis | df.mean() => a    4.0 b    5.0 c    6.0 dtype: float64 |
| median() | Return the median of the values for the requested axis | df.median() => a    4.0 b    5.0 c    6.0 dtype: float64 |
| mode() | Return the mode(s) of the dataset | df.mode() => 0    1 1    2 2    3 3    4 4    5 5    6 6    7 7    8 8    9 dtype: int64 |
| + | Addition of dataframe and other, element-wise (binary operator add) | df + 1 => [[2,3,4],[5,6,7],[8,9,10]] |
| - | Subtraction of dataframe and other, element-wise (binary operator sub) | df - 1 => [[0,1,2],[3,4,5],[6,7,8]] |
| * | Multiplication of dataframe and other, element-wise (binary operator mul) | df * 2 => [[2,4,6],[8,10,12],[14,16,18]] |
| / | Floating division of dataframe and other, element-wise (binary operator truediv) | df / 2 => [[0.5,1.0,1.5],[2.0,2.5,3.0],[3.5,4.0,4.5]] |
| // | Integer division of dataframe and other, element-wise (binary operator floordiv) | df // 2 => [[0,1,1],[2,2,3],[3,4,4]] |
| % | Modulo of dataframe and other, element-wise (binary operator mod) | df % 2 => [[1,0,1],[0,1,0],[1,0,1]] |
| ** | Exponential power of dataframe and other, element-wise (binary operator pow) | df ** 2 => [[1,4,9],[16,25,36],[49,64,81]] |
| abs() | Return a Series/DataFrame with absolute numeric value of each element | df.abs() => [[1,2,3],[4,5,6],[7,8,9]] |
| round() | Round each value in a Series to the given number of decimals | df.round() => [[1,2,3],[4,5,6],[7,8,9]] |

