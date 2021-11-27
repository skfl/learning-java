fio = "Рогачков Эдуард"
sp = ['а', 'в', 'г', 'д', 'и', 'о']
cnt=0
for i in range(len(sp)):
    cnt += fio.count(sp[i])
print(cnt)