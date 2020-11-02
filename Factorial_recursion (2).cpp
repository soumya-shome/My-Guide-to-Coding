#include<iostream>
using namespace std;
int fact(int n)
{
	if(n==1)
	{
		return 1;
	}
	return n*fact(n-1);
}
main()
{
	int m;
	cout<<"Enter a no.";
	cin>>m;
	if(m!=0)
	{
		cout<<"the factorial of the no. is "<<fact(m);
	}
	else
	{
		cout<<"the factorial of the no. is 1";
	}
}

