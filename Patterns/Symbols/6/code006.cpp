#include<iostream>
using namespace std;
main()
{
	int line = 5;
	for(int i=line;i>=1;i--)
	{
		for(int s=1;s<=line - i;s++)
		{
			cout<<" ";
		}
		for(int j=1;j<=i;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
}
