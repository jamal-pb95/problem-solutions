bill = int(input('Enter your lunch bill: '))

b = bill
temp = bill//1000
print(temp, '1000 taka note(s).')
if temp > 0:
  bill = bill % 1000
  b = bill
else:
  bill = b

temp = bill//500
print(temp, '500 taka note(s).')
if temp > 0:
  bill = bill % 500
  b = bill
else:
  bill = b

temp = bill//100
print(temp, '100 taka note(s).')
if temp > 0:
  bill = bill % 100
  b = bill
else:
  bill = b

temp = bill//50
print(temp, '50 taka note(s).')
if temp > 0:
  bill = bill % 50
  b = bill
else:
  bill = b

temp = bill//20
print(temp, '20 taka note(s).')
if temp > 0:
  bill = bill % 20
  b = bill
else:
  bill = b

temp = bill//10
print(temp, '10 taka note(s).')
if temp > 0:
  bill = bill % 10
  b = bill
else:
  bill = b

temp = bill//5
print(temp, '5 taka note(s).')
if temp > 0:
  bill = bill % 5
  b = bill
else:
  bill = b

temp = bill//2
print(temp, '2 taka note(s).')
if temp > 0:
  bill = bill % 2
  b = bill
else:
  bill = b

temp = bill//1
print(temp, '1 taka note(s).')
if temp > 0:
  bill = bill % 1
  b = bill
else:
  bill = b
