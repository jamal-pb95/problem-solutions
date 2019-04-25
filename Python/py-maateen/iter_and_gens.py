# reverse range class
class reverange:
  def __init__(self, n):
    self.n = n
    self.i = n

  def __iter__(self):
    return self

  def __next__(self):
    if self.n >= 0:
      if self.i == self.n:
        self.n = self.n - 1
        return self.i
      else:
        self.i = self.n
        self.n = self.n - 1
        return self.i
    else:
      raise StopIteration


for i in reverange(5):
  print(i)

print('End Iterator method and below yield generator method\n')

# generator reverange function


def reverserange(n):
  while n >= 0:
    yield n
    n = n - 1


for i in reverserange(5):
  print(i)
