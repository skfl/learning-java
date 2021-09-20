a = []
t = ()
n = int(input())
for i in range(n):
    new=int(input())
    a.append(new)
    t = t + (new +10,)
print(a,t)