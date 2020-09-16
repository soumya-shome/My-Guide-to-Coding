#include<iostream>
using namespace std;
main()
{
	int s=5;
	for(int i=1;i<=5;i++)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s--;
		for(int j=1;j<=i;j++)
		{
			if(i==1||i==5)
			{
					cout<<"* ";
			}
			else
			{
				if(j==1||j==i)
				{
					cout<<"* ";
				}
				else
				{
					cout<<"  ";
				}
			}
		}
		cout<<endl;
	}
}
