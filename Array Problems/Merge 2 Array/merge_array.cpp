#include<iostream>
using namespace std;
main()
{
	int n1,n2,l,i;
	cout<<"Enter number of elements for 1st array : ";
	cin>>n1;
	cout<<"Enter number of elements for 2nd array : ";
	cin>>n2;
	l=n1+n2;
	int a[n1],b[n2],c[l];
	cout<<"Enter "<<n1<<" numbers for 1st array : ";
	for(i=0;i<n1;i++)
		cin>>a[i];
	cout<<"Enter "<<n2<<" numbers for 2nd array : ";
	for(i=0;i<n2;i++)
		cin>>b[i];
	int q=0;
	for(i=0;i<l;i++)
	{
		if(i<n1)
			c[i]=a[i];
		else{
			c[i]=b[q];
			q++;
		}
	}
	for(i=0;i<l;i++)
		cout<<c[i]<<", ";
}
