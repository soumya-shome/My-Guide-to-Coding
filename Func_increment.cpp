
#include<iostream>
using namespace std;
int meth(int a)
{
	a++;
}
main()
{
	int a;
	cout<<"enter a no.";
	cin>>a;
	meth(a);
	cout<<"The value of a is "<<a;
}
