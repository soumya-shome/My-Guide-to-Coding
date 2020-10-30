#include<stdio.h>
void main()
{
    int n1, n2, gcd, lcm, rem, num, den;
    printf("Enter 1st number : ");
    scanf("%d",&n1);
    printf("Enter 2nd number : ");
    scanf("%d",&n2);
    num = n2;
    den = n1;
    rem = num % den;
    while (rem != 0){
        num   = den;
        den = rem;
        rem   = num % den;
    }
    gcd = den;
    lcm = n1 * n2 / gcd;
    printf("GCD of %d and %d : %d\n", n1, n2, gcd);
    printf("LCM of %d and %d : %d", n1, n2, lcm);
}