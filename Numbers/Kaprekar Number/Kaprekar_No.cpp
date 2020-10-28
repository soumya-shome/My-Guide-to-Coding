#include<iostream>
using namespace std;

int main()
{
	int x,a,b=9,q,d;
	cout<<"Enter a number:\n";
	cin>>x;
	
	
	while(x>0)
	{
		d=q%10;
		a=a+d;
		q=q/10;
}
	if(a==b)
	{
		cout<<"The number is Kaprekar number"<<endl;
	}
	else
	{
		cout<<"The number is not a Kaprekar number"<<endl;
	}
	
	
}
