#include <stdio.h>

int main(void){
    int size;
    printf("Enter the size of array: ");
    scanf("%d",&size);
    int array[size],key,loc=-1;
	
	for(int j=0;j<size;j++)
	{
		printf("Enter %d Element: ",j+1);
		scanf("%d",&array[j]);
	}

    printf("array[ ");
	for(int a=0;a<size;a++)
	{
		printf("%d, ",array[a]);
	}
	printf("]\n");

    printf("Enter Value To Search in Array : ");
	scanf("%d",&key);
	for(int i=0;i<size;i++)
	{
		if(key==array[i])
		{
			loc = i;
			break;
		}
	}
	if(loc!=-1)
		printf("Value Found At Index Number : %d\n",loc);
	else
		printf("Value not found in Array\n");
}