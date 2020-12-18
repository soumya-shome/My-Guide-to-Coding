#include<iostream>
using namespace std;
int binAddition(int a,int b){
      int c;
      while (b != 0) {
              c = (a & b) << 1;
              a=a^b;
              b=c;
      }
      return a;
}
int binSubtracton(int a, int b){
      int carry;
      b = binAddition(~b, 1);
      while (b != 0) {
              carry = (a & b) << 1;
              a = a ^ b;
              b = carry;
      }
      return a;
}
void main(){
	  int number1,number2,binSub;

	  cout<<"Input first integer value: ";
	  cin>>number1;
	
	  cout<<"Input second integer value: ";
	  cin>>number2;
	  binSub=binSubtracton(number1,number2);

	  cout<<"Binary Subtraction: "<<binSub;
}