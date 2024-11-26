#include<iostream>
using namespace std;
main()
{
	int a,b;
	cout<<"Enter two numbers which will be range\n";
	cin>>a>>b;
	for(int i=a;i<=b;i++)
	{
		int t=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				t++;
			}
		}
		if(t==2)
		{
			cout<<i<<" is Prime \n";
		}
	}
}
