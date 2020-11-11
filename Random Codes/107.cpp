#include<iostream>
#include<conio.h>
using namespace std;
int a=6;
void demo(int x,int y,int &z)
{
	a=a+x+y;//1.a=6+6+4=16  2.a=16+16+4=36
	z=a+y;//1.16+4=20  2.36+4=40
	y=y+x;//1.4+6=10  2.4+16=20
	cout<<x<<" "<<y<<" "<<z<<endl;
	//1.6 10 20
}
main()
{
	int a=4,b=7;
	demo(::a,a,b);//1.6 4 7 re 16 4 20
	cout<<::a<<" "<<a<<" "<<b<<endl;//16 4 20
	demo(::a,a,b);//2.16 4 20
	getch();
}
