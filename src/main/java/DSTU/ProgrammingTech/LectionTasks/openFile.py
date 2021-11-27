file = open("sum chet nechet.txt")
array = file.readlines()
tmpArr = []
sumOdd = 0
sumEven = 0
numArr = []
for i in range(len(array)):
    tmpArr.append(array[i].strip().split(" "))
for i in range(len(tmpArr)):
    for j in range(len(tmpArr[i])):
        if (tmpArr[i][j].isdigit()):
            numArr.append(int(tmpArr[i][j]))
for i in range(len(numArr)):
    if (numArr[i] % 2 == 0):
        sumEven += numArr[i]
    else:
        sumOdd += numArr[i]
print("Сумма четных равна : ", sumEven, " Сумма нечетных равна : ", sumOdd)
