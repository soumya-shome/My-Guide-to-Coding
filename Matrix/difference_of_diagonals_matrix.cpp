#include<iostream>
using namespace std;
main()
{
	cout<<"Enter elements for matrix\n";
	int a[4][4];
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
			cout<<a[i][j]<<" ";
		}
		cout<<"\n";
	}
	int s=0;
	int s1=0;
	int k=0;
	for(int i=0;i<4;i++)
	{
		s=s+a[i][i];
	}
	for(int i=3;i>=0;i--)
	{
		s1=s1+a[k][i];
		k++;
	}
	int y=s-s1;
	cout<<"Difference= "<<y<<endl;
}
