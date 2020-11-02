#include<iostream>
using namespace std;
void swap(int ,int);
main()
{
	int a,b;
	cout<<"Enter 2 numbers";
	cin>>a>>b;
	swap(a,b);
	cout<<"a= "<<a<<"b= "<<b;
}
void swap(int x,int y)
{
	int z=y;
	y=x;
	x=z;
}
// call by value
//swapping
