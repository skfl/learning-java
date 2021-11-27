import random
a = []
for i in range(100):
    a.append(random.randint(0,10))
print(a)
for j in range(len(a)):
    if a[j] == 0:
        print('Ноль на индексе ',j+1)
        break
else:
    print("Нуля нет")