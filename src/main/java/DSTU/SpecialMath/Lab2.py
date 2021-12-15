import sympy as sp
from sympy import *

data = Matrix([[16/52, 2/5, 4/5], [1, 5, 2], [-4/5, -8/5, 4/5]])
a = sp.Matrix.eigenvals(data)
i = 1
for key in a.keys():
    print("λ", i, "=", key)
    i += 1
b = sp.Matrix.eigenvects(data)
for i in range(len(b)):
    print(b[i][2][0])
