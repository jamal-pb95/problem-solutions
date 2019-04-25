print('Enter three integer numbers: ')
x, y, z = map(int, input().split())


def largest_number(a, b, c):
  if a > b and a > c:
    print(a)
  elif b > c and b > a:
    print(b)
  else:
    print(c)


largest_number(x, y, z)
