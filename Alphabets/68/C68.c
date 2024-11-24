#include<stdio.h>
void main(){
    int a=65,i,j;
    for (i=1;i<=4;i++){
        for(j=1;j<=i;j++){
            printf("%c ",a);
            a++;
        }
        printf("\n");
    }
}
