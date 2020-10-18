#include<stdio.h>
void main(){
    double k,f=0.0;
    printf("Enter Temperature (in Fahrenheit) : ");
    scanf("%lf",&f);
    k=((f-32)*5/9)+273.15;
    printf("Temperature in Kelvin : %0.2f",k);
}