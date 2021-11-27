neStroka = "23122312313131313131"
stroka = "Том появился на тротуаре с ведром известки и длинной кистью в руках"


def find_lenght(stroka):
    return len(stroka)


def find_substr(stroka, substr):
    a = str(stroka)
    return a.find(substr)


def upper_lower_switch(stroka):
    a = str(stroka)
    return a.swapcase()


def separate_string(stroka):
    a = str(stroka)
    return a.split()


def if_num_string(stroka):
    a = str(stroka)
    return a.isnumeric()


def to_upper_case(stroka):
    a = str(stroka)
    return a.upper()


def to_ascii(stroka):
    a = str(stroka)
    words = a.split()
    asciiCodes = list()
    noFirstLit = list()
    result = list()
    output = str()

    for i in range(len(words)):
        asciiCodes.append(str(ord(words[i][0])))
    for j in range(len(words)):
        tmp = words[j]
        noFirstLit.append(tmp[1:])
    for z in range(len(words)):
        result.append(''.join([asciiCodes[z], noFirstLit[z]]))
    for x in range(len(result)):
        output += result[x]
        output += " "
    print(output)


def find(stroka):
    a = str(stroka)
    print('Строка ведром находится ' + str(a.find("ведром")) + " find")
    print('Строка ведром находится ' + str(a.rfind("ведром")) + " rfind")


def replace(stroka):
    a = str(stroka)
    a = a.replace("Том", "Тим")
    print(a)


def replace_with_count(stroka):
    a = str(stroka)
    a = a.replace('о', 'а', 3)
    print(a)
