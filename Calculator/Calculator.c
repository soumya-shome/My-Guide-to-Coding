#include<stdio.h>
#include<conio.h>

main()
{
	int x,y,s,d,p,di;
	char z;
	printf("Enter two numbers: \n");
	scanf("%d %d",&x,&y);
	
	printf("Enter what you want to do[ + , - , * , / ]");
	scanf("%c",&z);
	if(z=='+')
	{
		s=x+y;
		printf("The sum is: \n %d",s);
}
	else if(z=='-')
	{
		d=x-y;
		printf("The product is: \n %d",d);
	}
	else if(z=='*')
	{
		p=x*y;
		printf("The product is: \n %d",p);
	}
	else
	{
		di=x/y;
		printf("The division is: \n %d",di);
	}
		}
	
	

