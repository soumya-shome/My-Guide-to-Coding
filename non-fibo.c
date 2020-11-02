#include<stdio.h>
void main()
{
	int a=0,b=1,c=0,d=0,e=0,m;
	printf("Enter the number of terms");
	scanf("%d",&m);
	while(e!=m)
	{
		if((c-d)>1)
		{
			//printf("missing = %d \n",d+1);
			printf("%d, ",d+1);
			e++;
			d++;
		}
		else
		{
			c=a+b;
			//printf("Fibo char = %d \n",c);
			a=b;
			d=b;
			b=c;
		}
	}
}
