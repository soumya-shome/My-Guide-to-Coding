#include<stdio.h>
void main()
{
	int x,d,r=0;
	printf("Enter a number:\n");
	scanf("%d",&x);
	while(x>0){
		d=x%10;
		r=(r*10)+d;
		x=x/10;
	}
	printf("%d\n",r);	
}