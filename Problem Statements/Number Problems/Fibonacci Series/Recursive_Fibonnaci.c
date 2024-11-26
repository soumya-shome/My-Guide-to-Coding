#include<stdio.h>
#include<conio.h>

int Fibonnaci(int x);

int main()
{
	int i,z,x;
	printf("Enter the last term: \n");
		scanf("%d",&x);
	for(i=0;i<x;i++)
	{
		
		z=Fibonnaci(i);
		printf("%d,",z);
	}
}

int Fibonnaci(int n)
{
		if(n<2)
		return n;
		
		else
		return (Fibonnaci(n-1)+Fibonnaci(n-2));
			
}
