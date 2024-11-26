#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;

main()
{
	char a[40];
	int n=0;
	ifstream file;
	file.open("Hello.txt");
	while(file)
	{
		file.getline(a,40);
		cout<<a<<endl;
	}
	file.close();
	
}
