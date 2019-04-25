class MagicClass:
  def __init__(self, var):
    self.var = var

  def __del__(self):
    del self.var

  def __gt__(self, x):
    return len(x) > len(self.var)

  def __lt__(self, x):
    return len(x) < len(self.var)

  def __le__(self, x):
    return len(x) <= len(self.var)

  def __ge__(self, x):
    return len(x) >= len(self.var)

  def __ne__(self, x):
    return len(x) != len(self.var)

  def __len__(self):
    return len(self.var)
