def prime_number(start_num, end_num):
  for num in range(start_num, end_num+1):
    if num > 1:
      for i in range(2, num):
        if (num % i) == 0:
          break
      else:
        print(num)


prime_number(2, 100)
