//Volume of a Sphere
#include<iostream>
#include<math.h>
using namespace std;
#define Pi 3.14

void main(){
    int r;
    float vol=0.0;
    cout<<"Enter the Radius : ";
    cin>>r;
    vol = (4/3)*Pi*pow(r,3);
    cout<<"Volume : "<<vol;
}
