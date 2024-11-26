#include <stdio.h>
#include<stdbool.h>
bool isPrime(int n){
	int f=0,i;
	for (i=2;i<n;i++){
		if(n%i==0){
			f=1;
			break;
		}
	}
	if(f==1)
		return false;
	else
		return true;
}

void main(){
	int n[10],i,j;
	printf("Enter 10 numbers : ");
	for(i=0;i<10;i++)
		scanf("%d",&n[i]);
	printf("Prime Numbers : ");
	for(j=0;j<10;j++){
		if(isPrime(n[j]))
			printf("%d, ",n[j]);
	}
}
