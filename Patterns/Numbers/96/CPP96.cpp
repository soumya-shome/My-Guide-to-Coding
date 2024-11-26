#include<iostream>
using namespace std;
main()
{
	int s=4;
	for(int i=1;i<=7;i+=2)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s--;
		for(int j=1;j<=i;j++)
		{
			cout<<j;
		}
		
		cout<<endl;
	}
}

