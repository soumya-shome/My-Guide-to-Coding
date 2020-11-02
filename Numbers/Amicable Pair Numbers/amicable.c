void main(){
    int f=0,n1,n2,i,s=0;
    printf("Enter a number : ");
    scanf("%d",&n1);
    printf("Enter 2nd number : ");
    scanf("%d",&n2);
    for(i=1;i<n1;i++){
        if(n1%i==0)
            s=s+i;
    }
    if(s==n1){
        s=0;
        for(i=1;i<n2;i++){
            if(n2%i==0){
                s=s+i;
            }
        }
        if(s==n2)
            f=1;
    }
    if(f==1)
        printf("Amicable Pair");
    else
        printf("Not Amicable Pair");
}
