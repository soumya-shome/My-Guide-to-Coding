#include <iostream>
using namespace std;
int main()
{
	int n[10];
	int a=0;
	cout<<"Enter 10 no.s"<<endl;
	for(int i=0;i<10;i++)
	{
		cin>>n[i];
	}
	for(int j=0;j<10;j++)
	{
		for(int k=0;k<=n[j];k++)
		{
			if(n[j]%k==0)
			{
				a++;
			}
		}
		if(a==2)
		{
			cout<<"Prime "<<n[j]<<endl;
		}
		a=0;
	}
	return 0;
}
