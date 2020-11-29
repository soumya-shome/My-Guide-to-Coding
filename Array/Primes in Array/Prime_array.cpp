#include <iostream>
using namespace std;
int main()
{
	int a[5],b[5],c[10],p,q,l=0,i1,i2,j2,j1,k1,k2,h;
	cout<<"Enter the value of the first array \n";
	for(i1=0;i1<5;i1++)
		cin>>a[i1];
	for(j1=0;j1<5;j1++)
	{
		p=0;
		for(k1=1;k1<=a[j1];k1++)
			if(a[j1]%k1==0)
				p++;
		if(p==2)
		{
			c[l]=a[j1];
			l++;
		}
	}
	for(h=0;h<5;h++)
		cout<<"The no.s are "<<c[h]<<endl;
	return 0;
}
