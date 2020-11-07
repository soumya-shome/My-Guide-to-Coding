#include<iostream>
using namespace std;
void product(int b[5][5])
{
	int p=1;
	for(int i=0;i<5;i++)
	{
		p=1;
		for(int j=0;j<5;j++)
		{
			p=p*b[j][i];
		}
		cout<<"Product of "<<(i+1)<<" row is "<<p<<endl;
	}
}
main()
{
	int a[5][5];
	cout<<"Enter 25 numbers\n";
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			cin>>a[i][j];
		}
	}
	product(a);
}
