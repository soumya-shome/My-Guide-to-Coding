#include<iostream>
using namespace std;
int main()
{
	int m[5],i,j,k,l;
	int n[5],p[5];
	int o[10];
	cout<<"Enter 10 no.s \n";
	for(int i=0;i<5;i++)
	{
		cin>>n[i];
	}
	cout<<"Enter 5 more \n";
	for(j=0;j<5;j++)
	{
		cin>>m[j];
	}
	int a=0;
	for(k=0;k<5;k++)
	{
		for(l=0;l<5;l++)
		{
			if(n[k]==m[l])
			{
				p[a]=n[k];
				a++;
			}
		}
	}
	cout<<"___________________"<<endl;
	for(i=0;i<5;i++)
	{
			cout<<p[i]<<endl;
	}
	
	return 0;
}

