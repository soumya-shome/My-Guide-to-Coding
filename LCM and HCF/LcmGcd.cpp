#include<iostream>
using namespace std;
void main()
{
    int n1, n2, gcd, lcm, rem, num, den;
    cout<<"Enter 1st number : ";
    cin>>n1;
    cout<<"Enter 2nd number : ";
    cin>>n2;
    num = n2;
    den = n1;
    rem = num % den;
    while (rem != 0){
        num   = den;
        den = rem;
        rem   = num % den;
    }
    gcd = den;
    lcm = n1 * n2 / gcd;
    cout<<"GCD of "<<n1<<" and "<<n2<<" : "<<gcd<<endl;
    cout<<"LCM of "<<n1<<" and "<<n2<<" : "<<lcm;
}