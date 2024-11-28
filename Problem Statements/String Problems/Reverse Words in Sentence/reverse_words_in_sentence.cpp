#include<iostream>
#include<cstring>
using namespace std;
main()
{
	char str[100],word[80];
	int l,i,k=0;
	cout<<"enter a sentence \n";
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i] != ' ')
		{
			word[k]=str[i];
			k++;
		}
		else
		{
			while(k>0)
			{
				cout<<word[--k];
			}
			cout<<str[i];
		}
	}
}
