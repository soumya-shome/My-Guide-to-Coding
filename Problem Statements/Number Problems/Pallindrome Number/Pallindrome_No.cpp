#include<iostream>
using namespace std;
main()
{
	int n,n1,d,a,s=0;
	cout<<"Enter a number: ";
	cin>>n;
	n1=n;
	while(n1!=0){
		a=n1%10;
		s=s*10+a;
		n1=n1/10;
	}
	if(s==n){
		cout<<"Pallindrome number";
	}
	else{
		cout<<"Not Pallindrome number";
	}
}
