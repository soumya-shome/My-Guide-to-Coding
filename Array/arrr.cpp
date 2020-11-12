#include<iostream>
using namespace std;
main()
{
	int n,f=0;
	cout<<"Enter the size \n";
	cin>>n;
	int a[n][n],p[n][n];
	cout<<"Enter the elements \n";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>a[i][j];
		}
	}
	cout<<"Enter another set \n";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>p[i][j];
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i][j]!=p[i][j])
			{
				f++;
				break;
			}
		}
	}
	if(f==1)
	{
		cout<<"Not same";
	}
	else
	{
		cout<<" Same";
	}
}
