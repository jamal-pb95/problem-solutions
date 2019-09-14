# Factorial function implemented by recursion formula
def factorial(x):
    if x == 0:
        return 1
    else:
        return x * factorial(x - 1)

print("{}! is {}".format(5, factorial(5)))
print("{}! is {}".format(0, factorial(0)))
print("{}! is {}".format(20, factorial(20)))