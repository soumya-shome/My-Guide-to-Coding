#include<iostream>
using namespace std;
main()
{
	int i=0,x=0,j,z=0,l;
	char a[100],b[100];
	cout<<"Enter a word \n";
	gets(a);
	for(i=0;a[i]!='\0';i++);
	for(j=i-1;j>=0;j--)
	{
		b[j]=a[x];
		x++;
	}
	for(int l=0;l<i;l++)
	{
		if(a[l]!=b[l])
		{
			z++;
		}
	}
	if(z>0)
	{
		cout<<"not pallindrome";
	}
	else
	{
		cout<<"Pallindrome";
	}
}
