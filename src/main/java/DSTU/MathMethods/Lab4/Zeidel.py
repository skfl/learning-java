import numpy as np

eps = 0.00001
A = np.zeros((3, 3))
b = np.zeros(3)
A[0][0] = 5;
A[0][1] = -2;
A[0][2] = 1;
b[0] = -10;

A[1][0] = -2;
A[1][1] = 4;
A[1][2] = -2;
b[1] = 7;

A[2][0] = 1;
A[2][1] = -2;
A[2][2] = 5;
b[2] = 2;



def seidel(A, b, eps):
    n = len(A)
    x = np.zeros(n)  # zero vector

    converge = False
    while not converge:
        x_new = np.copy(x)
        for i in range(n):
            s1 = sum(A[i][j] * x_new[j] for j in range(i))
            s2 = sum(A[i][j] * x[j] for j in range(i + 1, n))
            x_new[i] = (b[i] - s1 - s2) / A[i][i]

        converge = np.sqrt(sum((x_new[i] - x[i]) ** 2 for i in range(n))) <= eps
        x = x_new

    return x


print(seidel(A, b, eps))
