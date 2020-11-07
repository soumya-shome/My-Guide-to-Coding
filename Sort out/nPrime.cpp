#include<iostream>
using namespace std;
main()
{
	int n=0,a=0;
	while(n<5)
	{
		cout<<"Enter a number \n";
		cin>>n;
	}
	for(int i=1;;i++)
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
			cout<<i<<" is Prime\n";
			a++;
		}
		if(a==n)
		{
			break;
		}
	}
}
