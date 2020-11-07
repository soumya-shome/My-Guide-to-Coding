#include<stdio.h>
#include<string.h>
void main()
{
	char a[100],b[50],maxl[50],minl[50];
	int l,i,j,l2,q=0,max=0,min=50;
	printf("Enter a sentence - ");
	gets(a);
	strcat(a," ");
	l=strlen(a);
	for(i=0;i<l;i++)
	{
		if(a[i]!=' ')
		{
			b[q]=a[i];
			q++;
		}
		else
		{
			q=0;
			l2=strlen(b);
			if(max<l2)
			{
				max=l2;
				for(j=0;j<50;j++)
					maxl[j]='\0';
				strcpy(maxl,b);
			}
			else if(min>l2)
			{
				min=l2;
				for(j=0;j<50;j++)
					minl[j]='\0';
				strcpy(minl,b);
			}
			for(j=0;j<50;j++)
				b[j]='\0';
		}
	}
	printf("Smallest word = ");
	puts(minl);
	printf("Largest word = ");
	puts(maxl);
}
