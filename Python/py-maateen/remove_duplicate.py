def remove_duplicate(items):
  unique = []

  for item in items:
    if item not in unique:
      unique.append(item)
  return unique

numbers = [21, 23, 12, 11, 22, 21, 11, 1, 1, 3]
print(remove_duplicate(numbers))