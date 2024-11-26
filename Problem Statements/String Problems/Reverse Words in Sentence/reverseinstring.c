#include<stdio.h>
#include<string.h>
main()
{
	char a[100],s[100],c;
	int l,i,j,b=0;
	printf("Enter a sentence ");
	gets(a);
	for(l=0;a[l]!='\0';l++);
	a[l]=' ';
	l++;
	for(i=0;i<l;i++)
	{
		c=a[i];
		if(c!=' ')
		{
			s[b]=c;
			b++;
		}
		else
		{
			for(j=b-1;j>=0;j--)
			{
				printf("%c",s[j]);
			}
			printf(" ");
			b=0;
			for(j=0;j<=100;j++)
			{
				s[j]='\0';
			}
		}
	}
}
