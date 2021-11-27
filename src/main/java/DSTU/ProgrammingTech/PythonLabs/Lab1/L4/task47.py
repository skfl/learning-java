while True:
    a = int(input('Введите число: '))
    if a <= 0:
        print('Необходимо ввести натуральное число!')
    else:
        break

res = []
while a>10:
    s = a%10
    a//=10
    res.append(s)
else:
    res.append(a)
for elem in res:
    print(elem,end='')