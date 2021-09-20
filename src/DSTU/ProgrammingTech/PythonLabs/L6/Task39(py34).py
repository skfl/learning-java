import random

n1 = 5
n2 = 10
m=[[0]*n2 for i in range(n1)]
s=[0]*n2
t=[0]*n1
for i in range(n1):
    for j in range(n2):
      a=random.randint(1000,10000)
      m[i][j]=a
      s[j]+=a
      t[i]+=a
      print('%6d' %m[i][j],end='')

    print(' s%d'%i,"=",t[i])
for j in range(n2):
  print('%6d'%s[j],end='')
