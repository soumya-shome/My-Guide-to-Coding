#include<stdio.h>
#include<conio.h>

main()
{
	char x[30],i,j,c=0;
	printf("Enter a sentence: \n");
	gets(x);
	for(i=0;x[i]!='\0';i++)
	{
		c++;
	}
	printf("The initials of the sentence: \n");
		printf("%c",x[0]);
	for(j=0;j<c;j++)
	{
		if(x[j]==' ')
		{
				printf(".%c.",x[j+1]);	
		}
		
	}

}
