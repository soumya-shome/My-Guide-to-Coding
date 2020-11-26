#include<iostream>
using namespace std;
main()
{
	char a[30];
	char b[10];
	char c[10];
	for(int k=0;k<10;k++)
	{
		c[k]='\0';
	}
	int l=0,l2=0,d=0,e=0;
	cout<<"Enter a Word \n";
	cin.getline(a,30);
	cout<<"Enter the SubString t be searched\n";
	cin.getline(b,10);
	for(l=0;a[l]!='\0';l++);
	for(l2=0;b[l2]!='\0';l2++);
	for(int i=0;i<l;i++)
	{
		for(int j=i;j<(i+l2);j++)
		{
			c[d]=a[j];
			d++;
		}
		for(int q=0;q<l2;q++)
		{
			if(c[q]==b[q])
			{
				e++;
			}
		}
		if(e==l2)
		{
			cout<<"Found"<<endl;
		}
		e=0;
		d=0;
		for(int k=0;k<10;k++)
		{
			c[k]='\0';
		}
	}
	
}
