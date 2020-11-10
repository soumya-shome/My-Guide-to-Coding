#include<stdio.h>
#include<conio.h>

struct student 
{
	int roll;
	char name[30];
	float marks;
};

main()
{
	int i;
	struct student e[5];
	
	for(i=0;i<5;i++)
	{
		e[i].roll=i+1;
		
		printf("For Roll number  %d \n",e[i].roll);
		
		printf("Enter name of the student: \n");
		scanf("%s",e[i].name);
		
		printf("Enter marks:\n");
		scanf("%f",&e[i].marks);
}
	printf("   STUDENT INFORMATION  \n");
	for(i=0;i<5;i++)
	{

		
		printf("\n Roll number:  %d \n",i+1);
		printf("\n");
		printf(" Name:");
		puts(e[i].name);
		printf("\n");
		printf("\n Marks:  %f",e[i].marks);
	}
}
