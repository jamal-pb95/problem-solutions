def myfunc(one, two, three, *therest):
  print("The first one is... %d" % (one))
  print("The second one is... %d" % (two))
  print("The third one is... %d" % (three))
  print("The rest of them are... %s" % list(therest))


myfunc(12, 25, 78, 45, 12, 45, 15, 40)
