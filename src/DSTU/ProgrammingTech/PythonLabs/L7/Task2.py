import math

a = 17 + 5
b = 17 + 3
c = 17 + 5
d = 17 + 7
y1 = (c * (math.cos(b + 3))) / ((a / 3) - 4 * d)
y2 = ((2*c)/(3*d)+math.log10(1+a/4)/(3*c-2*a))
print("y1 = ",y1," y2 = ",y2)
