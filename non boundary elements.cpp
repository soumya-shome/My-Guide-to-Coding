#include<iostream>
using namespace std;
main()
{
	int a[10][10];
	int i,j,r,c;
	cout<<"enter the number of rows and columns";
	cin>>r>>c;
	cout<<"enter the elements of matrix";
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
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
			if(i!=0||j!=3||i!=3||j!=0)
			{
				cout<<a[i][j];
			}
			else
			{
				cout<<"not formed";
			}
		}
	}
	
}
