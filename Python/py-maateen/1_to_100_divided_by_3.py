my_list = []

for i in range(1, 101):
  if i % 3 == 0 and i % 5 != 0:
    my_list.append(i)

print(my_list)
