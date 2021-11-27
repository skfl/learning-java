a = [25, 56, 18, 10, 2, 37, 26, 17]
def step2_3(x):
    print(x,x*x," - квадрат ",x**3,' - куб')

for x in a:
    if x >=10 and x<=30:
        step2_3(x)
    elif x <10:
        print(x," меньше 10")
    elif x>30:
        print(x," больше 30")