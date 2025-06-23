#include<stdio.h>
void main()
{
    int i,j,s,sp=0;
    for(i=1;i<=6;i++)
    {
        for(s=1;s<=sp;s++)
        {
            printf(" ");
        }
        sp++;
        for(j=i;j<=6;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    sp--;
    for(i=6;i>=1;i--)
    {
        for(s=1;s<=sp;s++)
        {
            printf(" ");
        }
        sp--;
        for(j=i;j<=6;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}
