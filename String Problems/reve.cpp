#include<iostream>
using namespace std;
main()
{
	char a[100],b[100];
	int i=0,j,k,l=0;
	cout<<"Enter a word";
	gets(a);
	for(i=0;a[i]!='\0';i++);
	for(j=i;j>=0;j--,l++)
	{
		cout<<a[j]<<" ";
		b[l]=a[j];
		cout<<b[l]<<endl;
	}
	b[i+1]='\0';
	cout<<b;
}
