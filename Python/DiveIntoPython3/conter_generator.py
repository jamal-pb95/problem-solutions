def make_counter(x):
    print('entering make_counter')
    while True:
        yield x
        print('incrementing x')
        x = x + 1


counter = make_counter(2)

print(next(counter))    # 2
print(next(counter))    # 3
print(next(counter))    # 4
print(next(counter))    # 5
