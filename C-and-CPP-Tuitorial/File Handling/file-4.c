#include<stdio.h>
void main()
{
	FILE *fp;
	char ch;
	int t=0;
	fp=fopen("File5.txt","r");
		if(fp==NULL)
		printf("Unable to open file");
	else
	{
		while(1)
		{
			ch=fgetc(fp);
			if(ch==EOF)
				break;
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
				t++;
		}
	}
	fclose(fp);
	printf("Number of vowels = %d",t);
}
