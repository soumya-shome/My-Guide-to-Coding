#include<stdio.h>
#include<conio.h>
void main(){
	int x,r=0,x1=0,c=0,i,d;
	printf("Enter a number: \n");
	scanf("%d",&x);
	int t=x;
	for(i=1;i<=x;i++){
		if(x%i==0){
			c++;
		}
	}
	if(c==2){
		while(x>0){
			d=x%10;
			r=(r*10)+d;
			x=x/10;
		}
		for(i=1;i<=r;i++){
			if(r%i==0){
				x1++;
			}
		}
		if(x1==2){
			printf("The number is a twisted prime number");
		}
	}
	else{
		printf("The number is not a twisted prime number");
	}
}