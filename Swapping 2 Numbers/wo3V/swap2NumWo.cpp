#include<iostream>
using namespace std;
main()
{
	int a,b;
	cout<<"enter Two numbers \n";
	cin>>a>>b;
	cout<<"A= "<<a<<endl;
	cout<<"B= "<<b<<endl;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<"A= "<<a<<endl;
	cout<<"B= "<<b;
}
