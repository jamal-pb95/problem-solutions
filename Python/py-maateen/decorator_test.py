# def get_int_as_str(num):
#     return str(num)

# def print_int(my_func, number):
#     print(my_func(number))
#     return

# print(get_int_as_str, 120)

def get_int_as_str(num):
    print(str(num))
    return

def print_int(my_func, number):
    return my_func(number)

print(print_int(get_int_as_str, 120))