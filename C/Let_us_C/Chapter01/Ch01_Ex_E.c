// Ch01_Ex_E
// Author: Md. Jamal Uddin
// Date: Mar 01, 2019

#include <stdio.h>
#define PIE 3.14

int main(void)
{
  int l, w, rect_area, rect_perimeter;
  float r, circle_area, circle_circumference;

  l = 12;
  w = 14;
  r = 32;

  rect_area = l * w;
  rect_perimeter = 2 * (l + w);

  circle_area = PIE * r * r;
  circle_circumference = 2 * PIE * r;

  printf("Area of Rectangle = %d\n", rect_area);
  printf("Perimeter of Rectangle = %d\n", rect_perimeter);

  printf("Area of Circle = %f\n", circle_area);
  printf("Circumference of Circle = %f\n", circle_circumference);

  return 0;
}
