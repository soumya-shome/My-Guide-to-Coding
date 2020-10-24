#include<stdio.h>
void main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    if(n>=0){
        printf("%d is a Positive number",n);
    }else{
        printf("%d is a Negative number",n);
    }
}