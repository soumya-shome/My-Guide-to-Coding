#include<math.h>
int armstrong(int n){
    int n2=n,t=0,y,s=0;
    while(n2!=0){
        t++;
        n2=n2/10;
    }
    n2=n;
    while(n2!=0){
        y=n2%10;
        s=s+pow(y,t);
        n2=n2/10;
    }
    if(n==s)
        return 1;
    else
        return 0;
}

void main(){
    int n,i;
    printf("Enter the number of terms : ");
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        if(armstrong(153)==1)
            printf("%d , ",i);
    }
}
