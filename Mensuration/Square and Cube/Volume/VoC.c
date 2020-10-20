//Volume of a Sphere
#include<stdio.h>
#include<math.h>
void main(){
    int s;
    int vol=0;
    printf("Enter the Side : ");
    scanf("%d",&s);
    vol = pow(s,3);
    printf("Volume : %d",vol);
}