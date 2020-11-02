#include<stdio.h>
#include<string.h>
#include<ctype.h>
main()
{
	char a[100],d[50];
	int l,i,j,b=0,l2,k;
	char c;
	printf("Enter a Sentence ");
	gets(a);
	l=strlen(a);
	a[l+1]=' ';
	l++;
	a[l+2]='\0';
	l++;
	puts(a);
	for(i=0;i<l;i++)
	{
		c=a[i];
		if(c!=' ')
		{
			d[b]=a[i];
			b++;
		}
		else
		{
			
			d[0]=toupper(d[0]);
			l2=strlen(d);
			d[l2-1]=toupper(d[l2-1]);
			for(k=0;k<l2;k++)
			{
				printf("%c",d[k]);
			}
			printf(" ");
			for(j=0;j<50;j++)
			{
				d[j]='\0';
			}	
			b=0;
			l2=0;
		}
	}
}
