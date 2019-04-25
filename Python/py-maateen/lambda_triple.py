from itertools import product


def triple(x): return x * 3


def add(x, y): return x + y


print(add(triple(3), 4))

a = {1, 2}
print(len(list(product(range(3), a))))
print(len(list(product(range(3), a))))
