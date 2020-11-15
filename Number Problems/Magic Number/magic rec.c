#include<stdio.h>
int sum(int n,int s)
{
	int d;
	if(n>0)
	{
		d=n%10;
		s=s+d;
		return sum(n/10,s);
	}
	else
	{
		return s;
	}
}

void main()
{
	int n,m;
	printf("Enter a number ");
	scanf("%d",&n);
	while(n>9)
	{
		m=sum(n,0);
		n=m;
	}
	if(n==1)
	{
		printf("Magic number");
	}
	else
	{
		printf("Not Magic Number");
	}
}
