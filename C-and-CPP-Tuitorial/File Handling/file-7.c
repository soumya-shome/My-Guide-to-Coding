#include<stdio.h>
void main()
{
	FILE *fp;
	char c[100],ch;
	int u=0,t=0,o=0,l;
	printf("Enter a word to be searched ");
	gets(c);
	l=strlen(c);
	fp=fopen("File8.txt","r");
	if(fp==NULL)
	{
		printf("Not Found");
	}
	else
	{
		while(1)
		{
			ch=fgetc(fp);
			if(ch==EOF)
				break;
			if(ch==c[o])
			{
				t=1;
				o++;
				if(l==o)
				{
					break;
				}
			}
			else
			{
				if(l==o)
				{
					break;
				}
				else{
					o=0;
					t=0;
				}
			}
		}
		puts(c);
	}
	fclose(fp);
	if(t==1)
	{
		printf("Found");
	}
	else
	{
		printf("Not Found");
	}
	
}
