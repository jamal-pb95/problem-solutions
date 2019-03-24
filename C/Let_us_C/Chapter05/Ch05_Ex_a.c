// calculate sum of all digits of given number without recursion
#include <stdio.h>

int main(void)
{
    int num, temp, digit, sum = 0;

    printf("Enter number\n");
    scanf("%d", &num);

    temp = num;

    while (num > 0)
    {
        digit = num % 10;
        sum += digit;
        num /= 10;
    }

    printf("Given number = %d and sum of the number = %d", temp, sum);
    return 0;
}
