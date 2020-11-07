#include<iostream>
using namespace std;
main()
{
	int a[5][5];
	cout<<"Enter \n";
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			cin>>a[i][j];
		}
	}	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i!=j)
			{
				cout<<a[i][j]<<" ";
			}
			else
			{
				cout<<"  ";
			}
		}
		cout<<endl;
	}	
}
