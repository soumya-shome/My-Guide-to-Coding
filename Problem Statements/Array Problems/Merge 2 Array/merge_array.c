#include<stdio.h>
void main()
{
	int n1,n2,l,i;
	printf("Enter number of elements for 1st array : ");
	scanf("%d",&n1);
	printf("Enter number of elements for 2nd array : ");
	scanf("%d",&n2);
	l=n1+n2;
	int a[n1],b[n2],c[l];
	printf("Enter %d numbers for 1st array : ",n1);
	for(i=0;i<n1;i++)
		scanf("%d",&a[i]);
	printf("Enter %d numbers for 2nd array : ",n2);
	for(i=0;i<n2;i++)
		scanf("%d",&b[i]);
	int q=0;
	for(i=0;i<l;i++)
	{
		if(i<n1)
			c[i]=a[i];
		else{
			c[i]=b[q];
			q++;
		}
	}
	for(i=0;i<l;i++)
		printf("%d, ",c[i]);
}
