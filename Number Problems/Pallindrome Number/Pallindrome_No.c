#include<stdio.h>
void main()
{
	int n,n2,s=0,t;
	printf("Enter the number ");
	scanf("%d",&n);
	n2=n;
	while(n2!=0)
	{
		t=n2%10;
		s=s*10+t;
		n2=n2/10;
	}
	printf("Reverse of the number = %d \n",s);
	if(s==n)
		printf("It is a Pallindrome number");
	else
		printf("It is not a Pallindrome number");
}
