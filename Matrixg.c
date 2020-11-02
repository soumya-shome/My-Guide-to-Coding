#include<stdio.h>
#include<conio.h>

main()
{
	int x,z[5][5],i,j,q,e,w,r,s=0,t,n;
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
	for(r=0;r<5;r++)
	{
		for(s=0;s<5;s++)
		{
			if(r==s)
			printf("%d ",z[r][s]);
			
		}
		
	}
}



