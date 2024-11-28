#include<iostream>
using namespace std;

int main()
{
	int x,r,u,d,n=0;
	cout<<"Enter a number:\n";
	cin>>x;
	
	r=x*x;
	
	while(r>0)
	{
		d=r%10;
		n=n+d;
		r=r/10;
	}
	u=r;
	if(n==u)
	{
		cout<<"The number is Kaprakor number"<<u<<endl;
	}
	else
	{
		cout<<"The number is not a Kaprakor number"<<u<<endl;
	}
	
}

