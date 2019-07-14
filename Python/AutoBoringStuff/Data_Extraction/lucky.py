"""

Python3
Open several Google search results

"""

import sys, webbrowser, bs4, requests

print('Googling...') # display text while downloading the google page
res = requests.get('https://www.google.com/serach?q=' + ' '.join(sys.argv[1:]))
res.raise_for_status()

# retrive top search result links
soup = bs4.BeautifulSoup(res.text)

# open a browser tab for each result
link_elems = soup.select('.r a')
num_open = min(5, len(link_elems))
for i in range(num_open):
    webbrowser.open('https://www.google.com/' + link_elems[i].get('href'))
