void main(){
    int n,i,sum=0;
    int *arr;
    printf("Enter the no of elements: ");
    scanf("%d",&n);

    arr=(int*)malloc(n*sizeof(int));

    printf("Enter the elements : ");
    for(i=0;i<n;i++){
        scanf("%d",(arr+i));
    }
    for(i=0;i<n;i++){
        sum=sum+*(arr+i);
    }
    printf("The Sum is %d ",sum);

    free(arr);
}
