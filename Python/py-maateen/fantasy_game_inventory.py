inv = {'gold coin': 42, 'rope': 1}
lot = ['gold coin', 'dagger', 'gold coin', 'gold coin', 'ruby']


def displayInventory(inventory):
  print('Inventory:\n')
  item_total = 0

  for k, v in inventory.items():
    item_total += v
    print(v, k)

  print('\nTotal number of item in inventory = ' + str(item_total))


def addToInventory(inventory, addedItems):

  for item in addedItems:
    if item in inventory:
      inventory[item] += 1
    else:
      inventory[item] = 1

  displayInventory(inventory)


addToInventory(inv, lot)
