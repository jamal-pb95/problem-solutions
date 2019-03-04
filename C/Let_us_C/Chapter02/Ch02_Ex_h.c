/* Find the absolute value of a number entered through the keyboard */
#include <stdio.h>

int main(void)
{
  int num;

  scanf("%d", &num);

  printf("Absolute value of entered number is %d", abs(num));

  return 0;
}
