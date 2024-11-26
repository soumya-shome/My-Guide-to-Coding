//Basic Calculation of 2 digits
#include<iostream>
using namespace std;
void main(){
    int n1,n2,sum=0,diff=0,pro=0,rem=0;
    double quo=0.0;
    cout<<"Enter 1st number : ";
    cin>>n1;
    cout<<"Enter 2nd number : ";
    cin>>n2;
    sum=n1+n2;
    diff=n1-n2;
    pro=n1*n2;
    quo=n1/n2;
    rem=n1%n2;
    cout<<"Summation : "<<sum;
    cout<<"Difference : "<<diff;
    cout<<"Product : "<<pro;
    cout<<"Quotient : "<<quo;
    cout<<"Reminder : "<<rem;
}