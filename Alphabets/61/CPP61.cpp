#include<iostream>
using namespace std;
main()
{
	for(int i=1;i<=5;i++)
	{
		int a=65;
		for(int j=1;j<=i;j++)
		{
			cout<<(char)a;
			a++;
		}
		cout<<endl;
	}
}
