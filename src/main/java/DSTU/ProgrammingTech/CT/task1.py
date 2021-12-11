C = 'q124w3er67t80y-a56b923cd780ef543'
print(2%2==0)

def get_C2(C):
    strok = str(C)
    tmp = ""
    for i in range(1, len(strok), 2):
        if (strok[i].isdigit()):
            if(strok[i] % 2 == 0):
                tmp = strok.replace(strok[i], "")
    print(tmp)
    return tmp


print(get_C2(C))
