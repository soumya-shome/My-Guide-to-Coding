#include<stdio.h>
main(){
	char q[50],len=0,i,j,c=0,k=65;
	printf("Enter a string in UpperCASE: \n");
	gets(q);
	for(i=0;q[i]!='\0';i++)	{
		len++;
	}
	printf("OUTPUT: \n");
	for(j=0;j<=len;j++){
		for(k=65;k<=90;k++){
			if(q[j]==(char)k){
				c++;	
				printf("%c =  ",(char)k);		
			}
		}
		if(c>0){
				printf("%d \n",c);
				c=0;
		}
	}
}

