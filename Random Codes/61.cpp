#include<iostream>
using namespace std;
main()
{
	int a[4][4];
	cout<<"enter 16 elements \n";
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cin>>a[i][j];
		}
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<(a[i][j]*2)<<" ";
		}
		cout<<"\n";
	}
}
