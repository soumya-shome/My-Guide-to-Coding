#include<stdio.h>
void main(){
    int a,b,lcm=1,gcd=1,i;
    printf("Enter the 1st number : ");
    scanf("%d",&a);
    printf("Enter the 2nd number : ");
    scanf("%d",&b);
    for(i=1;i<a*b;i++){
        if(a%i==0 && b%i==0)
            gcd=i;
    }
    lcm=(a*b)/gcd;
    printf("L.C.M. = %d\n",lcm);
    printf("G.C.D. = %d",gcd);
}
