// Ch01_Ex_A
// Author: Md. Jamal Uddin
// Date: Feb 28, 2019

#include <stdio.h>

int main(void)
{
  int basic_salary = 18000;

  float dearness_allowance = (basic_salary / 100) * 40;
  float house_rent = (basic_salary / 100) * 20;

  float gross_salary = basic_salary + dearness_allowance + house_rent;
  printf("Ramesh\'s gross salary = %f", gross_salary);

  return 0;
}