def word_count(sentence):
  count = 0

  for char in sentence:
    if char == ' ':
      count += 1
  # count plus one for last word
  count += 1
  return count


print(word_count('I Love You Beauty :)'))
