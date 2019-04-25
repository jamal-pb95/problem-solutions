my_file = open('file_rw.py', 'w')

for i in range(0, 100):
    my_file.write(str(i))
my_file.close()

my_file2 = open('file_rw.py', 'r')
content = my_file2.read()
print(content)
my_file2.close()
