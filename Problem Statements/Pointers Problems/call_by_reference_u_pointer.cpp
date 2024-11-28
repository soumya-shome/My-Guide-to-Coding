// call by reference using pointer
//swapping
#include<iostream>
using namespace std;
void swap(int *x,int *y);
main()
{
	int n,m;
	cout<<"Enter 2 number";
	cin>>n>>m;
	swap(&n,&m);
	cout<<"n= "<<n;
	cout<<" m= "<<m;
}
void swap(int *x,int *y)
{
	int temp=*x;
	*x=*y;
	*y=temp;
}
