#include<iostream>
using namespace std;
void main(){
    double c,f=0.0;
    cout<<"Enter Temperature (in Celcius) : ";
    cin>>c;
    f=((c/5.0)*9)+32.0;
    cout<<"Temperature in Fahrenheit : "<<f;
}