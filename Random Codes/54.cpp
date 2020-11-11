#include<iostream>
using namespace std;
main()
{
	char a[30],b[30],c[60];
	int x;
	cout<<"enter two string ";
	cin>>a>>b;
	for(int i=0;a[i]!='\0';i++)
	{
	 c[i]=a[i];
		x++;
	}
	x++;
	for(int j=0;b[j]!='\0';j++)
	{
		c[x]=b[j];
		x++;
	}
	c[x]='\0';
	cout<<"c="<<c;
}
