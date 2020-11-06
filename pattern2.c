void main(){
    int a=65,b=65,i,j;
    for (i=1;i<=4;i++){
        for(j=1;j<=i;j++){
            printf("%c ",a);
            a++;
        }
        printf("\n");
    }
    printf("\n");
    for (i=4;i>=1;i--){
        for(j=1;j<=i;j++){
            printf("%c ",b);
        }
        b+=2;
        printf("\n");
    }
    printf("\n");
    for (i=5;i>=1;i-=2){
        for(j=1;j<=i;j++){
            printf("# ");
        }
        printf("\n");
    }
}
