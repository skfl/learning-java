import numpy as np

data = np.array([[5, -2, 1],
                 [-2, 4, -2],
                 [1, -2, 5]])
Y = np.array([[-10], [7], [2]])
x = np.array([[0], [0], [0]])
max_iter = 0
r = np.array([[-10], [7], [2]])
e = 0.0001
while np.linalg.norm(r) > e:
    t = np.dot(r.transpose(), r)[0][0] / np.dot((np.dot(data, r)).transpose(), r)[0][0]
    x = x + np.dot(t, r)
    r = Y - np.dot(data, x)
    max_iter += 1
print(x)
print(max_iter)
