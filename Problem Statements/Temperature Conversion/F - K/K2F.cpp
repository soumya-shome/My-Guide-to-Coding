#include<iostream>
using namespace std;
void main(){
    double k,f=0.0;
    cout<<"Enter Temperature (in Kelvin) : ";
    cin>>k;
    f=(k - 273.15) * 9/5 + 32 ;
    cout<<"Temperature in Fahrenheit : "<<f;
}