//Circumference of a Circle
#include<stdio.h>
#include<math.h>

#define Pi 3.14

void main(){
    int r;
    float circum=0.0;
    printf("Enter the Radius : ");
    scanf("%d",&r);
    circum = 2*Pi*r;
    printf("Circumference : %0.4f",circum);
}