#include<iostream>
using namespace std;
void main(){
    int a,b,lcm=1,gcd=1,i;
    cout<<"Enter the 1st number : ";
    cin>>a;
    cout<<"Enter the 2nd number : ";
    cin>>b;
    for(i=1;i<a*b;i++){
        if(a%i==0 && b%i==0)
            gcd=i;
    }
    lcm=(a*b)/gcd;
    cout<<"L.C.M. = "<<lcm<<endl;
    cout<<"G.C.D.= "<<gcd;
}
