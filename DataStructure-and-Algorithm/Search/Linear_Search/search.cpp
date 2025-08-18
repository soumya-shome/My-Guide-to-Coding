#include<iostream>
using namespace std;
int L(int[],int,int);
main()
{
	int a[50],item,n,index;
	cout<<"Enter size";
	cin>>n;
	cout<<"Enter elements ";
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter the no. to be serched ";
	cin>>item;
	index=L(a,n,item);
	if(index==-1)
	{
		cout<<"Sorry";
	}
	else
	{
		cout<<"Found at "<<++index;
	}
}
int L(int ar[],int s,int it)
{
	for(int i=0;i<s;i++)
	{
		if(ar[i]==it)
		{
			return i;
		}
	}
	return -1;
}
