#include<iostream>
using namespace std;
main()
{
	int x[4][4];
	cout<<"Enter 16 elements \n";
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cin>>x[i][j];
		}
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if((i!=j) && ((i+j)!=3))
			{
				cout<<x[i][j]<<" ";
			}
			else
			{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
}
