/* 
Any character is entered through the keyboard, write a
program to determine whether the character entered is a
capital letter, a small case letter, a digit or a special symbol
 */
#include <stdio.h>

int main(void)
{
  int e;
  char ch;

  printf("Enter a character:\n");
  scanf("%c", &ch);

  e = ch;

  if (e > 64 && e < 91)
    printf("%c is a capital letter.", ch);
  else if (e > 96 && e < 123)
    printf("%c is a small letter.", ch);
  else if (e > 47 && e < 58)
    printf("%c is a digit", ch);
  else
    printf("%c is a special symbol");

  return 0;
}
