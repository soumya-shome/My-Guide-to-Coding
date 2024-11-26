#include<iostream>
using namespace std;
void main(){
    int prin,time,rate;
    double in=0.0,amt=0.0;
    cout<<"Enter the Principal : ";
    cin>>prin;
    cout<<"Enter the Rate of Interest : ";
    cin>>rate;
    cout<<"Enter the Time : ";
    cin>>time;
    in=(prin*time*rate)/100;
    amt=prin+in;
    cout<<"Interest : "<<in<<endl;
    cout<<"Amount : "<<amt;
}