#include<iostream>
using namespace std;
#define check(x,y) (x>y?x:y);
main()
{
	int a,b;
	cout<<"Enter two nos";
	cin>>a>>b;
	int c=check(a,b);
	cout<<"greatest "<<c;
}
