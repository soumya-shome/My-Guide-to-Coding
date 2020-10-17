//Perimeter of a Rectangle
#include<stdio.h>
void main(){
    int l,b,peri;
    printf("Enter the Length : ");
    scanf("%d",&l);
    printf("Enter the Breadth : ");
    scanf("%d",&b);
    peri=2*(l+b);
    printf("Perimeter : %d",peri);
}