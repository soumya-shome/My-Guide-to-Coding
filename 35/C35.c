#include<stdio.h>
void main()
{
	int h,n,i,j,sp,s,k;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	sp=n-1;
	for(i=1;i<=n;i++)
	{
		for(s=1;s<=sp;s++)
		{
			printf(" ");
		}
		sp--;
		for(j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
}