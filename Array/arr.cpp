#include<iostream>
using namespace std;
main()
{
	int a[10];
	int c,x;
	cout<<"Enter 10 numbers \n";
	for(int i=0;i<10;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter a number \n";
	cin>>c;
	for(int i=0;i<10;i++)
	{
		if(a[i]==c)
		{
			a[i]=0;
		}
	}
	for(int i=0;i<10;i++)
	{
		if(a[i]==0)
		{
			for(int y=0;y<i;y++)
			{
				if(a[y]!=0)
				{
					x=y;
					break;
				}
			}
			int t=a[i];
			a[i]=a[x];
			a[x]=t;
		}
	}
	for(int i=0;i<10;i++)
	{
		cout<<a[i]<<",";
	}
}
