#include<stdio.h>
main()
{
	char a[50];
	int i,b=0;
	printf("Enter a sentence");
	gets(a);
	for(i=0;a[i]!=0;i++)
	{
		if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u')
		{
			b++;
		}
	}
	printf("the number of vowels are = %d",b);
}
