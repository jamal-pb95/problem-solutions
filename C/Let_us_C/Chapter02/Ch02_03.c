// Calculation of Gross salary
#include <stdio.h>

int main(void)
{
  float basic_salary, gross_salary, da, hra;

  printf("Enter basic salary\n");
  scanf("%f", &basic_salary);

  if (basic_salary < 1500)
  {
    hra = (basic_salary / 100) * 10;
    da = (basic_salary / 100) * 90;
  }
  else
  {
    hra = 500;
    da = (basic_salary / 100) * 98;
  }

  gross_salary = basic_salary + hra + da;
  printf("Gross salary TK = %f", gross_salary);

  return 0;
}
