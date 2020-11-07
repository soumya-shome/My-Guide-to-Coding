void main(){
    int max=0,i,pos=0,l=0;
    char *str;
    printf("Enter a word : ");
    gets(str);
    for(i=0;str[i]!='\0';i++){
        if(l==max){
            pos=i-max;
        }
        if(str[i]==' '){
            l=0;
        }else{
            l++;
        }
        if(l>max){
            max=l;
        }
    }
    printf("\nMax : %d",max);
    for(i=1;i<=max;i++,pos++){
        printf("%c",str[pos]);
    }

}
