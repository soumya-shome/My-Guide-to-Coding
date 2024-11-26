#include<stdio.h>
int main()
{
	FILE *fp;
	char input[25];
	fp=fopen("File.txt","w");
	if(fp==NULL)
		printf("Unanle to open file");
	else
	{
		printf("Enter a string");
		gets(input);
		fputs(input,fp);
		printf("Data has written to the file");
	}
	fclose(fp);
}
