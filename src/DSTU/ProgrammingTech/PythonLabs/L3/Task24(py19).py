s = 'as10f06da02'
dig = []
for symbol in s:
    if '1234567890'.find(symbol)!=-1:
        dig.append(int(symbol))
print(dig)