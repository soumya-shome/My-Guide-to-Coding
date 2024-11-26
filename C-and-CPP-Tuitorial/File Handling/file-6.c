#include<stdio.h>
void main()
{
	FILE *fp;
	char ch;
	int s=1;
	fp=fopen("File7.txt","r");
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
		}
		printf("Number of words = %d\n",s);
	}
	fclose(fp);
	
}
