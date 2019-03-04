/* 
Given the length and breadth of a rectangle, write a program to
find whether the area of the rectangle is greater than its
perimeter. For example, the area of the rectangle with length = 5
and breadth = 4 is greater than its perimeter.
 */
#include <stdio.h>

int main(void)
{
  int length, breadth;
  float rect_area, rect_perimeter;

  scanf("%d %d", &length, &breadth);

  rect_area = length * breadth;
  rect_perimeter = 2 * (length + breadth);

  if (rect_area > rect_perimeter)
  {
    printf("true");
  }
  else
  {
    printf("false");
  }

  return 0;
}
