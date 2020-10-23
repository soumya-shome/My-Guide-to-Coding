#include<stdio.h>
#include<math.h>
void main(){
    int a,b,c,h;
    double s,t,vol;
    printf("Enter 1st Side : ");
    scanf("%d",&a);
    printf("Enter 2nd Side : ");
    scanf("%d",&b);
    printf("Enter 3rd Side : ");
    scanf("%d",&c);
    printf("Enter Height : ");
    scanf("%d",&h);
    s=(a+b+c)/2;
    t=s*(s-a)*(s-b)*(s-c);
    vol=h*sqrt(t);
    printf("Volume : %0.2f",vol);
}