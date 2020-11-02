#include<stdio.h>
void main(){
    char a[100],b[100];
    int i,l,n=0,f=2,p;
    printf("Enter a word :");
    gets(a);
    for(l=0;a[l]!='\0';l++);
	a[++l]='\0';
	for(int i=0;i<l;i++){
        if(a[i]==' ' ||a[i]=='!' ||a[i]=='.' ||a[i]=='?')
		{
			n++;
		}       
    }
    printf("%d",n);
}