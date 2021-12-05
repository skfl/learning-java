import random

x = 4
y = 20
n = 20
m = 20
arr = [[0] * n for i in range(m)]

for i in range(n):
    for j in range(m):
        arr[i][j] = random.randint(0, 15)


def output(arr):
    for i in range(len(arr)):
        print(arr[i])


def get_string(arr, num):
    return arr[num - 1]


def get_c(arr, x, y):
    c = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    print(c)
    for i in range(n):
        c[i] = arr[x - 1][i] + arr[y - 1][i]
    return c


def get_min(arr):
    min = arr[0]
    for i in range(len(arr)):
        if arr[i] < min:
            min = arr[i]
    return min


def get_max(arr):
    max = arr[0]
    for i in range(len(arr)):
        if arr[i] > max:
            max = arr[i]
    return max


def write_data(arr):
    f = open("AB.txt", "w+")
    f.writelines(str(arr))
    f.close()


def join_data(arr):
    f = open("AB.txt", "a+")
    f.write("\n")
    f.write(str(arr))
    f.close()


write_data(get_string(arr, 4))
join_data(get_string(arr, 8))

# read data
C = list()
f = open("AB.txt", "r+")
tmp = f.readlines()
for i in range(len(tmp)):
    for j in range(len(tmp[i])):
        if tmp[i][j].isnumeric():
            C.append(tmp[i][j])
for i in range(len(C)):
    C[i] = int(C[i])


def check_for_repeated(arr):
    C = list(arr)
    C.sort()
    cnt = 0
    sum = 0
    i = 0
    while i < len(C):
        while cnt < len(C) and C[i] == C[cnt]:
            cnt += 1
            sum += 1
        print("There are ", sum, " of ", C[i])
        sum = 0
        i = cnt

# C.sort()
# print(C)
# check_for_repeated(C)
