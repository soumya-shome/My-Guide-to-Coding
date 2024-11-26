#include<stdio.h>
void main()
{
	int n,i,j,a=1,sp,s;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	sp=n-1;
	for(i=1;i<=(n*2-1);i+=2)
	{
		for(s=0;s<sp;s++)
		{
			printf("+");	
		}
		for(j=1;j<=i;j++)
		{
			printf("%d",a);
		}
		a++;
		for(s=0;s<sp;s++)
		{
			printf("+");
		}
		sp--;
		printf("\n");
	}
}
