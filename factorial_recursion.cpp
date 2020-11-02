#include<iostream>
using namespace std;
int fact(int);
main()
{
	int n;
	cout<<"enter a no.";
	cin>>n;
	if(n==0)
	{
		cout<<"Fact=1";
	}
	else
	{
		
		int m=fact(n);
		cout<<"Fact="<<m;
	}
}
int fact(int x)
{
	if(x==1)
	{
		return 1;
	}
	return x* fact(x-1);
}
