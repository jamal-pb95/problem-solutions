#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d)
{
  if (a > b && a > c && a > d)
  {
    return a;
  }
  else if (b > c && b > d && b > a)
  {
    return b;
  }
  else if (c > d && c > a && c > b)
  {
    return c;
  }
  else
  {
    return d;
  }
}

int main()
{
  int a, b, c, d;
  scanf("%d %d %d %d", &a, &b, &c, &d);
  int ans = max_of_four(a, b, c, d);
  printf("%d", ans);

  return 0;
}

// Ex 2

/* #include <stdio.h>

int max(int a, int b) {
    return a > b ? a : b;
}

int max_of_four(int a, int b, int c, int d) {
    return max(a, max(b, max(c, d)));
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
} */
