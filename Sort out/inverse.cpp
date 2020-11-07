#include<iostream>
using namespace std;
main()
{
	int i,j,c,d;
	double d2=0;
	int a[2][2];
	cout<<"Enter the 4 no.s";
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			cin>>a[i][j];
		}
	}
	c=a[0][0];
	a[0][0]=a[1][1];
	a[1][1]=c;
	d=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
	cout<<d<<endl;
	d2=1/d;
	cout<<d2<<endl;
	a[0][1]=a[0][1]-(2*a[0][1]);
	a[1][0]=a[1][0]-(2*a[1][0]);
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			cout<<(a[i][j]/d2);
		}cout<<endl;
	}
}
