#include<stdio.h>
main()
{
	int a[3][3],i,j,b,c=0;
	printf("Enter the elements of the array ");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	b=a[0][0];
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(i==j)
			{
				if(a[i][j]!=b)
				{
					c=1;
					break;
				}	
			}
			else
			{
				if(a[i][j]!=0)
				{
					c++;
					break;
				}
			}
		}
	}
	if(c>0)
	{
		printf("Not a Scaler Matrix");
	}
	else
	{
		printf("Scaler Matrix");
	}
}
