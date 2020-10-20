#include<iostream>
using namespace std;
void main(){
    int a,b,c;
    cout<<"Enter 1st number : ";
    cin>>a;
    cout<<"Enter 2nd number : ";
    cin>>b;
    c=a;
    a=b;
    b=c;
    cout<<"1st number : "<<a<<endl;
    cout<<"2nd number : "<<b;
}