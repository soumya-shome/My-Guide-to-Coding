#include<stdio.h>
#include<conio.h>

int Kaprakar(int x);

int main()
{
	int x,kap;
	printf("Enter a number: \n");
	scanf("%d",&x);
	kap=Kaprakar(x);
	printf("Kaprakar number: %d\n",kap);
	if(x==kap)
	{
		printf("The number is Kaprakar number");
	}
	else
	{
		printf("The number is not a Kaprakar number");
	}
}

int Kaprakar(int j)
{
	int c=0,d,t,f,s,y,v;
	t=j*j;
	f=t;
	while(t>0)
	{
		d=t%10;
		c++;
		t=t/10;
	}
	
	if(c==2)
	{
		s=f/10;
		y=f%10;
		v=s+y;
		return v;
	}
	else
	{
		s=f/100;
		y=f%100;
		v=s+y;
		return v;
	}
	
}
