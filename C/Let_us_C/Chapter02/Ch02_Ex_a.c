/* 
If cost price and selling price of an item is input through the
keyboard, write a program to determine whether the seller has
made profit or incurred loss. Also determine how much profit
he made or loss he incurred.
 */
#include <stdio.h>

int main(void)
{
  int cost_price, sell_price, result;

  printf("Enter cost price\nEnter sell price\n");
  scanf("%d %d", &cost_price, &sell_price);

  result = sell_price - cost_price;

  if (result > 0)
    printf("We gain some profit and the value is %d", result);
  else
    printf("We get lost and the value is %d", abs(result));

  return 0;
}
