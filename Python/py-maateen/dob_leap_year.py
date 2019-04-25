DOB = int(input('Enter your DOB: '))


def is_leap_year(year):
  if year % 4 == 0:
    return 'Yay! its leap year'
  else:
    return 'It\'s not a leap year'


print(is_leap_year(DOB))
