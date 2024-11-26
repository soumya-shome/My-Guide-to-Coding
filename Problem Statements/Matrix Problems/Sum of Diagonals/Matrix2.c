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
	printf("\n");
	printf("The new matrix: \n");
	for(r=0;r<5;r++)
	{
		for(s=0;s<5;s++)
		{
			
			if((r==s || (r+s)==4))
			 {
				printf("%d",z[r][s]);
			}
			else if(r==s && (r+s)==4)
			{
				printf("%d",z[r][s]);
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	
		
	}
	
	
	
		for(r=0;r<5;r++)
		{
		for(s=0;s<5;s++)
		{
			
			if(r==s)
			g=g+z[r][s];
			if((r+s)==4)
			y=y+z[r][s];
			v=g+y;
		}
		printf("\n");
		
	}
	printf("The sum of the right and left diagonal is: \n %d",v);
}
