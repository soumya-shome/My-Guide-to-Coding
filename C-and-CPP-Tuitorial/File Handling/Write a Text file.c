#include<stdlib.h>
#include<stdio.h>
void main(){
    int num;
    FILE *fptr;

    fptr=fopen("program.txt","w");
    if(fptr==NULL){
        printf("Error ! ");
        exit(1);
    }
    printf("Enter number : ");
    scanf("%d",&num);

    fprintf(fptr,"%d",num);
    fclose(fptr);
}
