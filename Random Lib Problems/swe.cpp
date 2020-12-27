#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
	randomize();
	int num;
	num=random(3)+2;
	char text[]="ABCDEFGHIJKL";
	for(int i=1;i<=num;i++)
	{
		for(int j=num;j<=7;j++)
		{
			cout<<text[j];
		}
		cout<<endl;
	}
	return 0;
}
