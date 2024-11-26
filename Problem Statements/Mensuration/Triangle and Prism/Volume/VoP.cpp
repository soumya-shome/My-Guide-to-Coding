#include<iostream>
#include<math.h>
using naamespace std;
void main(){
    int a,b,c,h;
    double s,t,vol;
    cout<<"Enter 1st Side : ";
    cin>>a;
    cout<<"Enter 2nd Side : ";
    cin>>b;
    cout<<"Enter 3rd Side : ";
    cin>>c;
    cout<<"Enter Height : ";
    cin>>h;
    s=(a+b+c)/2;
    t=s*(s-a)*(s-b)*(s-c);
    vol=h*sqrt(t);
    cout<<"Volume : "<<vol;
}