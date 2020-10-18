#include<stdio.h>
void main(){
    double c,k=0.0;
    printf("Enter Temperature (in Celcius) : ");
    scanf("%lf",&c);
    k=c+273.15;
    printf("Temperature in Kelvin : %0.2f",k);
}