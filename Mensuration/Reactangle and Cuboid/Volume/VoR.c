//Volume of a Cuboid
#include<stdio.h>
#include<math.h>
void main(){
    int l,b,h,vol;
    printf("Enter the Length : ");
    scanf("%d",&l);
    printf("Enter the Breadth : ");
    scanf("%d",&b);
    printf("Enter the Height : ");
    scanf("%d",&h);
    vol = l*b*h;
    printf("Volume : %d",vol);
}