#include<iostream>
using namespace std;
main()
{
	int sp=1;
	for(int i=5;i>=1;i--)
	{
		for(int s=1;s<=sp;s++)
		{
			cout<<" ";
		}
		sp++;
		for(int j=1;j<=i;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
}
