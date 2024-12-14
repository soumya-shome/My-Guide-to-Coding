#include<stdio.h>
#include<Math.h>
void main()
{
	int i,w=0,n,a,b,c;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			a=pow(3,w);
		}
		else
		{
			a=pow(4,w);
			w++;
		}
	}
	printf("%d th term = %d",n,a);
}
