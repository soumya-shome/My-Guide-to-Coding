#include<iostream>
using namespace std;
main()
{
	char ms[13],ps[7];
	int pos=0,l2,i2,p=0;
	
	cout<<"enter the main string \n";
	gets(ms);
	cout<<"enter the patter string \n";
	gets(ps);
	
	for(l2=0;ps[l2]!='\0';l2++);
	
	for(int i=0;ms[i]!='\0';i++)
	{
		if(ms[i]==ps[0])
		{
			pos=i;
			i2=i;
			for(int j=0;j<l2;j++)
			{
				if(ps[j]==ms[i2])
				{
					p++;
					i2++;
				}
			}
		}
		if(pos>0)
		{
		break;
		}
	}
	pos++;
	if(l2==p)
	{
		cout<<"The patterned string is found at postion "<<pos<<"\n";
	}
	else
	{
		cout<<"Not found";
	}
}
