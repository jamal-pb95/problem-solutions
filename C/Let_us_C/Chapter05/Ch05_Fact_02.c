// Calculate Factorial with recursive way
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
    int f;

    if (x == 1)
        f = 1;
    else
        f = x * factorial(x - 1);

    return f;
}
