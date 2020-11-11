#include<iostream>
using namespace std;
void Encrypt(char *S,int key)
{
	char *Temp=S;
	if(key%2==0)
	{
		key--;
	}
	while(*Temp!='\0')
	{
		*Temp+=key;
		cout<<"-"<<Temp<<endl;
		Temp+=key;
		cout<<"."<<Temp<<endl;
	}
}

main()
{
	int KS[]={1,2,3};
	char Pvt[]="Computer2017";
	for(int c=0;c<2;c++)
	{
		Encrypt(Pvt,KS[c]);
		cout<<c+1<<" "<<Pvt;
		cout<<endl;
	}
}
