#include<stdio.h>
void main(){
    double k,f=0.0;
    printf("Enter Temperature (in Kelvin) : ");
    scanf("%lf",&k);
    f=(k - 273.15) * 9/5 + 32 ;
    printf("Temperature in Fahrenheit : %0.2f",f);
}