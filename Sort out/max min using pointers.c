void max_min(int *ptr,int size){
    int i,max=*ptr,min=*ptr;
    for (i=0;i<size;i++){
        if(max<*(ptr+i))
            max=*(ptr+i);
        if(min>*(ptr+i))
            min=*(ptr+i);
    }
    printf("\nMaximum number = %d",max);
    printf("\nMinimum number = %d",min);
}

void main(){
    int i,size,a[100];
    printf("Enter the numbmer of terms : ");
    scanf("%d",&size);
    printf("Enter the numbers : ");
    for (i=0;i<size;i++)
        scanf("%d",&a[i]);

    max_min(a,size);
}
