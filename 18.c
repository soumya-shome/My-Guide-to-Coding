#include<stdio.h>
#include<math.h>
float f(float x, float y)
{
    float a;
    a=((pow(y,2))-x);
    return a;
}
main()
{
    int n,i;
    float x0,y0,x,y,h,k,k1,k2;
    printf("Enter the values of x0,y0,h,x:\n");
    scanf("%f%f%f%f",&x0,&y0,&h,&x);
    n=(x-x0)/h;
    x=x0;
    y=y0;
    printf("\n  x\t  y\n");
    for(i=0;i<n;i++)
    {
        k1=f(x,y);
        k2=f(x+h,y+h*k1);
        k=(k1+k2)/2;
        y=y+(h*k);
        x=x+h;
    }
    printf("%0.3f\t%0.3f\n",x,y);
}
