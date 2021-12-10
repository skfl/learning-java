import math
import matplotlib.pyplot as plt
import numpy as np


def f1(x):
    return -1 * x ** 2 + 2 * x + 3


def f2(x):
    return -2 * x - 3


arrf1x = list()
arrf1y = list()
j = -2

while j < 6:
    arrf1y.append(f1(j))
    arrf1x.append(j)
    j += 0.25

j = -2
arrf2x = list()
arrf2y = list()
while j < 6:
    arrf2x.append(j)
    arrf2y.append(f2(j))
    j += 0.25

x1 = -1.16
x2 = 5.16
x = []
y = []

cnt = 0
x = list()
y = list()
for i in range(math.ceil(x1), math.floor(x2) + 1, 1):
    y1 = f1(i)
    y2 = f2(i)
    if math.fabs(y1 - y2) >= 1:
        if (y1 != math.floor(y1)):
            y1 = math.floor(y1)
        else:
            y1 = math.floor(y1)
            y1 -= 1
        if (y2 != math.ceil(y2)):
            y2 = math.ceil(y2)
        else:
            y2 = math.ceil(y2)
        for j in range(y1, y2, -1):
            x.append(i)
            y.append(j)
            # print("(", i, ",", j, ")")
            cnt += 1
print("Количество точек с целыми координатами равно : ", cnt)


# counting squares
def get_arr_by_ss(start, stop, arr):
    tmp = []
    for i in range(start, stop):
        tmp.append(arr[i])
    return tmp


def get_ss(x_array, num, start):
    x = list(x_array)
    res = start
    for i in range(start, len(x)):
        if (num == x[res]):
            res += 1
    return res


tmp1 = []
tmp2 = []
stop1 = 0
stop2 = 0
start = 0
count = 0

for i in range(math.ceil(x1), math.floor(x2), 1):
    if stop2 != len(x) or stop2 < len(x):

        stop1 = get_ss(x, x[start], start)
        tmp1 = get_arr_by_ss(start, stop1, y)
        stop2 = get_ss(x, x[stop1], stop1)
        tmp2 = get_arr_by_ss(stop1, stop2, y)
        for j in tmp1:
            if tmp1.count(j - 1) == 1 and tmp2.count(j) == 1 and tmp2.count(j - 1) == 1:
                count += 1
        start = stop1
print(count, " count of squares")

# plt  output
fig, ax = plt.subplots()
ax.plot(arrf1x, arrf1y)
ax.plot(arrf2x, arrf2y)
ax.grid()
ax.set_xticks(np.arange(-2, 8, 1))
ax.set_yticks(np.arange(-15, 6, 1))
plt.scatter(x, y)
plt.show()
