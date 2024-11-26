//Circumference of a Circle
#include<iostream>
#include<math.h>
using namespace std;
#define Pi 3.14

void main(){
    int r;
    float circum=0.0;
    cout<<"Enter the Radius : ";
    cin>>r;
    circum = 2*Pi*r;
    cout<<"Circumference : "<<circum;
}