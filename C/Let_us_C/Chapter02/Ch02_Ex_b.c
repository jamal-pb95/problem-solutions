/* 
Any integer is input through the keyboard. Write a program to
find out whether it is an odd number or even number.
 */

#include <stdio.h>

int main(void)
{
  int n;
  scanf("%d", &n);

  n % 2 == 0 ? printf("Even") : printf("Odd");

  return 0;
}
