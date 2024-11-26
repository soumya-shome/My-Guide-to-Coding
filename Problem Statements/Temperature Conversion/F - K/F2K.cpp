#include<iostream>
using namespace std;
void main(){
    double k,f=0.0;
    cout<<"Enter Temperature (in Fahrenheit) : ";
    cin>>f;
    k=((f-32)*5/9)+273.15;
    cout<<"Temperature in Kelvin : "<<k;
}