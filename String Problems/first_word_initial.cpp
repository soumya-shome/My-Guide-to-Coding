#include<iostream>
using namespace std;
main()
{
	char a[50],b[30];
	int i=0,s=0,sp=0,o=0;
	cout<<"enter a sentence ";
	gets(a);
	for(i=0;a[i]!='\0';i++);
	a[i+1]=' ';
	a[i+2]='\0';
	i+=2;
	for(int j=0;j<i;j++)
	{
		if(a[j]==' ')
		{
			s++;
		}
	}
	for(int k=0;k<i;k++)
	{
		if(a[k]!=' ')
		{
			b[o]=a[k];
			o++;	
		}
		else
		{
			sp++;
			if(sp!=s)
			{
				cout<<b[0]<<".";
			}
			else
			{
				cout<<b;
			}
			for(int y=0;y<30;y++)
			{
				b[y]='\0';
			}
			o=0;
		}
	}
}
