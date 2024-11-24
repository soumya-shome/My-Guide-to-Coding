#include<iostream>
using namespace std;
main()
{
	int n;
	cout<<"Enter the no. of rows \n";
	cin>>n;
	int s=n;
	for(int i=1;i<=n;i++)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s--;
		for(int j=0;j<i;j++)
		{
			cout<<"* ";
		}
		cout<<endl;
	}
}
