#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter 1st number : ");
    scanf("%d",&a);
    printf("Enter 2nd number : ");
    scanf("%d",&b);
    c=a;
    a=b;
    b=c;
    printf("1st number : %d\n",a);
    printf("2nd number : %d",b);
}