#include<stdio.h>
void decToHexa(int n) 
{ 
	char hexaDeciNum[100]; 
	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    int i = 0; 
	while(n!=0) 
	{
		int temp = n % 16; 
        hexaDeciNum[i] = hex[temp]; 
		i++; 	
		n = n/16; 
	} 
	for(int j=i-1; j>=0; j--) 
		printf("%c",hexaDeciNum[j]); 
}  
void main() 
{ 
    int n;
	printf("Enter a decimal number : ");
    scanf("%d",&n);
	printf("%d in decimal = ",n);
    decToHexa(n);
    printf(" in hexadecimal"); 
}