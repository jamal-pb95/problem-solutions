// Ch01_Ex_B
// Author: Jamal
// Date: Feb 28, 2019

#include <stdio.h>

int main(void)
{
  float distance, meters, feet, inches, centimeters;

  distance = 1287.32;

  meters = distance * 1000;
  feet = meters * 3.281;
  inches = meters = 39.37;
  centimeters = meters * 100;

  printf("Meters = %f\n", meters);
  printf("Feet = %f\n", feet);
  printf("Inches = %f\n", inches);
  printf("Centimeters = %f\n", centimeters);

  return 0;
}
