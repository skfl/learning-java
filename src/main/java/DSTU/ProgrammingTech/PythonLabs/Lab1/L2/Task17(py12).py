n = int(input())
length = 0
while True:
    length += 1
    n //= 10
    if n == 0:
        break
print("Длина числа равна ", length)