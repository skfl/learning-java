import random

a = []
for i in range(5):
    a.append(random.randint(0, 10))
a = [1, 2, 3, 3, 5, 3]
print(a)
cnt = 0

for i in range(len(a)):
    for j in range(len(a)):
        if i == j:
            pass
        elif a[i] == a[j]:
            break
    else:
        cnt+=1
print(cnt)