#include<iostream>
using namespace std;
int ch(int b,int i)
{
		if(i%2==0)
		{
			cout<<b<<endl;
		}
	return 0;
}
main()
{
	int n;
	cout<<"Enter the width ";
	cin>>n;
	int a[n];
	cout<<"The the values ";
	for(int j=0;j<n;j++)
	{
		cin>>a[j];
	}
	for(int k=0;k<n;k++)
	{
		ch(a[k],k);
	}
}

