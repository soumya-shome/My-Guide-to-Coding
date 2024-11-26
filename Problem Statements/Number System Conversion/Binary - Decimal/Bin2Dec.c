#include<math.h>
#include <stdio.h>
int convert(int n);
int main() {
    int n;
    printf("Enter a binary number: ");
    scanf("%d", &n);
    printf("%d in binary = %d in decimal", n, convert(n));
    return 0;
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