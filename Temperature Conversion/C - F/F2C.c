#include<stdio.h>
void main(){
    double c,f=0.0;
    printf("Enter Temperature (in Fahrenheit) : ");
    scanf("%lf",&f);
    c=(f-32)*5/9;
    printf("Temperature in Celcius : %0.2f",c);
}