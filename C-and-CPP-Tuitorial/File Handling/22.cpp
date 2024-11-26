#include<iostream>
#include<fstream>
using namespace std;
class Client
{
	int Ccode;
	char Cname[20];
	public:
		void Register();
		void Display();

};
main()
{
	fstream Cfile;
	Cfile.open("Client.Dat",ios::binary,ios::in);
	Client c;
	Cfile.read((char*)&c,sizeof(c));
	cout<<"rec:"<<Cfile.tellg()/sizeof(c)<<endl;
	Cfile.read((char*)&c,sizeof(c));
	Cfile.read((char*)&c,sizeof(c));
	cout<<"rec:"<<Cfile.tellg()/sizeof(c)<<endl;
	Cfile.close();
}
