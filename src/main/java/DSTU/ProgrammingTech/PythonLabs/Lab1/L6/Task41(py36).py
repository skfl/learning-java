import random
a=1;b=99;n=15
sp=[]
for i in range(n):
    c=random.randint(a,b)
    sp.append(c)
print(sp)
def sort(sp):
    for i in range(n-1):
        for j in range(i,n-i-1):
            if sp[j]>sp[j+1]:
                sp[j],sp[j+1]=sp[j+1],sp[j]
    return sp
sort(sp)
print(sp)