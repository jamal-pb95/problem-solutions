#! python3
# renameDates.py - Renames filenames with American MM-DD-YYYY date format
# to European DD-MM-YYYY.

import shutil, os, re

# Create a regex that matches files with the American date format.
date_pattern = re.compile(r"""^(.*?) # all text before the text
        ((0|1)?\d)-                  # one or two digits for the month 
        ((0|1|2|3)?\d)-              # one or two digits for the day
        ((19|20)\d\d)                # four digits for the year
        (.*?)$                       # all text after the date
    """, re.VERBOSE)

# Loop over the files in the working directory
for amer_filename in os.listdir('.'):
    mo = date_pattern.search(amer_filename)

    # Skip files without a date
    if mo == None:
        continue
    
    # Get the different parts of the filename
    before_part = mo.group(1)
    month_part  = mo.group(2)
    day_part    = mo.group(3)
    year_part   = mo.group(4)
    after_year  = mo.group(5)

# From the European-style filename
euro_filename = before_part + day_part + '-' + month_part + '-' + year_part + after_year

# Get the full absolute file paths
abs_working_dir = os.path.abspath('.')
amer_filename   = os.path.join(abs_working_dir, amer_filename)
euro_filename   = os.path.join(abs_working_dir, euro_filename)

# Rename the files
print('Renaming "%s" to "%s"...', % (amer_filename, euro_filename))
#shutil.move(amerFilename, euroFilename)