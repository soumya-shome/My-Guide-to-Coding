#include<stdio.h>
void main(){
    char a[100],b[100];
    int i,j,f=2,p;
    printf("Enter a word :");
    gets(a);
    printf("Enter a substring to find : ");
    gets(b);
    for(i=0;a[i]!='\0';i++){
        if(a[i]==b[0]){
            p=i+1;
            for(j=0;b[j]!='\0';j++){    
                if(a[j+i]!=b[j]){
                    f=1;
                    break;
                }
            }
            if(f!=1)
                f=0;
        }
        if(f!=2)
            break;        
    }
    if(f==0)
        printf("Substring found at position %d",p);
    else
        printf("not Found");
}