import random
import sys
from math import gcd

a = list()
for i in range(10):
    a.append(random.randint(0, 10))


def divide_by_least(a):
    arr = list(a)
    min = arr[0]
    for i in range(len(arr)):
        if arr[i] < min:
            min = arr[i]
    for i in range(len(arr)):
        if min == 0:
            print("cannot divide by 0")
            break
        else:
            arr[i] = arr[i] / min
    print(arr)


def swap_max(a):
    arr = list(a)
    max = arr[0]
    cnt = 0
    sum = 0
    for i in range(len(arr)):
        if arr[i] > max:
            max = arr[i]
    for i in range(len(arr)):
        if arr[i] > 0:
            cnt += 1
            sum += arr[i]
    mid = sum / cnt
    for i in range(len(arr)):
        if arr[i] == max:
            arr[i] = mid
    print(arr)


def odd_even_count(a):
    arr = list(a)
    even = 0
    for i in range(len(arr)):
        if arr[i] % 2 == 0:
            even += 1
    odd = len(arr) - even
    print('Count of even nums : ', even, ' Count of odd nums : ', odd)


def count_equal(a):
    arr = list(a)
    tmp = list()
    for i in range(len(arr)):
        if arr.count(arr[i]) > 1 and tmp.count(arr[i]) == 0:
            print("Число ", arr[i], " входит ", arr.count(arr[i]), " раза")
            tmp.append(arr[i])


def find_least_common_mult(num1, num2):
    num1 = int(num1)
    num2 = int(num2)
    tmp1 = list()
    tmp2 = list()
    lcm = 1

    if num1 < num2:
        if num2 % num1 == 0:
            lcm = num2
            print(lcm)
            exit()
    if num1 > num2:
        if num1 % num2 == 0:
            lcm = num1
            print(lcm)
            exit()
    if num1 == num2:
        lcm = num1
        print(lcm)
        exit()

    for i in range(sys.maxsize):
        if num1 * i < sys.maxsize and num2 * i < sys.maxsize:
            tmp1.append(num1 * i)
            tmp2.append(num2 * i)

    for i in range(len(tmp1)):
        for j in range(len(tmp2)):
            if tmp1[i] == tmp2[j]:
                lcm = tmp1[i]
                print(lcm)
                exit()


def lcm(a, b):
    return a * b // gcd(a, b)


print(lcm(6, 7))
