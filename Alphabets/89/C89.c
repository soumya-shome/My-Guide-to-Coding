#include<stdio.h>
void main(){
    int b=65,i,j;
    for (i=4;i>=1;i--){
        for(j=1;j<=i;j++){
            printf("%c ",b);
        }
        b+=2;
        printf("\n");
    }
}
