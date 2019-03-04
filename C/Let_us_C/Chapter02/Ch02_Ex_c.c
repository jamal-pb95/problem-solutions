/* 
Any year is input through the keyboard. Write a program to
determine whether the year is a leap year or not
 */
#include <stdio.h>

int main(void)
{
  int year;

  scanf("%d", &year);

  if (year % 4 == 0)
  {
    if (year % 100 == 0)
    {
      if (year % 400 == 0)
      {
        printf("Yay! %d is a leap year.", year);
      }
      else
      {
        printf("Sorry! %d is not a leap year.", year);
      }
    }
    else
    {
      printf("Yay! %d is a leap year.", year);
    }
  }
  else
  {
    printf("Sorry! %d is not a leap year.", year);
  }

  return 0;
}
