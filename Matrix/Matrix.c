#include<stdio.h>
#include<conio.h>

main()
{
	int x,z[2][2],y[2][2],i,j,q,e,w,j2,q1,q2,e1,e2;
	printf("Enter the order of matrix: \n");
	scanf("%d",&x);
	for(i=0;i<2;i++)
	{
		printf("Enter the numbers in the IST Matrix: \n");
		for(j=0;j<2;j++)
		{
			scanf("%d",&z[i][j]);
		}
	}
	for(w=0;w<2;w++)
	{
		printf("Enter the values for the 2ND Matrix: \n");
		for(j2=0;j2<2;j2++)
		{
			scanf("%d",&y[w][j2]);
		}
	}
	for(q1=0;q1<2;q1++)
	{
		for(e1=0;e1<2;e1++)
		{
			printf("%d ",&z[q1][e1]);
		}
		printf("\n");
	}
	for(q2=0;q2<2;q2++)
	{
		for(e2=0;e2<2;e2++)
		{
			printf("%d",&y[q2][e2]);
		}
		printf("\n");
	}
	
}



