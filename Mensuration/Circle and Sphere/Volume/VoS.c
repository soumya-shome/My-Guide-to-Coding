//Volume of a Sphere
#include<stdio.h>
#include<math.h>

#define Pi 3.14

void main(){
    int r;
    float vol=0.0;
    printf("Enter the Radius : ");
    scanf("%d",&r);
    vol = (4/3)*Pi*pow(r,3);
    printf("Volume : %0.4f",vol);
}
