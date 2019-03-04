/* 
A five-digit number is entered through the keyboard. Write a
program to obtain the reversed number and to determine
whether the original and reversed numbers are equal or not
 */
#include <stdio.h>
 
int main()
{
   int n, temp, reverse = 0;
 
   printf("Enter a number to reverse\n");
   scanf("%d", &n);
   
   temp = n;
 
   while (n != 0)
   {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n       = n/10;
   }
 
   temp == reverse ?
	printf("%d Passed", reverse) :
	printf("%d Fail", reverse);
 
   return 0;
}
