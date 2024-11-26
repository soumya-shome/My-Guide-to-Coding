#include<iostream>
using namespace std;
main()
{
	int s=4;
	for(int i=65;i<=68;i++)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s--;
		for(int j=65;j<=i;j++)
		{
			cout<<(char)j;
		}
		if(i>65)
		{
			for(int j=i-1;j>=65;j--)
			{
				cout<<(char)j;
			}
		}
		cout<<endl;
		if(i==68)
		{
			s+=2;
			for(int i2=i-1;i2>=65;i2--)
			{
				for(int sp=1;sp<=s;sp++)
				{
					cout<<" ";
				}
				s++;
				for(int j=65;j<=i2;j++)
				{
					cout<<(char)j;
				}
				if(i2!=65)
				{
					for(int j=i2-1;j>=65;j--)
					{
						cout<<(char)j;
					}
				}
			cout<<endl;
			}
		}
	}
}
