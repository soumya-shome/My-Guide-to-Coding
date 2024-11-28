#include<stdio.h>
#include<conio.h>

int Prime(int n,int i,int f1);

int main()
{
	int i=1,prim,f1,n,t;
	printf("Enter a number: \n");
	scanf("%d",&t);
	prim=Prime(n,1,0);
	if(prim==2)
	printf("It is a Prime number");
	
	else
	printf("It is not a Prime number");
}

int Prime(int y,int i2,int f12)
{
	if(y%i2==0)
	f12++;
	
	if(y==i2)
	return f12;
	
	else
	return Prime(y,i2+1,f12);
}
