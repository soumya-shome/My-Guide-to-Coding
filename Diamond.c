#include<stdio.h>
void main()
{
	int i,f=3,k,j;
	for(i=0;i<=4;i++)
	{
		for(k=1;k<=f;k++)
					printf(" ");
			for(j=1;j<=i;j++)
		{ 
			printf("*");
		}
		printf("\n");
		f--;
	}
	
}
