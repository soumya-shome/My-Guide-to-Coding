#include<iostream>
using namespace std;
int main(){
	int x,y;
	double res;
	char s;
	cout<<"Enter 1st number: ";
	cin>>x;
	cout<<"Enter 2nd number: ";
	cin>>y;
	cout<<"Enter operation [ + , - , * , / ] : ";
	cin>>s;
	switch(s){
		case '+':
			res=x+y;
			cout<<"Summation : "<<res;
		break;
	
		case '-':
			res=x-y;
			cout<<"Difference : "<<res;
		break;
		
		case '*':
			res=x*y;
			cout<<"Product : "<<res;
		break;
		
		case '/':
			res=x/y;
			cout<<"Division : "<<res;
		break;
		
		default:
			cout<<"Wrong Input !!";
		break;
	}
	return 0;
}
