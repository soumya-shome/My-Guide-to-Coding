#include<stdio.h>
void main()
{
	int t,f,d,c=0,s,y,v;
	printf("Enter a number: \n");
	scanf("%d",&f);
	t=f*f;
	while(t>0){
		d=t%10;
		c++;
		t=t/10;
	}
	if(c==2){
		s/=10;
		y=c%10;
		v=s+y;
		//printf("%d",v);
	
	}
	else{
		s=c/100;
		y=c%100;
		v=s+y;
		//printf("%d",v);
	
	}
	if(v==t){
		printf("The number is Kaprakar number");
	}
	else{
		printf("The number is not a Kaprakar number");
	}
}