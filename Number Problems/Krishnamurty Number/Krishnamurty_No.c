#include<stdio.h>
#include<conio.h>

int factorial(int n);

int main()
{
	int num,factor,krishna,s;
	printf("Enter a number: \n");
	scanf("%d",&num);
	factor=factorial(num);
	krishna=isSpecial(s);
	printf("Factorial: %d",factor);
	printf("%d is a Krishnamurty number",krishna);
}

int isSpecial(int n)
{
	int copy=n;
	int d,s=0;
	while(n>0)
	{
		d=n%10;
		s=s+factorial(d);
		n=n/10;
	}
	if(s==copy)
	printf("The number is Krishnamurty number");
	
	else
	printf("The number is not a Krishnamurty number");
}

