#include<stdio.h>
void main()
{
	FILE *fp;
	char ch;
	int s=0,c=0;
	fp=fopen("File6.txt","r");
	if(fp==NULL)
		printf("Unable to open file");
	else
	{
		while(1)
		{
			ch=fgetc(fp);
			if(ch==EOF)
				break;
			if(ch==' ')
				s++;
			else if(isalpha(ch))
				c++;
		}
		printf("Number of spaces = %d\n",s);
		printf("Number of alphabets = %d\n",c);
	}
	fclose(fp);
	
}
