def t_m(mat):
    for i in range(len(mat)):
        for j in range(i,len(mat)):
            mat[i][j], mat[j][i] = mat[j][i],mat[i][j]
def r_c(mat):
    for i in range (len(mat)):
        k = len(mat) - 1;
        for j in range(0,k):
            mat[j][i], mat[k][i] = mat[k][i], mat[j][i]
            k = k - 1



def orig(matrix):
    arr = [[]*n]*n
    for i in range(n):
        l=[]
        for j in range(n):
            l.append(matrix[j][i])
        #print(l)
        l.sort()
        for a in range(n):
            if l[a]=='d' or l[a]=='D':
                l[a]='-'
        arr[i]=l
    t_m(arr)
    r_c(arr)
    for i in range(n):
        for j in range(n):
            print(arr[i][j],end=" ")
        print()
    
def leftb(matrix):
    arr=[]
    for i in range(n):
        l=[]
        for j in range(n):
            l.append(matrix[i][j])
        l.sort()
        for a in range(n):
            if l[a]=='d' or l[a]=='D':
                l[a]='-'
        arr.append(l)
    for i in range(n):
        for j in range(n):
            print(arr[i][j],end=" ")
        print()

n = int(input())
matrix=[]
for i in range(n):
    a=input().split(' ')
    matrix.append(a) 
print()
orig(matrix)
print()
leftb(matrix)