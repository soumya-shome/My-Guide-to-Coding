#include <iostream>

using namespace std;
int main()
{
	
	int i,j,s,k,l,sp;
	int c = 3,d = 2; 
	for(i=4;i>=1;i--)
	{
		for(s = c;s<=2;s++)
		{
			cout<<" ";
		}
		c--;
		for(int j = 1;j<=i;j++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
	for(k=4;k<=6;k++)
	{
		for(sp=d;sp>=1;sp--)
		{
			cout<<" ";
		}
		d--;
		for(l = 3;l<=k;l++)
		{
			cout<<"* ";
		}
		cout<<"\n";
	}
	
}
