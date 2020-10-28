#include<stdio.h>
void main()
{
	int a=0,b=1,c,i,n;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	if(n==1)
	{
		printf("0");
	}
	else if(n==2)
	{
		printf("0 1");
	}
	else if(n>2)
	{
		printf("0 1 ");
		for(i=3;i<=n;i++)
		{
			c=a+b;
			printf("%d ",c);
			a=b;
			b=c;
		}
	}
}
