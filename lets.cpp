#include<iostream>
using namespace std;
int ch(int ,int [])
void main()
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
	ch(n,a[n]);
}
int ch(int i,int b[i])
{
	for(int m=0;m<i;m++)
	{
		if(m%i==0)
		{
			cout<<b[m]<<endl;
		}
	}
	return 0;
}
