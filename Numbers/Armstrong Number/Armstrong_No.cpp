#include<iostream>
using namespace std;
main()
{
	int n,n1,d,a,s=0;
	cout<<"Enter a number: ";
	cin>>n;
	/*n1=n;
	while(n1!=0){
		d++;
		n1=n1/10;
	}*/
	n1=n;
	while(n1!=0){
		a=n1%10; //getting each digit
	//	if(d==3)
			s=s+(a*a*a);//summation
	//	if(d==2)
	//		s=s+(a*a);
		n1=n1/10;
	}
	if(s==n){
		cout<<"ArmStrong number";
	}
	else{
		cout<<"Not Armstrong number";
	}
}
