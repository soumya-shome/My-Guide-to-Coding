#include<iostream>
using namespace std;
main()
{
	int n,sum=0;
	cout<<"Enter the size \n";
	cin>>n;
	int a[n][n];
	cout<<"Enter the elements \n";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>a[i][j];
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if((i==j)||((i+j)==(n-1)))
			{
				sum=sum+(a[i][j]*a[i][j]);
			}
			
		}
	}
	cout<<"Sum= "<<sum;
}
