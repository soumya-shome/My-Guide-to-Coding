void main(){
    int f=0,i=0,size=0,l;
    char str[100],*ptr;
    printf("Enter a word : ");
    gets(str);
    ptr=str;
    while(str[i]!='\0'){
        size++;
        i++;
    }
    for(i=0;i<(size/2);i++){
        if(str[size-1-i]!=*(ptr+i)){
            f=1;
            break;
        }
    }
    if(f==1)
        printf("\n Not a Pallindrome");
    else
        printf("\n Pallindrome");
}
