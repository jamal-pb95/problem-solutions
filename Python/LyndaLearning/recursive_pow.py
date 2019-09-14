# Power function implemented by recursion formula
def power(num, pow):
    if pow == 0:
        return 1
    else:
        return num * power(num, pow - 1)

print("{} to the power of {} is {}".format(5, 3, power(5, 3)))
print("{} to the power of {} is {}".format(5, 2, power(5, 2)))
print("{} to the power of {} is {}".format(1, 5, power(1, 5)))