#include<stdio.h>
#include<stdlib.h>

void main()
{
	int *ptr, limit,i,sum;
	printf("Enter elements: ");
	scanf("%d",&limit);
	ptr=(int*)malloc(limit*sizeof(int));
	for(i=0;i<limit;i++){
		printf("Enter element %0d: ",i+1);
		scanf("%d",(ptr+i));
	}
	sum=0;
	for(i=0;i<limit;i++)
	{
		sum+=*(ptr+i);
	}
	printf("Sum of array elements is: %d\n",sum);
	free(ptr);
}