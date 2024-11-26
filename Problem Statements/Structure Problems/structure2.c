#include<stdio.h>
struct cricket
{
	char pname[50];
	char tname[50];
	int b_average;
};
main()
{
	struct cricket cri[50];
	int i,max_a=0,max=0;
	for(i=0;i<50;i++)
	{
		printf("Enter the name of the Player %d ",i+1);
		fgets(cri[i].pname,50,stdin);
		printf("Enter Team name ");
		fgets(cri[i].tname,50,stdin);
		printf("Enter the batting Average ");
		scanf("%d",&cri[i].b_average);
	}
	for(i=0;i<50;i++)
	{
		if(max<cri[i].b_average)
		{
			max=cri[i].b_average;
			max_a=i;
		}
	}
	printf("Highest Batting Average\n");
	printf("Player name = %s",cri[max_a].pname);
	printf("Team = %s",cri[max_a].tname);
}
