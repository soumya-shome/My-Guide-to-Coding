#include<stdio.h>
void main()
{
	int n,s=0,t;
	printf("Enter a number : ");
	scanf("%d",&n);
	while(n!=0)
	{
		t=n%10;
		s=s+t;
		n=n/10;
	}
	printf("Sum of digits : %d",s);
}
