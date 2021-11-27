import math
import random


def task1():
    a = list()
    for i in range(10):
        a.append(random.randint(0, 10))
    b = list()
    for i in range(1, len(a), 2):
        b.append(a[i])
    print("Изначальный список\n")
    print(a)
    print("Четные элементы\n")
    print(b)


def task2():
    cnt = 0
    _7x7 = [[i for j in range(7)] for i in range(7)]
    for i in range(7):
        for j in range(7):
            c = random.randint(0, 10)
            _7x7[i][j] = c

    for f in range(len(_7x7)):
        print(_7x7[f])

    for i in range(len(_7x7)):
        for j in range(len(_7x7[i])):
            if _7x7[i][j] % 2 == 0:
                cnt += 1
        print("Строка ", i + 1, " содержит ", cnt, "четных элементов")
        cnt = 0


def task3():
    try:
        r = float(input("Введите значение радиуса "))

        if r < 0:
            print("Радиус не может быть отрицательным")
            exit()

        h = float(input("Введите значение высоты "))
        if h < 0:
            print("Высота не может быть отрицательным")
            exit()
        print("Площадь боковой поверхности цилиндра равна ", 2 * math.pi * r * h)
    except ValueError:
        print("функция получила аргумент правильного типа, но некорректного значения")


def task4(stroka):
    a = str(stroka)
    upper_case = list(['А', 'У', 'О', 'Ы', 'И', 'Э', 'Я', 'Ю', 'Ё', 'Е'])
    cnt = 0
    for i in range(len(upper_case)):
        cnt += a.count(upper_case[i])
    print("Количество прописных гласных букв в строке равно ", cnt)


def task5(stroka):
    a = str(stroka)
    b = a.split()
    print(len(b[2]))


def task6(stroka):
    a = str(stroka)
    print(a)
    b = a.split()
    tmp = str()
    for i in range(len(b)):
        if len(b[i]) > 6:
            tmp = b[i]
            b[i] = tmp[0:len(tmp) - 3]
            b[i] += "***"
    res = str()
    for i in range(len(b)):
        res += b[i]
        res += " "
    print(res)


