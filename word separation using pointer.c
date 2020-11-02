void main(){
    int max=0,t=0,i=0,size=0,l;
    char str[1000],*ptr,*word;
    printf("Enter a word : ");
    gets(str);
    ptr=&str;
    while(str[size]!='\0'){
        size++;
    }
    str[size]=' ';
    str[size+1]='\0';
    size++;
    for(i=0;i<size;i++){
        if(str[i]!=' '){
            *(word+t)=str[i];
            t++;
        }
        else{
            *(word+t)='\0';
            puts(word);
            t=0;

        }
    }

}
