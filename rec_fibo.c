#include<stdio.h>
void rec(int a , int b,int n)
{
	int sum;
	if(n>0)
	{
		sum = a+b;
		printf("%d ",sum);
		a=b;b=sum;
		rec(a,b,n-1);
	}
}

void main()
{
	int a,b,sum , n;
	int i;
	a=0;b=1;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	printf("0 1 ");
	rec(a,b,n-2);
	
}
