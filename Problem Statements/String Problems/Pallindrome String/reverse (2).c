#include<stdio.h>
#include<string.h>
main()
{
	char a[50],b[50];
	int l,i,c=0,f=0;
	printf("Enter a word");
	gets(a);
	l=strlen(a);
	for(i=l-1;i>=0;i--)
	{
		b[c]=a[i];
		c++;
	}
	for(i=0;i<l;i++)
	{
		if(a[i]!=b[i])
		{
			f++;
			break;
		}
	}
	if(f==1)
		printf("not pallindrome");
	else
		printf("pallindrome");
}
