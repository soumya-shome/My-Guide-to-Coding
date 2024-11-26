#include<iostream>
#include<math.h>
using naamespace std;
void main(){
    int a,b,c;
    double s,t,area;
    cout<<"Enter 1st Side : ";
    cin>>a;
    cout<<"Enter 2nd Side : ";
    cin>>b;
    cout<<"Enter 3rd Side : ";
    cin>>c;
    s=(a+b+c)/2;
    t=s*(s-a)*(s-b)*(s-c);
    area=sqrt(t);
    cout<<"Area : "<<area;
}