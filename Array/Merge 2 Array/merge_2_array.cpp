#include<iostream>
using namespace std;
main()
{
	int m,n,l;
	cout<<"Enter two no.s \n";
	cin>>m>>n;
	l=m+n;
	int a[m],b[n],c[l];
	cout<<"Enter "<<m<<" numbers \n";
	for(int i=0;i<m;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter "<<n<<" numbers \n";
	for(int i=0;i<n;i++)
	{
		cin>>b[i];
	}
	int q=0;
	for(int j=0;j<m;j++)
	{
		c[q]=a[j];
		q++;
	}
	for(int j=0;j<n;j++)
	{
		c[q]=b[j];
		q++;
	}
	cout<<"total "<<"\n";
	for(int o=0;o<q;o++)
	{
		cout<<c[o]<<" ";
	}
}
