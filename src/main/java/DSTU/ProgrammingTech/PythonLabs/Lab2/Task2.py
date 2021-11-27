import random

a = list()
for i in range(10):
    a.append(random.randint(0, 10))

b = list([-1, 1, -5, 2, 5, 3, 4, 5, 6, 7, 8])

rang1 = 3
rang2 = 6

_7x7 = [[i for j in range(7)] for i in range(7)]
for i in range(7):
    for j in range(7):
        c = random.randint(-5, 10)
        _7x7[i][j] = c
#for f in range(len(_7x7)):
#    print(_7x7[f])


def index_in_range(a, rang1, rang2):
    arr = list(a)
    for i in range(len(arr)):
        if (arr[i] > rang1 and arr[i] < rang2):
            print("Число " + str(arr[i]) + " принадлежит заданному диапозону " + str(rang1) + " ," + str(rang2))


def weird_mult(a):
    arr = list(a)
    cnt = 0
    res = 1
    for i in range(len(arr)):
        if (arr[i] > 0):
            if (cnt == 0 or cnt == 4 or cnt == 7):
                res *= arr[i]
            cnt += 1
    print(res)


def odd_output(a):
    arr = list(a)
    out = list()
    for i in range(len(arr)):
        if (i % 2 == 0):
            out.append(arr[i + 1])
    print("Элементы " + str(out) + " имеют четные индексы")


def swap_min_max(a):  # b
    arr = list(a)
    _min = arr[0]
    min_index = arr[0]
    _max = arr[0]
    max_index = arr[0]

    for i in range(len(arr)):
        if arr[i] > _max:
            _max = arr[i]
            max_index = i
        if arr[i] < _min:
            _min = arr[i]
            min_index = i
    print(min_index)
    print(max_index)
    arr[max_index] = _min
    arr[min_index] = _max

    print(arr)


def neg_mid(a):
    arr = list(a)
    sum = 0
    cnt = 0
    min = arr[0][0]
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] < 0:
                sum += arr[i][j]
                cnt += 1
            if arr[i][j] < min:
                min = arr[i][j]

    mid = sum / cnt
    print(mid)
    print(min)
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] == min:
                arr[i][j] = mid
    print(arr)

print(b)
swap_min_max(b)



