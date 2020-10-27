#include<iostream>
using namespace std;
void main(){
	int n,s=0,t;
	cout<<"Enter a number : ";
	cin>>n;
	while(n!=0){
		t=n%10;
		s=s+t;
		n=n/10;
	}
	cout<<"Sum of digits : "<<s;
}
