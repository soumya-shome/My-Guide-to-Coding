#include<stdio.h>
#include<conio.h>

int factorial(int n);

int main()
{
	int num,factor;
	printf("Enter a number: \n");
	scanf("%d",&num);
	factor=factorial(num);
	printf("Factorial: %d",factor);
}

int factorial(int n)
{
	if(n==0)
	return 1;
	
	else
	return(n*factorial(n-1));
}

