# Queue example
from collections import deque

# create an empty queue
queue = deque()

# add a few elements on the queue
queue.append(1)
queue.append(2)
queue.append(3)
queue.append(4)

# print queue
print(queue)

# remove an item
x = queue.popleft()
print(x)
print(queue)