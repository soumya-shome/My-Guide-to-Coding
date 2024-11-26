#include<stdio.h>
void main()
{
	int a;
	printf("Enter a number : ");
	scanf("%d",&a);
	if(a%2!=0)
	{
		printf("%d is an Odd Number",a);
	}
	else
	{
		printf("%d is an Even Number",a);
	}
}