import random
from random import randrange

a = 49
b = 84
n1 = 5
n2 = 9

arr = [[i for j in range(n2)] for i in range(n1)]
for i in range(n1):
    for j in range(n2):
        c=random.randint(a,b)
        arr[i][j]=c

print(arr)
max = arr[0][0]

for j in range(n1):
    for i in range(n2):
        if arr[j][i]>max:
            max = arr[j][i]
    else:
        print("Максимальный элемент строки номер",j+1,'равен ',max)
        max = 0