# Remove vowles from a sentence using generel method

# vowels = 'aeiou'
# sentence = 'I am awesome!'
# filtered_sentence = []
#
# for letter in sentence:
#   if letter not in vowels:
#     filtered_sentence.append(letter)
#
# print(''.join(filtered_sentence))

# Remove vowles from a sentence using list comprehension method
vowels = 'aeiou'
sentence = 'I am awesome!'

filtered_sentence = ''.join(
    [letter for letter in sentence if letter not in vowels])
print(filtered_sentence)
