/* 
If the ages of Ram, Shyam and Ajay are input through the
keyboard, write a program to determine the youngest of the
three.
 */

#include <stdio.h>

int main()
{
  int ram, shyam, ajay;

  printf("Enter age of Ram\nShyam\nAjay\n");
  scanf("%d %d %d", &ram, &shyam, &ajay);

  if (ram < shyam && ram < ajay)
    printf("Ram is the younger boy.");
  else if (shyam < ajay && shyam < ram)
    printf("Shyam is the younger boy.");
  else
    printf("Ajay is the younger boy.");

  return 0;
}
