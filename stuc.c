#include<stdio.h>
struct student
{
	char branch[50];
	char name[50];
	int roll;
	int marks[8];
};
main()
{
	student stu[5];
	int i,j;
	for(i=0;i<30;i++)
	{
		printf("Enter the name of Student%d ",i);
		fgets(stu[i].name,50,stdin);

		printf("Enter the the branch");
		fgets(stu[i].branch,50,stdin);

		printf("Enter the Roll number ");
		scanf("%d",&stu[i].roll);

		for(j=0;j<8;j++)
		{
			printf("Enter the marks of Subject%d",j);
			scanf("%d",&stu[i].marks[j]);
		}
	}
}
