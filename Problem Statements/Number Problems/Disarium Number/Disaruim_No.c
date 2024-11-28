#include<math.h>
void main(){
    int n,n2,s=0,t,a=0,a2;
    printf("Enter a number : ");
    scanf("%d",&n);
    n2=n;
    while(n2!=0){
        a++;
        n2=n2/10;
    }
    n2=n;
    a2=a;
    while(a2!=-1){
        t=n2%10;
        s=s+pow(t,a2--);
        n2=n2/10;
    }
    if(s==n)
        printf("Disarium number");
    else
        printf("Not a Disarium number");
}
