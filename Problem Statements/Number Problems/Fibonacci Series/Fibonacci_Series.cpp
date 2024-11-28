#include<iostream>
using namespace std;
main()
{
	int a=0,b=1,c,i,n;
	cout<<"enter no. of terms ";
	cin>>n;
	if(n>0){
		if(n==1){
			cout<<a;
		}
		else if(n==2){
			cout<<a<<","<<b;
		}
		else{
			cout<<a<<","<<b<<",";
			for(i=3;i<=n;i++){
				c=a+b;
				cout<<c<<",";
				a=b;
				b=c;
				
			}
		}
	}
	else{
		cout<<"Not Valid";
	}
}
