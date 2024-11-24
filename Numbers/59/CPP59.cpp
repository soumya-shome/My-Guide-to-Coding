#include <iostream>
#include <Math.h>

using namespace std;
int main()
{
	int i,j,k,s=5,a=11,b,sp;
	for(i=1;i<=5;i++)
	{
		for(sp=s;sp>=1;sp--){
			cout<<"  ";
		}
		s--;
		for(j=1;j<=i;j++)
		{
			cout<<j<<" ";
		}
		for(k=i-1;k>=1;k--)
		{
			cout<<k<<" ";
		}
		cout<<"\n";
	}
	return 0;
}
