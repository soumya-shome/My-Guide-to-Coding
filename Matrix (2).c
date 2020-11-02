#include<stdio.h>
#include<conio.h>
#include<math.h>

main()
{
	int x[5][5],i,j,t,y,h,k;double r;
	for(i=0;i<5;i++)
	{
		printf("Enter the numbers: \n");
		for(j=0;j<5;j++)
		{
			scanf("%d",&x[i][j]);
		}
	}
	printf("The new matrix: \n");
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			printf("%d ",x[j][i]);
		}
		printf("\n");
	}
}

