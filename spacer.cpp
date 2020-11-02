#include<iostream>
using namespace std;
main()
{
	
	char c[100];
	char word[50];
	int l,i,sp,s=0,j,k,sa=0,y=0;
	
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
	
	
	for(j=0;c[j]!='\0';j++)
	{
		if(c[j]!=' ')
		{
			word[y]=c[j];
			y++;
		}
		else
		{
			if(sa!=sp)
			{
				cout<<word[0]<<".";
				sa++;
			}
			else
			{
				//for(l=0;word[l]!='\0';l++)
				//{
					cout<<word;
				//}
			}
			y=0;
		}
	}
}
