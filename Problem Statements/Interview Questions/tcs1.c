#include<stdio.h>
void main()
{
	int n,a=1,b=1,d=2,e=1,q=0,f=0,i,j,c=0,m;
	printf("Enter the nth term ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			q=0;
			f=0;
			while(q!=1)
			{
				for(j=1;j<=d;j++)
				{
					if(d%j==0)
						f++;
				}
				if(f==2)
				{
					q=1;
				}
				else
				{
					d++;
					f=0;
				}
			}
			m=d;
			d++;
		}
		else
		{
			if(e==1){
				m=a;
			}
			else if(e==2){
				m=b;
			}
			else
			{
				c=a+b;
				m=c;
				a=b;
				b=c;
			}
			e++;
		}
	}
	printf("\n %d th term  = %d",n,m);
}

