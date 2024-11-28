#include<stdio.h>
#include<stdlib.h>
#include<math.h>
float f (float x){
    return (sqrt(x));
}
void main(){
    int i,n;
    float a,b,h,s,x,y[20],s1=0,s2=0,s3=0,s4=0;
    printf("Enter the lower limit: ");
    scanf("%f",&a);
    printf("Enter the upper limit: ");
    scanf("%f",&b);
    printf("Enter the number of subintervals: ");
    scanf("%f",&n);
    h=(b-a)/n;
    x=a;
    for(i=0;i<=n;i++){
        y[i]=f(x);
        x=x+h;
    }
    for(i=0;i<=n;i++){
        printf("%f,",y[i]);
    }
    printf("\n");
    for(i=0;i<=n-6;i+=6){
        s1=s1+y[i+2]+y[i+4];
        s2=s2+y[i+1]+y[i+5];
        s3=s3+y[i+3];
    }
    for(i=0;i<=n-12;i+=6)
        s4=s4+y[i+6];
    s=(3*h/10)*(y[0]+y[n]+s1+5*s2+6*s3+2*s4);
    printf("The result is %6.6f",s);

}