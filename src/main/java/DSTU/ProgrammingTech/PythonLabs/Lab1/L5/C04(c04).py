import math

x=1
while x<3:
    y = math.log1p(math.fabs(math.sin(2*x)))+math.tan(-1*x)
    print(y)
    x+=0.1
print("////////////")

x=1
while x<100:
    y = (math.exp(2*x^2))/(math.log10(3*x))
    print(y)
    x+=5