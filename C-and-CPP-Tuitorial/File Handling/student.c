#include<stdio.h>
#include<conio.h>
struct
{
	char name[30];
	char stdno[7];
}student[30];

main()
{
	FILE*in;
	
	in=fopen("stud.txt","r+");
	
	if(in==NULL)
	{
		perror("cant open");
	}
	else{
	while(!feof(in))
	{
		fscanf(in,"%s,%s",student[0].name,student[0].stdno);
	}
	fclose(in);
}
printf("%s,%s",student[0].name,student[0].stdno);

getch();
return 0;

}
