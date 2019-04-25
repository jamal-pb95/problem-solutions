class SuperClaculator:
  """Do addition, subtraction, multiplication, division, square & cube."""

  def addition(self, a, b):
    return a + b

  def subtraction(self, a, b):
    return a - b

  def multiplication(self, a, b):
    return a * b

  def division(self, a, b):
    try:
      return a / b
    except ZeroDivisionError:
      return "It\'s not possible to divide by zero."

  def square(self, a):
    return a * a

  def cube(self, a):
    return a * a * a


my_calculator = SuperClaculator()

print("Add", my_calculator.addition(78, 2))
print("Sub", my_calculator.subtraction(55, 32))
print("Mult", my_calculator.multiplication(78, 20))
print("Div", my_calculator.division(78, 2))
print("Square", my_calculator.square(78))
print("Cube", my_calculator.cube(5))
