#include <iostream>
using namespace std;
int main()
{
	int a[5];
	int b[10];
	int c[15];
	int p,q;
	int l=0;
	int i1,i2,j2,j1,k1,k2,h;
	
	cout<<"Enter the value of the first array \n";
	for(i1=0;i1<5;i1++)
	{
		cin>>a[i1];
	}
	
	cout<<"Enter the value of the second array \n";
	for(i2=0;i2<10;i2++)
	{
		cin>>b[i2];
	}
	
	for(j1=0;j1<5;j1++)
	{
		p=0;
		for(k1=1;k1<=a[j1];k1++)
		{
			if(a[j1]%k1==0)
			{
				p++;
			}
		}
		if(p==2)
		{
			c[l]=a[j1];
			l++;
		}
	}
	
	
	for(j2=0;j2<10;j2++)
	{
		q=0;
		for(k2=1;k2<=b[j2];k2++)
		{
			if(b[j2]%k2==0)
			{
				q++;
			}
		}
		if(q==2)
		{
			c[l]=b[j2];
			l++;
		}
	}
	
	
	for(h=0;h<15;h++)
	{
		if(c[h]>0)
			cout<<"The no.s are "<<c[h]<<"\n";
	}
	return 0;
}
