#include<stdio.h>
void main()
{
	int n,i,j;
	int a=2;
	double s=1,f;
	printf("Enter the number of terms");
	scanf("%d",&n);
	for(i=2;i<=n;i++)
	{
		f=1;
		for(j=1;j<=(a+1);j++)
		{
			f=f*j;
		}
		s=s+(a/f);
		a=a+2;
	}
	printf("Sum: %f",s);
}
