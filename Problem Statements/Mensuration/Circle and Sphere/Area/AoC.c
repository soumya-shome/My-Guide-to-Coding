//Area of a Circle
#include<stdio.h>
#include<math.h>

#define Pi 3.14

void main(){
    int r;
    float area=0.0;
    printf("Enter the Radius : ");
    scanf("%d",&r);
    area = Pi *pow(r,2);
    printf("Area : %0.4f",area);
}