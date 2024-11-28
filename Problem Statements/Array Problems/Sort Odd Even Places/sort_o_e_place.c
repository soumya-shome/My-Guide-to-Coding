#include<stdio.h>
#include<stdlib.h>
void funcswap(int *a,int s){
    int i,y,t;
    for(i=0;i<s;i+=2){
 	    t=i+1;
        if(t<s){
            y=*(a+i);
 		    *(a+i)=*(a+t);
 		    *(a+t)=y;
        }
	}
 }
void main(){
    int *arr,n,i;
    printf("Enter the number of elements: " );
    scanf("%d",&n);
    arr=(int*)malloc(n*sizeof(int));
    printf("Enter the elements : ");
    for(i=0;i<n;i++){
        scanf("%d",(arr+i));
    }
    funcswap(arr,n);
    for(i=0;i<n;i++){
        printf("%d, ",*(arr+i));
    }
    free(arr);
}