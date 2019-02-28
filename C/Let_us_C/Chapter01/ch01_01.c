// Calculation of simple interest
// Author: Jamal
// Date: Feb 28, 2019

#include <stdio.h>

int main(void)
{
  int p, n;
  float r, si;

  // get user input
  printf("Enter the value of p, n and r:");
  scanf("%d %d %f", p, n, r);

  // formula for simple interest
  si = p * n * r / 100;
  printf("The result is: %f", si);

  return 0;
}
