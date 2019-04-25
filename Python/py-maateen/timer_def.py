from time import time


def timer(any_function):
  def count_time():
    start = time()
    any_function()
    stop = time()
    print(stop - start, 'Seconds')
  return count_time


@timer
def hello():
  print('Hello World!')
  return


@timer
def item():
  for i in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
    print(i)
  return


hello()
item()
