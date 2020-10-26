#include<stdio.h>
void main()
{
	int x,y,res;
	char s=' ';
	printf("Enter operation [ + , - , * , / ] : ");
	scanf("%c",&s);
	printf("Enter 1st number: ");
	scanf("%d",&x);
	printf("Enter 2nd number: ");
	scanf("%d",&y);
	
	switch(s){
		case '+':
			res=x+y;
			printf("Summation : %d",res);
		break;
	
		case '-':
			res=x-y;
			printf("Difference : %d",res);
		break;
		
		case '*':
			res=x*y;
			printf("Product : %d",res);
		break;
		
		case '/':
			res=x/y;
			printf("Division : %d",res);
		break;
		
		default:
			printf("Wrong Input !!");
		break;
	}
}
	
	

