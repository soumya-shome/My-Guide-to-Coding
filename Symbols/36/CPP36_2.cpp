#include<iostream>
using namespace std;
main()
{
	int s=1;
	for(int i=1;i<=5;i++)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s++;
		for(int j=i;j<=5;j++)
		{
			if(i==1||i==5)
			{
				cout<<"* ";
			}
			else
			{
				cout<<"* ";
			}
		}
		cout<<endl;
	}
}
