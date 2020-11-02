#include<iostream>
using namespace std;
int main()
{
	int n[10];
	for(int i=0;i<10;i++)
	{
		n[i]=i+100;
	}
	cout<<"Element"<<"value"<<endl;
	for(int j=0;j<10;j++)
	{
		cout<<j<<n[j]<<endl;
	}
	return 0;
}
