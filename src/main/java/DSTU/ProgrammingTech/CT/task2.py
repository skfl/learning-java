S = "1ц2+1к8ке-1с0qr=ag2hk01wr"


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

get_KNUM(S)
