#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter 1st Number : ");
    scanf("%d",&a);
    printf("Enter 2nd Number : ");
    scanf("%d",&b);
    printf("Enter 3rd Number : ");
    scanf("%d",&c);
    if(a!=b && b!=c && a!=c){
        if(a>b && a>c){
            printf("%d is the Greatest Number ",a);
        }else if(b>a && b>c){
            printf("%d is the Greatest Number ",b);
        }else{
            printf("%d is the Greatest Number ",c);
        }
    }else{
        printf("Try with 3 different Numbers");
    }
}