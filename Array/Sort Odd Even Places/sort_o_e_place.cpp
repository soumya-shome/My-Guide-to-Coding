#include<iostream>
using namespace std;
 
void funcswap(int a[],int s){
	for(int i=0;i<s;i+=2){
		int t=i+1;
		if(t<s){
			int y=a[i];
			a[i]=a[t];
			a[t]=y;
		}
	}
}
  
main(){
	int n;
	cout<<"Enter the Number of terms : ";
	cin>>n;
	int b[n];
	cout<<"Enter "<<n<<" numbers : ";
	for(int i=0;i<n;i++)
		cin>>b[i];
	funcswap(b,n);
	cout<<"the Swapped array : ";
	for(int i=0;i<n	;i++)
		cout<<b[i]<<",";
}
