def is_prime(number):
  if number <= 1:
    raise ValueError('The number is must be greater than 1.')
  elif number <= 3:
    return True
  elif (number % 2) == 0 or (number % 3) == 0:
    return False
  else:
    i = 5
    while (i * i) <= number:
      if (number % 2) == 0 or (number % i + 2) == 0:
        return False
    return True

print('Enter an integer numbers')
n = int(input())

if is_prime(n):
  print('Yay!', n, 'is a prime number.')
else:
  print('Opps!', n, 'is not a prime number.')