/* 
Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical
operators && and ||
 */
#include <stdio.h>

int main(void)
{
  int year;

  printf("Enter a year \n");
  scanf("%d", &year);

  if ((year % 400) == 0)
    printf("%d is a leap year \n", year);
  else if ((year % 100) == 0)
    printf("%d is a not leap year \n", year);
  else if ((year % 4) == 0)
    printf("%d is a leap year \n", year);
  else
    printf("%d is not a leap year \n", year);

  return 0;
}
