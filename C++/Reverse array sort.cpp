#include<iostream>
using namespace std;
 void funcswap(int [],int);
 
 void funcswap(int a[],int s)
 {
 	int s2=s-1;
 	for(int i=0;i<(s/2);i++)
 	{
 		int t=a[i];
 		a[i]=a[s2];
 		a[s2]=t;
 		s2--;
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
	for(int i=0;i<6
	;i++)
	{
		cout<<b[i]<<",";
	}
}
