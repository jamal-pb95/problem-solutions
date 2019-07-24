if 6 > 7:
    print('Yep')
else:
    print('n')

var = 'Panda'
if var == "panda":
   print("Cute!")
elif var == "Panda":
   print("Regal!")
else:
   print("Ugly...")

temp = 120
if temp > 85:
   print("Hot")
elif temp > 100:
   print("REALLY HOT!")
elif temp > 60:
   print("Comfortable") 
else:
   print("Cold")


temp = 50
if temp > 85:
   print("Hot")
elif temp > 100:
   print("REALLY HOT!")
elif temp > 60:
   print("Comfortable")
else:
   print("Cold")



# print largest odd number
x = 12
y = 33
z = 8

if x % 2 != 0:
    if x > y and x > z:
        print(x)
elif y % 2 != 0:
    if y > z and y > x:
        print(y)
elif z % 2 != 0:
    if z > x and z > y:
        print(z)
else:
    print('Nope')


num = 0
while num <= 5:
    print(num)
    num += 1

print("Outside of loop")
print(num) 

numberOfLoops = 0
numberOfApples = 2
while numberOfLoops < 10:
    numberOfApples *= 2
    numberOfApples += numberOfLoops
    numberOfLoops -= 1
print("Number of apples: " + str(numberOfApples))