n = int(input())
length = 0
while n>0:
    n//=10
    length+=1
print(length)