#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#define MAX 20

char stack_arr[MAX];
int top=-1,n,i;

void push(char item);
void pop();

void main()
{
char str[20];

printf("Enter the string: ");
gets(str);

n=strlen(str);

for(i=0;i<n;i++)
{
char ch=str[i];

push(ch);
}

for(i=0;i<n;i++)
pop();
}

void push(char item)
{
if(top==MAX-1)
printf("Stack Overflow...");
else
{
top++;
stack_arr[top]=item;
}

}

void pop()
{
if(top==-1)
printf("Stack Underflow... \n");
else
{
char c=stack_arr[top];
top--;
printf("%c",c);
}
}
