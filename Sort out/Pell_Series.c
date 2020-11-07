#include<stdio.h>
#include<conio.h>

main()
{
	int a=1,b=2,t=3,x,c;
	printf("Enter the last term: \n");
	scanf("%d",&x);
	printf("%d,%d",a,b);
	while(t<=x)
	{
		c=a+(2*b);
		a=b;
		b=c;
		printf(",%d ",c);
		t++;
		
	}
}
