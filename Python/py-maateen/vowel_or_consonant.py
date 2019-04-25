print('Enter a valid alphabet: ')
char = input()

if char >= 'a' and char <= 'z' or char >= 'A' and char <= 'Z':
  if char in 'AEIOUaeiou':
    print('Vowel')
  else:
    print('Consonant')
else:
  print('Nothing')
