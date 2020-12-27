#include<iostream>
using namespace std;
main()
{ 
	int a[4][4],i,j;
	cout<<"Enter digits";
	for(j=0;j<4;j++)
	{
		cin>>a[0][j];
	}
	for(i=1;i<4;i++)
	{
		cin>>a[i][3];
	}
	for(j=2;j>=0;j--)
	{
		cin>>a[3][j];
	}
	for(i=2;i>=1;i--)
	{
		cin>>a[i][0];
	}
	for(j=1;j<=2;j++)
	{
		cin>>a[1][j];
	}
	for(j=2;j>=1;j--)
	{
		cin>>a[2][j];
	}
	cout<<endl;
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
}
