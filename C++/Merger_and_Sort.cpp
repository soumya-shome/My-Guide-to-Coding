#include<iostream>
using namespace std;
int main()
{
	int a[5];
	int b[5];
	int c[10];
	int i,j,k,a2=0,a3=0;
	cout<<"Enter 5 no.s";
	for(i=0;i<5;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter 5 no.s";
	for(j=0;j<5;j++)
	{
		cin>>b[j];
	} 
	for(k=0;k<10;k++)
	{
		if(k%2==0)
		{
			c[k]=a[a2];
			a2++;
		}
		else
		{
			c[k]=b[a3];
			a3++;
		}
	}
	
	for(int l=0;l<10;l++)
	{
		cout<<c[l]<<",";
	}
	return 0;
}
