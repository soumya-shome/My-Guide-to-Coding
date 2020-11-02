#include<iostream>
using namespace std;
main()
{
	int i,j;
	char a[40],b[30];
	cout<<"Enter two string";
	cin>>a;
	cin>>b;
	for(i=0;a[i]!='\0';++i);
	for(j=0;b[j]!='\0';++j,++i)
	{
		a[i]=b[j];
	}
	b[i]='\0';
	
	cout<<a;
	}
