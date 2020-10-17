#include<stdio.h>
void main(){
    int prin,time,rate;
    double in=0.0,amt=0.0;
    printf("Enter the Principal : ");
    scanf("%d",&prin);
    printf("Enter the Rate of Interest : ");
    scanf("%d",&rate);
    printf("Enter the Time : ");
    scanf("%d",&time);
    in=(prin*time*rate)/100;
    amt=prin+in;
    printf("Interest : %0.2f\n",in);
    printf("Amount : %0.2f",amt);
}