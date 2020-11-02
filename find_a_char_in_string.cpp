#include<iostream>
using namespace std;
main()
{
	char a[50];
	char b;
	int y=0;
	cout<<"Enter a string";
	cin.getline(a,50);
	cout<<"enter a char \n";
	cin>>b;
	for(int i=0;a[i]!='\0';i++)
	{
		if(a[i]==b)
		{
			y++;
		}
	}
	cout<<b<<" occurs in the string "<<y<<" times";
}
