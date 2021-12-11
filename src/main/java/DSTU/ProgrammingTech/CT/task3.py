import random

A = list()
for i in range(26):
    A.append(random.randint(-10, 10))


def get_b(arr):
    A = list(arr)
    B = list()
    for i in range(len(A)):
        if (A[i] > 0):
            B.append(A[i])
    print(B)
    print(len(B)," - количество элементов массива B")
print(A)
get_b(A)
