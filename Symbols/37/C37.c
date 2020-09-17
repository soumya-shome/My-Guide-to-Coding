#include<stdio.h>
void main()
{
	int h,n,i,j,sp,s,k;
	printf("Enter the number of terms ");
	scanf("%d",&n);
	if(n%2!=0)
		h=n/2 +1;
	else
		h=n/2;
		
	sp=h;
	for(i=1;i<=h;i++)
	{
		for(s=1;s<=sp;s++)
		{
			printf(" ");
		}
		sp--;
		for(j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
		if(i==h)
		{
			if(n%2==0)
				sp++;
			else
				sp+=2;
			for(k=(n/2);k>=1;k--)
			{
				for(s=1;s<=sp;s++)
				{
					printf(" ");
				}
				sp++;
				for(j=1;j<=k;j++)
				{
					printf("* ");
				}
				printf("\n");
			}
		}
	}
}
