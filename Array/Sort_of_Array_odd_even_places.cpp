#include<iostream>
using namespace std;
 void funcswap(int [],int);
 
 void funcswap(int a[],int s)
 {
 	for(int i=0;i<s;i+=2)
 	{
 		int t=i+1;
 		int y=a[i];
 		a[i]=a[t];
 		a[t]=y;
	}
 }
  
main()
{
	int b[6];
	cout<<"enter 6 numbers\n";
	for(int i=0;i<6;i++)
	{
		cin>>b[i];
	}
	funcswap(b,6);
	cout<<"the swapped array is ";
	for(int i=0;i<6	;i++)
	{
		cout<<b[i]<<",";
	}
}
