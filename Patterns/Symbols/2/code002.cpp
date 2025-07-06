#include <iostream>
using namespace std;
int main()
{
	int line = 5;
	int i,j,k;
	for(i=1;i<=line;i++)
	{
		for(j=i;j<=line;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
	return 0;
}
