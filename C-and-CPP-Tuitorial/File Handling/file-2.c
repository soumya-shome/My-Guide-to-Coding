#include<stdio.h>
int main()
{
	FILE *fs,*ft;
	char ch;
	fs=fopen("File2.txt","r");
	fs=fopen("File3.txt","w");
	while(1)
	{
		ch=fgetc(fs);
		if(ch==EOF)
			break;
		else
			fputc(ch,ft);
	}
	fclose(fs);
	fclose(ft);
}
