"""
    python3
    map_it.py - Launches a map in the browser using an address # from the command line or clipboard.
"""

import webbrowser, sys

address = 'Uday Tower, Gulshan Avenue, Dhaka-1212, Bangladesh.'
webbrowser.open('https://www.google.com/maps/place/' + address)