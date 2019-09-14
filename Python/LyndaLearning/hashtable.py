# Demonstrate Hash Table usage

# create a hash table all at once
hashItems1 = dict({"key1" : 1, "key2" : 2, "key3" : 3, "key4" : 4})

# print hash table
print(hashItems1)

# create a hash table progressively
hashItems2 = {}
hashItems2["key1"] = 1
hashItems2["key2"] = 2
hashItems2["key3"] = 3

# try to access an nonexistent key
# print(hashItems1[5])

# replace an item
hashItems2["key2"] = "two"
print(hashItems2)

# iterate the keys and values in the dictionary
for key, value in hashItems2.items():
    print("kay: ", key, ", value: ", value)