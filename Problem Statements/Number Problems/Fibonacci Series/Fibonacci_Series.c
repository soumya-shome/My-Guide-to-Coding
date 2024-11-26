void main(){
    int n,a=0,b=1,c,i,f=0;
    printf("Enter a number : ");
    scanf("%d",&n);
    c=a+b;
    if(n==a){
        f=1;
    }else if(n==b){
        f=1;
    }
    for(i=2;c<n;i++){
        c=a+b;
        if(c==n){
          f=1;
          break;
        }
        a=b;
        b=c;
    }
    if(f==1)
        printf("Found");
    else
        printf("Not Found");
}
