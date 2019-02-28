// Calculation of simple interest
// Author: Jamal
// Date: Feb 28, 2019

#include <stdio.h>

int main(void)
{
  int p, n;
  float r, si;

  p = 1000;
  n = 3;
  r = 8.5;

  // formula for simple interest
  si = p * n * r / 100;
  printf("The result is: %f", si);

  return 0;
}