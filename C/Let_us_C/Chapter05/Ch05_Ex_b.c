// Calculate all the digit of given number using recursion
#include <stdio.h>

int main(void)
{
    int num, result;

    printf("Enter number\n");
    scanf("%d", &num);

    result = sum(num);

    printf("Given number = %d and sum of the number = %d", num, result);
    return 0;
}

int sum(int num)
{
    if (num != 0)
        return num % 10 + sum(num / 10);
    else
        return 0;
}