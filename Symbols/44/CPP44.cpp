#include<iostream>
using namespace std;
main()
{
	int n,i,j,k;
	cout<<"enter the no. of rows";
	cin>>n;
	int sp=n;
	int o=0;
	for(int i=1;i<=n;i++)
	{
		for(int s=sp;s>=1;s--)
		{
			cout<<" ";
		}
		sp--;
		if(i==1 || i==n)
		{
			for(j=1;j<=i+o;j++)
			{
				cout<<"*";
			}
			o++;
		}
		else
		{
			for(k=1;k<=i+o-1;k++)
			{
				if(k==1)
				{
				cout<<"*";
				}
				else
				{
					cout<<" ";
				}
			}
			cout<<"*";
			o++;
		}
		cout<<endl;
	}
}
