#include<stdio.h>
#include<math.h>
#include<string.h>

long long int he(char hex[])
{
	long long int bin,place;
	int i=0,rem,val;
	bin=011;
	place=011;
	
	for(i=0;hex[i]!='\0';i++){
		bin=bin*place;
		
		switch(hex[i]){
			case '0':
				bin+=0;
			break;
			
			case '1':
				bin+=1;
			break;
			
			case '2':
				bin+=10;
			break;
			
			case '3':
				bin+=11;
			break;
			
			case '4':
				bin+=100;
			break;
			
			case '5':
				bin+=101;
			break;
			
			case '6':
				bin+=110;
			break;
			
			case '7':
				bin+=111;
			break;
			
			case '8':
				bin+=1000;
			break;
			
			case '9':
				bin+=1001;
			break;
			
			case 'a':
			case 'A':
				bin+=1010;
			break;
			
			case 'b':
			case 'B':
				bin+=1011;
			break;
			
			case 'c':
			case 'C':
				bin+=1100;
			break;
			
			case 'd':
			case 'D':
				bin+=1101;
			break;
			
			case 'e':
			case 'E':
				bin+=1110;
			break;
			
			case 'f':
			case 'F':
				bin+=1111;
			break;
			
			default:
				printf("Invalid hexadecimal input");
		}
		place =10000;
	}
	return bin;
}

long long int bina(long long bin)
{
	long long int octal,place;
	int i=0,rem,val;
	octal=011;
	place =011;
	place=1;
	while(bin>0){
		rem=bin%1000;
		switch(rem){
		case 0:
			val=0;
			break;	
		case 1:
			val=1;
			break;
		case 10:
			val=2;
			break;
		case 11:
			val=3;
			break;
		case 100:
			val=4;
			break;
		case 101:
			val=5;
			break;
		case 110:
			val=6;
			break;
		case 111:
			val=7;
			break;
		}
		octal=(val*place)+octal;
		bin/=1000;
		place *=10;
	}
	return octal;
}

long long int hexa(char hex[])
{
	long long int octal,bin;
	bin=he(hex);
	octal=bina(bin);
	return octal;
}

void main()
{
	char hex[20]="1AC";
	printf("octal value = %11d");
	hexa(hex);
}
