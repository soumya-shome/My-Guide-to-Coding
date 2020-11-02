#include<stdio.h>
#include<conio.h>
#include<math.h>

main()
{
	int i,j,c=0,t;
	char x[50];
	printf("Enter a sentence: \n");
	gets(x);
	for(i=0;x[i]!='\0';i++)
	{
		c++;
	}
	

		for(j=65;j<=90;j++)
		{
			t=0;
				for(i=0;i<c;i++)
			{
			     if(x[i]==(char)j)
			  {
			     	t++;
			  }
			  
		}
		  if(t!=0)
			  printf("%c=%d\n",(char)j,t);
	}
}


	   	
			
	

