#include<stdio.h>
void main(){
    int a,b,c,peri;
    printf("Enter 1st Side : ");
    scanf("%d",&a);
    printf("Enter 2nd Side : ");
    scanf("%d",&b);
    printf("Enter 3rd Side : ");
    scanf("%d",&c);
    peri=a+b+c;
    printf("Perimeter : %d",peri);
}