#include<iostream>
using namespace std;
int main()
{
	char a[100];
	int i,j,s,k2;
	cout<<"Enter sentence";
	gets(a);
	for(i=0;a[i]!='\0';i++);
	a[i+1]=' ';
	k2=0;
	for(s=0;a[s]!='\0';s++)
	{
		if(a[s]==' ')
		{
			for(j=s;j>=k2;j--)
			{
				cout<<a[j];
			}
			k2=j+1;
		}
	}
	return 0;
}
