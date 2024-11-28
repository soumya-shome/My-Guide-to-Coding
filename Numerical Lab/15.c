#include<stdio.h>
#include<math.h>
void main()
{
	float a,b,c,d,r1,r2,rd;;
	printf("Enter a the 3 variables");
	scanf("%f%f%f",&a,&b,&c);
	d=(b*b)-(4*a*c);
	if(d<0)
	{
		printf("The roots are imaginary");
	}
	else
	{
		rd=pow(d,0.5);
		r1=(-b+rd)/(2*a);
		r2=(-b-rd)/(2*a);
		printf("The roots are %f, %f",r1,r2);
		
	}
}
