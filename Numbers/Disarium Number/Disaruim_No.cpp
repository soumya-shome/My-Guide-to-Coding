#include <iostream>
#include <Math.h>
using namespace std;
int main()
{
	int n,i,a=0,b,o=0,m;
	cout<<"Enter a no.\n";
	cin>>n;
	i=n;
	m=n;
	while(i>0)
	{
		a++;
		i=i/10;
	}
	cout<<a<<endl;
	while(n>0)
	{
		b=n%10;
		o=o+pow(b,a);
		cout<<o<<endl;
		a--;
		n=n/10;
	}
	if(m==o)
	{
		cout<<"Disarium no."<<endl;
	}
	else
	{
		cout<<"Not a Disarium"<<endl;
	}
	return 0;
}
