#include<stdio.h>
void main()
{
	int i,w=0,n;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			a=pow(3,w);
			printf("%d , ",a);
		}
		else
		{
			b=pow(4,w);
			printf("%d , ",b);
			w++;
		}
	}
}
