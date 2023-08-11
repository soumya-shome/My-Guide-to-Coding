import numpy as np 

a_1d = np.array([1,2,3,4,5])

a_2d = np.array([[1,2,3,4,5],[6,7,8,9,10]])

a_3d = np.array([[[1,2,3,4,5],[6,7,8,9,10]],[[11,12,13,14,15],[16,17,18,19,20]]])

print("Arrays: ")
print("1D Array = ",a_1d)
print("2D Array = ",a_2d)
print("3D Array = ",a_3d)

print("Array indexes: ")
print("a_1d[0] = ",a_1d[0])
print("a_1d[1] = ",a_1d[1])

print("a_2d[0] = ",a_2d[0])
print("a_2d[0][0] = ",a_2d[0][0])
print("a_2d[0][1] = ",a_2d[0][1])

print("a_3d[0] = ",a_3d[0])
print("a_3d[0][0] = ",a_3d[0][0])
print("a_3d[0][0][0] = ",a_3d[0][0][0])

print("Array slicing: ")
print("a_1d[1:5] = ",a_1d[1:5])
print("a_1d[1:] = ",a_1d[1:])
print("a_1d[:5] = ",a_1d[:5])
print("a_1d[-3:-1] = ",a_1d[-3:-1])

print("a_2d[1,1:4] = ",a_2d[1,1:4])
print("a_2d[0:2,2] = ",a_2d[0:2,2])
print("a_2d[0:2,1:4] = ",a_2d[0:2,1:4])

print("a_3d[1,1,1:4] = ",a_3d[1,1,1:4])
print("a_3d[0:2,1,2] = ",a_3d[0:2,1,2])
print("a_3d[0:2,1,1:4] = ",a_3d[0:2,1,1:4])