#include<stdio.h>
void main(){
    double c,f=0.0;
    printf("Enter Temperature (in Celcius) : ");
    scanf("%lf",&c);
    f=((c/5.0)*9)+32.0;
    printf("Temperature in Fahrenheit : %0.2f",f);
}