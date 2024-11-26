//Volume of a Sphere
#include<iostream>
#include<math.h>
using namespace std;
void main(){
    int s;
    int vol=0;
    cout<<"Enter the Side : ";
    cin>>s;
    vol = pow(s,3);
    cout<<"Volume : "<<vol;
}