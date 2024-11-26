#include<stdio.h>
void main(){
    double k,c=0.0;
    printf("Enter Temperature (in Kelvin) : ");
    scanf("%lf",&k);
    c=k-273.15;
    printf("Temperature in Celcius : %0.2f",c);
}