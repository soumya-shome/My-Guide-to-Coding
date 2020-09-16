#include <iostream>
using namespace std;
int main()
{
	int i,j,k,s;
	for(i=1;i<=5;i++)
	{
		for(s=4;s>=i;s--)
		{
			cout<<" ";
		}
		for(j=1;j<=i;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
	return 0;
}
