import random
from random import randrange

a = 47
b = 84
n1 = 5
n2 = 9
arr = [[i for j in range(n2)] for i in range(n1)]
for i in range(n1):
    for j in range(n2):
        c=random.randint(a,b)
        arr[i][j]=c
print(arr)

