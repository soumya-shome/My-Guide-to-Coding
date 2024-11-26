#include<stdio.h>
void main()
{
    int n1,n2, binAdd;
    printf("Input first integer value: ");
    scanf("%d",&n1);
    printf("Input second integer value: ");
    scanf("%d",&n2);
    int c;
    while (n2 != 0) {
        c = (n1 & n2) << 1;
        n1=n1^n2;
        n2=c;
    }
    binAdd=n1;
    printf("Binary Addition: %d\n",binAdd);
}