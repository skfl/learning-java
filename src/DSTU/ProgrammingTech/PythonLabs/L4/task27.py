import random
from random import randrange

a = 0
b = 10
n1 = 5
n2 = 9
arr = [[i for j in range(n2)] for i in range(n1)]
for i in range(n1):
    for j in range(n2):
        c=random.randint(a,b)
        arr[i][j]=c
res = arr[0][0]
print(arr)
coor1=0
coor2=0
for x in range(n1):
    for y in range(n2):
        if arr[x][y] > res:
            res = arr[x][y]
            coor1 = x+1
            coor2 = y+1
print("Max elem is ", res, " with index ", coor1, " ", coor2)
