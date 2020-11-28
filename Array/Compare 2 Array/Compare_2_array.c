#include<stdio.h>
void main(){
    int a[5],b[5];
    int i,f=0;
    printf("Enter 5 number for 1st array : ");
    for (i=0;i<5;i++)
        scanf("%d",&a[i]);
    printf("Enter 5 number for 2nd array : ");
    for (i=0;i<5;i++)
        scanf("%d",&b[i]);
    printf("1st Array : ");
    for (i=0;i<5;i++)
        printf("%d ",a[i]);
    printf("\n2nd Array : ");
    for (i=0;i<5;i++)
        printf("%d ",b[i]);
    for(i=0;i<5;i++)
        if(a[i]!=b[i]){
            f=1;
            break;
        }
    if(f==0)
        printf("\nBoth the array are same.");
    else
        printf("\nBoth the array are different.");   
}