/* 
A library charges a fine for every book returned late. For first
5 days the fine is 50 paise, for 6-10 days fine is one rupee and
above 10 days fine is 5 rupees. If you return the book after 30
days your membership will be cancelled. Write a program to
accept the number of days the member is late to return the
book and display the fine or the appropriate message.
 */
#include <stdio.h>

int main(void)
{
  int days;

  printf("Enter number of due days\n");
  scanf("%d", &days);

  if (days < 6)
  {
    printf("Your fine amount is 50 paisa\n");
  }
  else if (days > 5 && days < 11)
  {
    printf("Your fine amount is 1 rupees\n");
  }
  else if (days > 10 && days < 31)
  {
    printf("Your fine amount is 5 rupees\n");
  }
  else if (days > 30)
  {
    printf("Your fine amount is 5 rupees\n");
    printf("Your membership has been canceled");
  }

  return 0;
}
