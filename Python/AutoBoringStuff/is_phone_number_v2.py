# group 
import re

phone_number_regex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
mo = phone_number_regex.search('444-555-1234')

print(mo.group()) # 444-555-1234

# several mini group
import re

phone_number_regex2 = re.compile(r'(\d\d\d)-(\d\d\d)-(\d\d\d\d)')
mo2 = phone_number_regex2.search('444-555-1234')

print(mo2.group(1)) # 444
print(mo2.group(2)) # 555
print(mo2.group(3)) # 1234
print(mo2.group()) # 444-555-1234
print(mo2.groups()) # 444, 555-1234
