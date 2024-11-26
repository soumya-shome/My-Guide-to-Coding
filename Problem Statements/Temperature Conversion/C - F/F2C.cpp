#include<iostream>
using namespace std;
void main(){
    double c,f=0.0;
    cout<<"Enter Temperature (in Fahrenheit) : ";
    cin>>f;
    c=(f-32)*5/9;
    cout<<"Temperature in Celcius : "<<c;
}