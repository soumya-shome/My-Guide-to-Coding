#include<stdio.h>
void main()
{
	int n,i,j;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d",i);
		}
		printf("\n");
	}
}
