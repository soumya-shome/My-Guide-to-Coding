#include<iostream>
using namespace std;
main()
{
	char a[50];
	int l=0;
	cout<<"enter a string\n";
	cin.getline(a,50);
	for(int i=0;a[i]!='\0';i++)
	{
		if(a[i]==' ')
		{
			a[i]='-';
		}
	}
	cout<<"New String = "<<a;
}
