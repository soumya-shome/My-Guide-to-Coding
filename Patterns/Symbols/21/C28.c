#include<stdio.h>
void main()
{
	int n,i,j,q,t,k,s,sp;
	printf("Enter the terms: ");
	scanf("%d",&n);
	if(n%2==0)
		t=(n*2-1)/2;
	else
		t=((n*2-1)/2)+1;
	sp=t-1;
	for(i=1;i<=t;i=i+2)
	{
		for(s=1;s<=sp;s++)
		{
			printf(" ");
		}
		sp--;
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
		if(i==t)
		{
			
			if(n%2==0)
			{
				q=t;
				sp+=1;
			}
			else
			{
				q=t-2;
				sp+=2;
			}
			for(k=q;k>=1;k=k-2)
			{
				for(s=1;s<=sp;s++)
				{
					printf(" ");
				}
				sp++;
				for(j=1;j<=k;j++)
				{
					printf("*");
				}
				printf("\n");
			}
		}
	}
}
