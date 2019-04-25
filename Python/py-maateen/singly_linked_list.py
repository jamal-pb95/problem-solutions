class Node:

  def __init__(self, data, next):
    self.data = data
    self.next = next


class SinglyLinkedList:

  def __init__(self):
    self.head = None
    self.length = 0

  def insert(self, data):
    self.head = Node(data, self.head)
    self.length += 1

  def remove_at_index(self, index):
    dummy = Node(None, self.head)
    prev, current = dummy, dummy.next
    check_index = 0
    while current:
      print(index, check_index)
      if index == check_index:
        prev.next = current.next
        current.next = None
      check_index += 1
      prev, current = current, current.next

  def iterate(self):
    node = self.head
    while(node):
      print(node.data)
      node = node.next

  def search(self, data):
    index = 0
    node = self.head
    while node:
      if node.data == data:
        return index
      node = node.next
      index += 1
    return -1
