#include<stdio.h>
void main()
{
	int i,n,s,t;
	for(i=100;i<=999;i++)
	{
		n=i;
		s=0;
		while(n!=0)
		{
			t=n%10;
			s=s+(t*t*t);
			n=n/10;
		}
		if(i==s)
		{
			printf("%d\n",i);
		}
	}
}
