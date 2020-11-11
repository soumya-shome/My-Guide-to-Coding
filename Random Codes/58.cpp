#include<iostream>
using namespace std;
main()
{
	int i,j,k2,l;
	char c[100];
	cout<<"Enter a sentence";
	gets(c);
	for(i=0;c[i]!='\0';i++);
	cout<<i;
	c[i+1]=' ';
	c[i+2]='\0';
	k2=0;
	for(j=0;c[j]!='\0';j++)
	{
		if(c[j]==' ')
		{
			for(l=j;l>=k2;l--)
			{
				cout<<c[l];
			}
			k2=j+1;
		}
	}
}
