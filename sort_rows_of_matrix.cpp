#include <iostream>
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
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]>a[i][j+1])
			{
				int k;
				k=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=k;
				j=-1;
			}
		}
    }
	cout<<"OUPUT:\n";
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<"\n";
	}	
}