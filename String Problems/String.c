#include<stdio.h>
#include<conio.h>

main()
{
	char s[50];char y[50];
	int i,j,c=0;
	printf("Enter a Sentence: \n");
	gets(s);
	for(i=0;s[i]!='\0';i++)
	{
		c++;
	}
	printf("The new String is: \n");
	for(j=0;j<c;j++)
	{
		if(s[j]==' ')
		{
			c++;
			printf("%s.",s[j]);
		}
		
		if(c=1)
		{
			for(j++;s[j]!=' ';j++)
			{
				printf(" ");	
			}
		}
	}
}

