#include <stdio.h>

int main()
{
    int i, j, n;

    printf("Enter value of n : ");
    scanf("%d", &n);
    int h=(n%2==0)?n/2:(n/2+1);
    // Loop to print upper half of the pattern
    for(i=1; i<=h; i++)
    {
        for(j=i; j<=h; j++)
        {
            printf("* ");
        }

        for(j=1; j<=2*(i-1); j++)
        {
            printf("  ");
        }

        for(j=i; j<=h; j++)
        {
            printf("* ");
        }

        printf("\n");
    }

    // Loop to print lower half of the pattern
    for(i=h; i>=1; i--)
    {
        for(j=h; j>=i; j--)
        {
            printf("* ");
        }

        for(j=2*(i-1); j>=1; j--)
        {
            printf("  ");
        }

        for(j=h; j>=i; j--)
        {
            printf("* ");
        }

        printf("\n");
    }

    return 0;
}