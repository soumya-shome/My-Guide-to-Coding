#include<iostream>
using namespace std;
int main()
{
	void swap(int&,int&);
	int a,b;
	a=10;
	b=56;
	cout<<"\nthe original values are:\n";
	cout<<"a="<<a<<",b="<<b<<"\n";
	swap(a,b);
	cout<<"\n the values after swap are \n";
	cout<<"a="<<a<<",b="<<b<<"\n";
	return 0;
}
void swap(int &x,int &y)
{
	int temp;
	temp=x;
	x=y;
	y=temp;
	cout<<"\n the swapped values are \n";
	cout<<"a="<<x<<",b="<<y<<"\n";
}