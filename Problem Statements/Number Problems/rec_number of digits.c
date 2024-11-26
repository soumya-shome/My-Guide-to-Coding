#include<stdio.h>
int rec(int n,int a)
{
	if(n>0)
	{
		n=n/10;
		a++;
		return rec(n,a);
	}
	else
	{
		return a;
	}
}
main()
{
	int n,a;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	a=rec(n,0);
	printf("%d ",a);
}
