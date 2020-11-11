#include<iostream>
using namespace std;
void change(int *s)
{
	for(int i=0;i<4;i++)
	{
		if(*s<40)
		{
			if(*s%2==0)
			{
				*s=*s+10;
			}
			else
			{
				*s=*s-11;
			}
		}
		else
		{
			if(*s%2==0)
			{
				*s=*s-10;
			}
			else
			{
				*s=*s-11;
			}
		}
		cout<<*s<<" ";
		s++;
	}
}

main()
{
	int score[]={25,60,35,53};
	change(score);
}
