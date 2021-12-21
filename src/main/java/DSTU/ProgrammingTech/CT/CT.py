import random

A = list()
for i in range(26):
    A.append(random.randint(-10, 10))
print("TASK 3 \n")


def get_b(arr):
    A = list(arr)
    B = list()
    for i in range(len(A)):
        if (A[i] > 0):
            B.append(A[i])
    print(B)
    print(len(B), " - количество элементов массива B")
    return str(B)


get_b(A)

S = "1ц2+1к8ке-1с0qr=ag2hk01wr"

print("TASK 2 \n")


def get_KNUM(S):
    strok = str(S)
    KNUM = tuple()
    tmp_KNUM = list()
    tmp = list()
    for i in range(0, len(strok), 2):
        tmp.append(strok[i])
    for char in strok:
        if (char.isalpha()):
            pass
        else:
            tmp_KNUM.append(char)
    KNUM = tuple(tmp_KNUM)
    print(tmp)
    print(KNUM)
    return str(KNUM)


get_KNUM(S)
print("TASK 1 \n")

C = 'q124w3er67t80y-a56b923cd780ef543'


def get_C2(C):
    strok = str(C)
    tmp = ""
    C2 = ""
    arr = list()
    tmp_arr = list(strok)
    for i in range(1, len(strok), 2):
        if (strok[i].isdigit()):
            if (int(strok[i]) % 2 == 0):
                arr.append(i)
    for i in arr:
        tmp_arr[i] = ""
    C2 = ''.join(tmp_arr)
    print(C2)
    return str(C2)


get_C2(C)

f = open('Рогачков Эдуард Мурманович.txt',"a+")
f.writelines(get_b(A))
f.writelines("\n")
f.writelines(get_C2(C))
f.writelines("\n")
f.writelines(get_KNUM(S))

