//Area of a Circle
#include<iostream>
#include<math.h>
using namespace std;
#define Pi 3.14

void main(){
    int r;
    float area=0.0;
    cout<<"Enter the Radius : ";
    cin>>r;
    area = Pi *pow(r,2);
    cout<<"Area : "<<area;
}