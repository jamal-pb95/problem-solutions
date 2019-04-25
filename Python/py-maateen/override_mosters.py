class Monster:
  def __init__(self, name, color):
    self.name = name
    self.color = color

  def attack(self):
    print("I\'m attacking...")


class Fogthing(Monster):
  def attack(self):
    print("I\'m killing...")

  def make_sound(self):
    print("Grrrrrrrrrrr...\n")


class Mournsnake(Monster):
  def make_sound(self):
    print("Hissssssshhhh...\n")


fogthing = Fogthing("Fogthing", "Yellow")
fogthing.attack()
fogthing.make_sound()

mournsnake = Mournsnake("Mournsnake", "Red")
mournsnake.attack()
mournsnake.make_sound()
