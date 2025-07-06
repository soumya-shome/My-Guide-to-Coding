#include <iostream>
using namespace std;
int main()
{
	int line = 5;
	int i,j,k;
	for(i=1;i<=line;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
	return 0;
}
