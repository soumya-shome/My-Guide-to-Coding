#include<iostream>
using namespace std;
int printa(int a[],int l,char c)
{
	int sum=0;
	for(int n=0;n<l;n++)
	{
		if(c=='+')
		{
			if(a[n]>0)
			{
				sum=sum+a[n];
			}
		}
		else
		{
			if(a[n]<0)
			{
				sum=sum+a[n];
			}
		}
	}
	return sum;
}
main()
{
	int b[5];
	char a;
	cout<<"enter 5 numbers \n";
	for(int i=0;i<5;i++)
	{
		cin>>b[i];
	}
	cout<<"Enter + or -";
	cin>>a;
	int d=printa(b,5,a);
	cout<<"The sum is "<<d;
}
