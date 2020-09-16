#include<stdio.h>
void main()
{
	int i,j,sp,s=0,k;
    for(i=7;i>=1;i--)
    {
		for(j=1;j<=i;j++)
		{
			printf("%d",j);
		}
		for(sp=1;sp<=s;sp++)
		{
			printf(" ");
		}
		s=s+2;
		for(k=i;k>=1;k--)
		{
			printf("%d",k);
		}
		printf("\n");
    }
}
