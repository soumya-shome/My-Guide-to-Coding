#include<stdio.h>
void main()
{
	int n,i,j,s,sp;
	printf("Enter the number of rows");
	scanf("%d",&n);
	sp=n-1;
	for(i=0;i<n;i++)
	{
		for(s=1;s<=sp;s++)
		{
			printf(" ");
		}
		sp--;
		for(j=i;j>=0;j--)
		{
			printf("%d",j);
		}
		for(j=1;j<=i;j++)
		{
			printf("%d",j);
		}
		printf("\n");
	}
}
