#include<iostream>
using namespace std;
main()
{
	char a[50];
	int l=0,s=0;
	cout<<"Enter a String\n";
	cin.getline(a,50);
	for(l=0;a[l]!='\0';l++);
	a[++l]=' ';
	a[++l]='\0';
	for(int i=0;i<l;i++)
	{
		if(a[i]==' ')
		{
			s++;
		}
	}
	cout<<"Number of words "<<s;
}
