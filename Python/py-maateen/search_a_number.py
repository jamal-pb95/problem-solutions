my_list = [1, 3, 5, 7, 11, 13, 15, 17, 20, 26, 31, 44, 54, 56, 65, 77, 94, 100]

print('Enter your desire number')
number = int(input())

first = 0
last = len(my_list) - 1
found = False
cycle = 0

while first <= last and not found:
  midpoint = (first + last) // 2
  if my_list[midpoint] == number:
    found = True
  else:
    if number < my_list[midpoint]:
      last = midpoint - 1
    else:
      last = midpoint + 1
  cycle += 1

print('Found after', cycle, 'cycle')
