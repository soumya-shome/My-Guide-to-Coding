#include<stdio.h>
#include<stdlib.h>
    int stk[5];
    int top=-1;
    void push(int x)
    {
        if(top >  4)
        {
            printf("stack over flow");
            return;
        }
        stk[++top]=x;
    printf("inserted %d",x);
    }
    void pop()
    {
        if(top <0)
        {
        	printf("stack under flow");
            return;
        }
        printf("deleted-%d",stk[top--]);
    }
    void display()
    {
    	int i;
        if(top<0)
        {
            printf(" stack empty");
            return;
        }
        for(i=top;i>=0;i--)
        	printf("%d ",stk[i]);
    }
main()
{
    int ch;
    while(1)
    {
    	printf("\n1.push  2.pop  3.display  4.exit\nEnter ur choice");
    	scanf("%d",&ch);
        switch(ch)
        {
            case 1:  
				printf("enter the element");
                scanf("%d",&ch);
                push(ch);
            break;
            case 2:
				pop();  
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


