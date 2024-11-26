void main(){
    int n,n2,t,p=1,s=0;
    printf("Enter a number : ");
    scanf("%d",&n);
    n2=n;
    while(n2!=0){
        t=n2%10;
        p=p*t;
        s=s+t;
        n2=n2/10;
    }
    if(p==s)
        printf("Spy Number");
    else
        printf("Not a Spy Number");
}
