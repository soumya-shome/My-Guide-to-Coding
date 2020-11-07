#include<stdio.h>
void main()
{
	int a[100][100],b[100],t,i,j,p=0,n;
	printf("Enter the size of the square matrix ");
	scanf("%d",&n);
	printf("Enter the numbers ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("The matrix is \n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	for(i=0;i<n-1;i++)
	{
		b[p]=a[0][i];
		p++;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if((i+j)==(n-1))
			{
				b[p]=a[i][j];
				p++;
			}
		}
	}
	/*printf("\nThe array is ");
	for(i=0;i<p;i++)
	{
		printf("%d  ",b[i]);
	}
	*/
	for(i=0;i<p-1;i++)
	{
		for(j=0;j<p-i-1;j++)
		{
			if(b[j]>b[j+1])
			{
				t=b[j];
				b[j]=b[j+1];
				b[j+1]=t;
			}
		}
	}
	/*printf("\nSorted array is \n");
	for(i=0;i<p;i++)
	{
		printf("%d ",b[i]);
	}*/
	p=0;
	for(i=0;i<n-1;i++)
	{
		a[0][i]=b[p];
		p++;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if((i+j)==(n-1))
			{
				a[i][j]=b[p];
				p++;
			}
		}
	}
	
	printf("\n The new Matrix is \n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
}
