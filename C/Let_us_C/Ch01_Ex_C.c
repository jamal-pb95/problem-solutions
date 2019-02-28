// Ch01_Ex_C
// Author: Jamal
// Date: Feb 28, 2019

#include <stdio.h>

int main(void)
{
  float bengali, english, math, physics, chemistry, sum, parcentage;

  bengali = 72.5;
  english = 88;
  math = 96;
  physics = 81;
  chemistry = 76;

  sum = bengali + english + math + physics + chemistry;
  parcentage = (sum / 500) * 100;

  printf("Sum = %f\n", sum);
  printf("Parcentage = %f\n", parcentage);

  return 0;
}
