#include<stdlib.h>
#include<stdio.h>
void main(){
    int num;
    FILE *fptr;

    fptr=fopen("program.txt","r");
    if(fptr==NULL){
        printf("Error ! ");
        exit(1);
    }
    fscanf(fptr,"%d",&num);

    printf("Value of n = %d",num);
    fclose(fptr);
}
