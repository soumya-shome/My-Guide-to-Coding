#include<stdio.h>
#include<conio.h>

main()
{
	int x,z[5][5],i,j,q,e,w,r,s,t,n,y=0,v,
	g=0;
	for(i=0;i<5;i++)
	{
		printf("Enter the numbers in the IST Matrix: \n");
		for(j=0;j<5;j++)
		{
			scanf("%d",&z[i][j]);
		}
	}
	
	printf("IST MATRIX: \n");
	for(t=0;t<5;t++)
	{
		for(n=0;n<5;n++)
		{
			printf("%d ",z[t][n]);
		}
		printf("\n");
	}
	printf("The new matrix is: \n");
	int p=0;
	for(q=0;q<5;q++)
	{
		for(s=q+1;s<5;s++)
		{
			if(z[q][s]!=0)
			{
				p=1;
				break;
			}
		}
	}
	if(p==0)
	{
		printf("The given matrix is Lower_Traingular matrix");
	}
	else
	{
		printf("The given matrix is Upper_Traingular matrix");
	}
}
