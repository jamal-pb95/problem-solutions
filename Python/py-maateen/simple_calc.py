class Calculator:
  def add(self, a, b):
    return a + b

  def sub(self, a, b):
    return a - b

  def mult(self, a, b):
    return a * b

  def div(self, a, b):
    try:
      return a / b
    except ZeroDivisionError:
      return "Not Divide By Zero."


class SuperCalculator(Calculator):
  def square(self, a):
    return a * a

  def cube(self, a):
    return a * a * a


my_calc = SuperCalculator()
print(my_calc.add(23, 8))
print(my_calc.sub(25, 5))
print(my_calc.mult(5, 5))
print(my_calc.div(10, 2))
print(my_calc.square(5))
print(my_calc.cube(3))
