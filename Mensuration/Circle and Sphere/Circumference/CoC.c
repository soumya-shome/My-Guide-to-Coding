//Circumference of a Circle
#include<stdio.h>
#include<math.h>
void main(){
    int r;
    float circum=0.0;
    printf("Enter the Radius : ");
    scanf("%d",&r);
    circum = 2*M_PI*r;
    printf("Circumference : %0.4f",circum);
}