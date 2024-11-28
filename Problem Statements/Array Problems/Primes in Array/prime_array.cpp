#include <iostream>
using namespace std;
bool isPrime(int n){
	int f=0;
	for (int i=2;i<n;i++){
		if(n%i==0){
			f=1;
			break;
		}
	}
	if(f==1)
		return false;
	else
		return true;
}

main(){
	int n[10];
	cout<<"Enter 10 numbers : ";
	for(int i=0;i<10;i++)
		cin>>n[i];
	cout<<"Prime Numbers : ";
	for(int j=0;j<10;j++){
		if(isPrime(n[j]))
			cout<<n[j]<<", ";
	}
	return 0;
}
