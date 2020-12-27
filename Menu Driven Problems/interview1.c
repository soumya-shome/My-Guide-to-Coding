/*Write a function in C to achieve below result.
Mahesh has adopted a new training regimen . He wil do 1,2 and 3 unit of training on the first ,second and third  day 
respectively. From the 

*/


#include<stdio.h>
int gettrainingunits(int input1){
	int d1=1,d2=2,d3=3,d4,i;
	if(input1>=1 && input1<=100){
		if(input1==1)
			return d1;
		else if(input1==2)
			return d2;
		else if(input1==3)
			return d3;
		else{
			for(i=4;i<=input1;i++){
				d4=d1+d2+d3;
				d1=d2;
				d2=d3;
				d3=d4;
			}
			return d4;
		}
	}
	else{
		return -1;
	}
}

void main(){
	int n,t;
	printf("Enter the Number of Working Days");
	scanf("%d",&n);
	t=gettrainingunits(n);
	if(t==-1){
		printf("Wrong Input");
	}
	else{
		printf("Total units of Work Done :- %d",t);
	}
}
