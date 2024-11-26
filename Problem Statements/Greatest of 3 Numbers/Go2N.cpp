#include<iostream>
using namespace std;
void main(){
    int a,b,c;
    cout<<"Enter 1st Number : ";
    cin>>a;
    cout<<"Enter 2nd Number : ";
    cin>>b;
    cout<<"Enter 3rd Number : ";
    cin>>c;
    if(a!=b && b!=c && a!=c){
        if(a>b && a>c){
            cout<<a<<" is the Greatest Number ";
        }else if(b>a && b>c){
            cout<<b<<" is the Greatest Number ";
        }else{
            cout<<c<<" is the Greatest Number ";
        }
    }else{
        cout<<"Try with 3 different Numbers";
    }
}