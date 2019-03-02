// Calculation of Bonus
#include <stdio.h>

int main(void)
{
  int bonus, current_year, year_of_join, year_of_service;

  printf("Enter current year\nEnter joining year\n");
  scanf("%d %d", &current_year, &year_of_join);

  year_of_service = current_year - year_of_join;

  if (year_of_service > 3)
  {
    bonus = 2500;
    printf("Bonus is TK = %d", bonus);
  }

  return 0;
}
