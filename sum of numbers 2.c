#include<stdio.h>
#include<conio.h>

int add(int sum1,int sum2);

int main()
{
	int sum1,sum2,sum;
	printf("Enter any two numbers: \n");
	scanf("%d %d",&sum1,&sum2);
	sum=add(sum1,sum2);
	printf("The summation of the two numbers: %d",sum);
}

int add(int a,int b)
{
	int c;
	c=a+b;
	return c;
		}

