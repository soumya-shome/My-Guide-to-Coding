#include <stdio.h>
void main(){
    int n = 0,i,j;
    printf("Enter number of lines: ");
    scanf("%d",&n);
    for (i=0;i<n;i++){
        for (j=0;j<n;j++){
            printf("*");
        }
        printf("\n");
    }
}