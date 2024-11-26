#include<stdio.h>
void main()
{
	int n,i,j,s,sp;
	printf("Enter the terms: ");
	scanf("%d",&n);
	sp=0;
	for(i=(n*2)-1;i>=1;i=i-2)
	{
		for(s=1;s<=sp;s++)
		{
			printf(" ");
		}
		sp++;
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
