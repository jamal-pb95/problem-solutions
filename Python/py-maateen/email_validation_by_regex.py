import re

my_str = "purple logout jamal.pb95@gmail.com, hello junayer726@gmail.com your, friend ikbal7458@gmail.com nope"
temp = my_str.split(',')

for phrase in temp:
  result = re.search("([\w\.-]+)@([\w\.-]+)", phrase)
  print(result.group())
