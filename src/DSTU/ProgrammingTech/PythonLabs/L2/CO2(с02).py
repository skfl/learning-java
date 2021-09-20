c = 60
a = 45
b = 95
tup = ()
for x in range(7):
    new = int(input())
    tup = tup + (new,)
i = 0
cnt=0
while i < len(tup):
    if (tup[i]>45) & (tup[i]<95):
        if tup[i]>c:
            cnt +=1
    i+=1
print(cnt)
