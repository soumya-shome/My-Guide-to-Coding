#include<stdio.h>
void main()
{
	int a[100][100],m,n,i,j,t[100],b[100],h[100];
	printf("Enter the number of students ");
	scanf("%d",&m);
	printf("Enter the number of subjectss ");
	scanf("%d",&n);
	for(i=0;i<100;i++)
	{
		t[i]=0;
		b[i]=0;
		h[i]=0;
	}
	for(i=0;i<m;i++)
	{
		printf("Enter the marks of %d Student \n",i+1);
		for(j=0;j<n;j++)
		{
			printf("Enter the marks of %d subject ",j+1);
			scanf("%d",&a[i][j]);
		}	
	}	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			t[i]=t[i]+a[i][j];
		}
		b[i]=t[i]/n;
	}
	for(j=0;j<n;j++)
	{
		for(i=0;i<m;i++)
		{
			if(h[j]<a[i][j])
			{
				h[j]=a[i][j];
			}
		}
	}
	for(i=0;i<m;i++)
	{
		printf("Student number - %d\n",i+1);
		for(j=0;j<n;j++)
		{
			printf("Subject number - %d, Marks = %d\n",(j+1),a[i][j]);
		}
		printf("Total = %d , Average = %d\n",t[i],b[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("Hightest in %d subject = %d\n",(i+1),h[i]);
	}
}