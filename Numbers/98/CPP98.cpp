#include<iostream>
using namespace std;
main()
{
	int x=0;
	for(int i=1;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			x+=(i+j-1);
			cout<<x<<" ";
		}
		cout<<"\n"<<x<<" ";
	}
}
