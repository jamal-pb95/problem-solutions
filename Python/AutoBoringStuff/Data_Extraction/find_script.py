import bs4

example_file = open('f:/Projects/problem-solving/Python/AutoBoringStuff/Data_Extraction/index.html')
example_soup = bs4.BeautifulSoup(example_file.read())
elems = example_soup.select('#author')
# print(type(elems))
# print(len(elems))
# print(type(elems[0]))
# print(elems[0].getText())
# print(str(elems[0]))
# print(elems[0].attrs)
p_elems = example_soup.select('p')
# print(str(p_elems[0]))
print(p_elems[0].getText())