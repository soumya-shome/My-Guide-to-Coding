void main(){
    int n,i,j,f,s=0,a=3;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        f=1;
        for(j=1;j<=a;j++){
            f=f*j;
        }
        a+=2;
        s=s+f;
    }
    printf("%d",s);
}
