#include<iostream>
using namespace std;
int main()
{
	int a,b;
	char c=' ';
	cout<<"Enter two no.s";
	cin>>a>>b;
	cout<<"enter the operator";
	cin>>c;
	double r;
	switch(c)
	{
		case '+':
			r=a+b;
			cout<<"Result= "<<r;
			break;
		case '-':
			r=a-b;
			cout<<"Result= "<<r;
			break;
		case '*':
			r=a*b;
			cout<<"Result= "<<r;
			break;
		case '/':
			r=a/b;
			cout<<"Result= "<<r;
			break;
		default:
			cout<<"wrong input";
			break;
	}
	return 0;
}
