print('Enter your word:')
word = input()
word = word.casefold()
reversed_word = word[::-1]

if reversed_word == word:
  print('Great! this word is palindrome.')
else:
  print('Opps! this is not a palindrome.')
