#include<iostream>
using namespace std;
void printa(double *arg,int l)
{
	double q=arg[0];
	arg[0]=arg[l-1];
	arg[l-1]=q;
}
main()
{
	double fa[5];
	cout<<"Enter 5 Elements \n";
	for(int i=0;i<5;i++)
	{
		cin>>fa[i];
	}
	printa(fa,5);
	for(int i=0;i<5;i++)
	{
		cout<<fa[i]<<" ";
	}
}
