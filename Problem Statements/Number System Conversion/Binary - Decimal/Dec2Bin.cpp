#include<iostream>
using namespace std;
int convert(int n);
main() {
    int n;
    cout<<"Enter a decimal number: ";
    cin>>n;
    cout<<n<<" in decimal = "<<convert(n)<<" in binary";
    return 0;
}

int convert(int n) {
    int bin = 0;
    int rem, i = 1;
    while (n != 0) {
        rem = n % 2;
        n /= 2;
        bin += rem * i;
        i *= 10;
    }
    return bin;
}