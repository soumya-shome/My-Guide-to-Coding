#include<iostream>
#include<cstring>
using namespace std; 
int main()
{
	int i,l;
	char c;
	string s1="Hello";
	l=s1.size();
	for(i=0;i<l;i++)
	{
		c=s1.at(i);
		c=toupper(c);
		cout<<c<<endl;
	}
	cout<<c;
	return 0;
}
