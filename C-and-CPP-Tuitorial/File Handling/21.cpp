#include<iostream>
#include<fstream>
using namespace std;
main()
{
	char s[80],ch='y';
	int k=0;
	ifstream file("myfile.txt");
	while(!file.eof())
	{
		file>>s;
		if(s[0]=='a'||s[0]=='A')
		{
			k++;
		}
	}
	file.close();
	cout<<k;
}


