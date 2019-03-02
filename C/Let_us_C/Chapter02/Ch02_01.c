// Calculation of total expenses
#include <stdio.h>

int main(void)
{
  int qty, dis = 0;
  float rate, total;

  printf("Enter qty\nEnter rate\n");
  scanf("%d %f", &qty, &rate);

  if (qty > 1000)
  {
    dis = 10;
    total = (qty * rate) - (qty * rate * dis / 100);
    printf("Total expenses TK = %f", total);
  }

  return 0;
}
