import numpy as np
import numpy.linalg as linalg

x1_4 = [[1, 0, 0, 2], [1, 0, -3, 1], [1, 0, 0, 2], [0, 0, 2, 1]]
x = np.array([0, 5, -2, -1])
# x1_4 = [[-1, 0, 2, 1], [1, 3, 0, 1], [-3, 0, 3, 1], [1, 2, 0, -1]]
# x = np.array([1, 2, 0, -2])
A = np.zeros((4, 4))
res = np.ndarray(len(x1_4))

for i in range(len(A)):
    for j in range(len(A[i])):
        A[i][j] = x1_4[j][i]

if linalg.det(A) != 0:
    res = linalg.solve(A, x)
    print("Система векторов x1, x2, x3, x4 образует базис")
    print("Разложение вектора х в этом базисе : ", res[0], "x1 ", res[1], "x2 ", res[2], "x3 ", res[3], "x4")
else:
    print("Определитель матрицы равен нулю")
