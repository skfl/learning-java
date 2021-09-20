n = int(input())
for i in range(n):
    a = int(input())
    if a < 0:
        print("Встретилось отрицательное число", a)
        break
else:
    print("Ни одного отрицательного числа не встретилось")
