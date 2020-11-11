#include<iostream>
using namespace std;
void incre(int &);
main()
{
	int n=0;
	cout<<"Eetfrre";
	cin>>n;
	incre(*n);
	cout<<"The value is "<<n;
}
void incre(int &p)
{
	p++;
}
