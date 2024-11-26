#include<iostream>
using namespace std;
int g=20;
void func(int &x,int y)
{
	x=x-y;
	y=x*10;
	cout<<x<<','<<y<<'\n';
}
int main()
{
	int g=7;
	func(g,::g);
	cout<<g<<','<<::g<<'\n';
	func(::g,g);
	cout<<g<<','<<::g<<'\n';
}

