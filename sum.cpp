#include<iostream>
using namespace std;
main()
{
	int a[10][10];
	int i,j,r,c,s=0,d=0,m=0;
	cout<<"enter the number of row and column \n";
	cin>>r>>c;
	cout<<"enter the elements of matrix \n";
	for(i=0;i<r;i++)
	{
		for(   j=0;j<c;j++)
		{
			cin>>a[i][j];
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<a[i][j];
		}
		cout<<endl;
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i==j)
			{
				s=s+a[i][j];
			}
			if(i+j<r)
			{
				d=d+a[i][j];
			}
		}
	}
	m=s-d;
	cout<<"the required difference is \n"<<m;
}
