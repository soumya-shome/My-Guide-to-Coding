#include<iostream>
using namespace std;
main()
{
	
	char c[100];
	int i,sp,s=0,j,k,sa=0;
	
	cout<<"Enter a name \n";
	gets(c);
	for(i=0;c[i]!='\0';i++);
	c[i+1]=' ';
	for(sp=0;c[sp]!='\0';sp++)
	{
		if(c[sp]==' ')
		{
			s++;
		}
	}
	cout<<c[0]<<".";
	for(j=1;c[j]!='\0';j++)
	{
		if(c[j]==' ')
		{
			if(sa!=s)
			{
				cout<<c[j+1]<<".";
				sa++;
			}
			else
			{
				for(k=j;c[k]!=' ';k--)
				{
					cout<<c[j];
				}
			}
		}
	}
}
