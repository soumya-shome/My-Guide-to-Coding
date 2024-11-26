#include<stdio.h>
#include<conio.h>

int factorial(int x);

int main()
{
	int x,fac;
	printf("Enter a number: \n");
	scanf("%d",&x);
	fac=factorial(x);
	printf("The factorial of the given number is: %d",fac);
}

int factorial(int h)
{
	int j=1,i;
	for(i=1;i<=h;i++)
	{
		j=j*i;
	}
	return j;
}
