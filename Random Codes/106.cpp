#include<iostream>
using namespace std;
void coding(char val[],int ch1,int ch2)
{
	for(int i=0;val[i]!='\0';i++)
	{
		cout<<"\n"<<val[i]<<"->"<<i;
		if(val[i]>'A'&& val[i]<='Z')
		{
			if(i!=0)
			{
				if(val[i-1]=='*')
				{
					val[i-1]=ch1;
				}
			}
			else
			{
				val[i]=ch2;
			}
		}
		cout<<"->"<<val[i-1];
		if(val[i]>'a'&& val[i]<='z')
		{
			if(i>0)
			{
				if(val[i-1]=='*')
				{
					val[i-1]=ch2;
				}
			}
			else
			{
				val[i]=ch1;
			}
		}
		cout<<"->"<<val[i];
	}
}

main()
{
	char Mess[]="Exam*2018*March";
	coding(Mess,'@','#');
	cout<<Mess<<endl;
}
