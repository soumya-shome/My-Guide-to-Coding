#include<iostream>
using namespace std;
int main()
{
	int n,n1,i;
	cout<<"Enter a no. \n";
	cin>>n>>n1;
	if(n>n1)
	{
		for(int i=n1;i>=0;i++)
		{
			if(n%i==0 && n1%i==0)
			{
				cout<<"HCF= "<<i;
				break;	
			}
		}
	}
	else
	{
		for(i=n;i>=0;i++)
		{
			if(n%i==0 && n1%i==0)
			{
				cout<<"HCF= "<<i;
				break;	
			}
		}
	}
	return 0;
}
