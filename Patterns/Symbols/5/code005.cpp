#include<iostream>
using namespace std;
int main()
{
	int line=5;
	for(int i=1;i<=line;i++)
	{
		for(int sp=1;sp<=line - i;sp++)
		{
			cout<<" ";
		}
		for(int j=0;j<i;j++)
		{
			cout<<"* ";
		}
		cout<<endl;
	}
	return 0;
}
