def gcd(a, b):
  if b > a:
    gcd(b, a)
  while b != 0:
    temp = a % b
    a = b
    b = temp
  return a


print('Enter two integer numbers:')
x, y = map(int, input().split())

print(gcd(x, y))
