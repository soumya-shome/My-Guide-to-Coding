//Basic Calculation of 2 digits
#include<stdio.h>
void main(){
    int n1,n2,sum=0,diff=0,pro=0,rem=0;
    double quo=0.0;
    printf("Enter 1st number : ");
    scanf("%d",&n1);
    printf("Enter 2nd number : ");
    scanf("%d",&n2);
    sum=n1+n2;
    diff=n1-n2;
    pro=n1*n2;
    quo=n1/n2;
    rem=n1%n2;
    printf("Summation : %d",sum);
    printf("Difference : %d",diff);
    printf("Product : %d",pro);
    printf("Quotient : %d",quo);
    printf("Reminder : %d",rem);
}