import random

n1 = 3;
n2 = 5;
a = 10;
b = 100 + 17
min = 100;
max = 0
m = [[i for j in range(n2)] for i in range(n1)]
for i in range(n1):
    for j in range(n2):
        c=random.randint(a,b)
        m[i][j]=c
        if c >max:
            max=c
        if c<max:
            min=c
    print(m[i])
print('min = ',min,' max = ',max)