a_list = ['Name', 'Country', 'Career']
b_list = ['Jamal Uddin', 'Bangladesh', 'Software Developer']
my_dict = {i: j for i, j in zip(a_list, b_list)}
print(my_dict)
my_dict['Career'] = 'Software Engineer'
print(my_dict)
