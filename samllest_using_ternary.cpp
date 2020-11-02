#include<iostream>
using namespace std;
main()
{
	cout<<"Enter 3 numbers";
	int a,b,c;
	cin>>a>>b>>c;
	b=(a<b)?a:b;
	int d=(b<c)?b:c;
	cout<<"Smallest = "<<d;
}
