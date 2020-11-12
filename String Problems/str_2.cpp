#include<iostream>
using namespace std;
main()
{
	char a[25],b[25];
	int f=0;
	cout<<"Enter a string \n";
	cin.getline(a,25);
	cout<<"Enter another string \n";
	cin.getline(b,25);
	for(int i=0;a[i]!='\0';i++)
	{
		if(a[i]!=b[i])
		{
			f++;
			break;
		}
	}
	if(f==1)
	{
		cout<<"Not same";
	}
	else
	{
		cout<<"Smae";
	}
	
}
