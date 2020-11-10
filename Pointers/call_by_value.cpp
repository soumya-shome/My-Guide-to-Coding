#include<iostream>
using namespace std;
void incre(int );
main()
{
	int a;
	cout<<"Enter a numbers";
	cin>>a;
	incre(a);
	cout<<"a= "<<a;
}
void incre(int x)
{
	++x;
}
// call by value
//incrementation
