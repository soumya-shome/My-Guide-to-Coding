#include<iostream>
using namespace std;
main()
{
	int n,n1,d,a,s=0,s1=1;
	cout<<"Enter a number: ";
	cin>>n;
	n1=n;
	while(n1!=0){
		a=n1%10;
		s=s+a;
		s1=s1*a;
		n1=n1/10;
	}
	if(s==s1){
		cout<<"Spy number";
	}
	else{
		cout<<"Not Spy number";
	}
}
