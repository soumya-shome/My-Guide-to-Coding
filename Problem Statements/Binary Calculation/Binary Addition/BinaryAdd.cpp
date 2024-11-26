#include<iostream>
using namespace std;
void main()
{
    int n1,n2, binAdd;
    cout<<"Input first integer value: ";
    cin>>n1;
    cout<<"Input second integer value: ";
    cin>>n2;
    int c;
    while (n2 != 0) {
        c = (n1 & n2) << 1;
        n1=n1^n2;
        n2=c;
    }
    binAdd=n1;
    cout<<"Binary Addition: "<<binAdd;
}