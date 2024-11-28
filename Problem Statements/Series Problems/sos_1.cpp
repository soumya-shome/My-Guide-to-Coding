//a^2 + a^3 + a^4 + ....
#include <iostream>
#include<Math.h>
using namespace std;
int main()
{
	int a,i,n,t=0;
	double y;
	cout<<"Enter the no. of terms\n";
	cin>>n;
	cout<<"Enter value of a \n";
	cin>>a;
	for(i=1;i<=n;i++)
	{
		y=pow(a,(i+1));
		t=t+(int)y;
	}
	cout<<t<<endl;
	return 0;
}
