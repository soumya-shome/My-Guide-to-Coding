#include<stdio.h>
void main(){
    int a[10],i,max,min;
    printf("Enter 10 numbers : ");
    for(i=0;i<10;i++)
        scanf("%d",&a[i]);
    min=a[0];
    max=a[0];
    for(i=0;i<10;i++){
        if(a[i]>max)
            max=a[i];
        if(a[i]<min)
            min=a[i];
    }
    printf("Maximum in Array : %d",max);
    printf("\nMinimum in Array : %d",min);
}