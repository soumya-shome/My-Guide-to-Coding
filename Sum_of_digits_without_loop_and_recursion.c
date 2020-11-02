#include<stdio.h>
void main(){
    int x;
    printf("Enter a number");
    scanf("%d",&x);
    if(x==0)
        printf("%d",0);
    else if(x%9==0)
        printf("%d",9);
    else
        printf("%d",x%9);
}