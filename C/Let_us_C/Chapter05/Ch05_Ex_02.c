#include <stdio.h>

int main(void)
{
    int a, b;
    long pow, power();

    printf("Enter a:\nEnter b:\n");
    scanf("%d %d", &a, &b);

    pow = power(a, b);
    printf("%d", pow);

    return 0;
}

long power(int x, int y)
{
    int i;
    long p = 1;

    for (i = 0; i < y; i++)
    {
        p *= x;
    }
    return p;
}
