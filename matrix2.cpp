#include<iostream>
using namespace std;
main()
{
	int a[3][3];
	cout<<"Enter\n";
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cin>>a[i][j];
		}
	}
	cout<<"Matrwis\n";
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<a[i][j];
		}
		cout<<"\n";
	}
	for(int j=0;j<3;j++)
	{
		int t=a[j][0];
		a[j][0]=a[j][2];
		a[j][2]=t;
	}
	cout<<" Aftyer Matrwis\n";
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<a[i][j];
		}
		cout<<"\n";
	}
}
