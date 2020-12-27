#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main()
{
	int a[10][11],b[10],n,c,i,j,k;
	srand((time(NULL)));
//	printf("Enter a number ");
//	scanf("%d",&n);
	for(i=0;i<10;i++)
	{
		c=rand()%10+1;
		for(j=0;j<=c;j++)
		{
			a[i][j]=j;
		}
		a[i][j]=-1;
		for(k=j+1;k<11;k++)
		{
			a[i][k]=0;
		}
		
	}
	for(i=0;i<10;i++)
	{
		for(j=0;j<11;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	//printf("%d ",c);
}
