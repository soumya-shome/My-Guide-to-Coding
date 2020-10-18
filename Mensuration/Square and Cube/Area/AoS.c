//Area of a Circle
#include<stdio.h>
#include<math.h>
void main(){
    int r;
    float area=0.0;
    printf("Enter the Radius : ");
    scanf("%d",&r);
    area = M_PI*pow(r,2);
    printf("Area : %0.4f",area);
}
