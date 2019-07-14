import requests, bs4

res = requests.get('http://nostarch.com')
res.raise_for_status()
no_starch_soup = bs4.BeautifulSoup(res.text)
print(type(no_starch_soup))

html_file = open('f:/Projects/problem-solving/Python/AutoBoringStuff/Data_Extraction/index.html')
html_soup = bs4.BeautifulSoup(html_file)
print(type(html_soup))