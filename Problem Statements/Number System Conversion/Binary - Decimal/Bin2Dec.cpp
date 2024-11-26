#include<math.h>
#include <iostream>
using namespace std;
int convert(int n);
main() {
    int n;
    cout<<"Enter a binary number: ";
    cin>>n;
    cout<<n<<" in binary = "<<convert(n)<<" in decimal";
}

int convert(int n) {
    int dec = 0, i = 0, rem;
    while (n != 0) {
        rem = n % 10;
        n /= 10;
        dec += rem * pow(2, i);
        ++i;
    }
    return dec;
}