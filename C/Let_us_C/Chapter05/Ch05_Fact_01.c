// Calculate Factorial with non-recursive way
#include <stdio.h>

int main(void)
{
    int a, fact;

    printf("Enter any number\n");
    scanf("%d", &a);

    fact = factorial(a);
    printf("Factorial value of %d is %d", a, fact);

    return 0;
}

int factorial(int x)
{
    int f = 1, i;

    for (i = x; i >= 1; i--)
    {
        f *= i;
    }

    return f;
}