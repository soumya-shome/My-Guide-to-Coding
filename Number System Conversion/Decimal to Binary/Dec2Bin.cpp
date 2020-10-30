#include<iostream>
using namespace std;
main()
{
	int a,b=1,i=1;
	cout<<"Enter a Number : ";
	cin>>a;
	while(a!=0)
	{
        int c = a%2;
        a /= 2;
        b += c*i;
        i *= 10;
	}
	b--;
	cout<<"Binary Value : "<<b;
}
