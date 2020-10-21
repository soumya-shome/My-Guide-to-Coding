#include<stdio.h>
#include<math.h>
void main(){
    int a,b,c;
    double s,t,area;
    printf("Enter 1st Side : ");
    scanf("%d",&a);
    printf("Enter 2nd Side : ");
    scanf("%d",&b);
    printf("Enter 3rd Side : ");
    scanf("%d",&c);
    s=(a+b+c)/2;
    t=s*(s-a)*(s-b)*(s-c);
    area=sqrt(t);
    printf("Area : %0.2f",area);
}