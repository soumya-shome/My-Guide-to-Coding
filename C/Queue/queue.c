#include<stdio.h>
#include<stdlib.h>

int queue1[5];
int rear=-1,front=-1;
void insert(int x)
{
	if(rear >  4)
	{
		printf("queue over flow");
		front=rear=-1;
		return;
	}
	queue1[++rear]=x;
	printf("inserted %d",x);
}

void delet()
{
	if(front==rear)
	{
		printf("queue under flow");
		return;
	}
	printf("deleted %d",queue1[++front]);
}
void display()
{
	int i;
	if(rear==front)
	{
	printf(" queue empty");
	return;
	}
	for(i=front+1;i<=rear;i++)
		printf("%d ",queue1[i]);
}
 
main()
{
	int ch;
	while(1)
	{
		printf("\n1.insert  2.delet  3.display  4.exit\nEnter ur choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:    
				printf("enter the element");
				scanf("%d",&ch);
				insert(ch);
			break;
			case 2:
				delet();
			break;
			case 3:
				display();
			break;
			case 4:
				exit(0);
		}
	}
return (0);
}

