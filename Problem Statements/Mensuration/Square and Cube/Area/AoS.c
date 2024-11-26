//Area of a Square
#include<stdio.h>
#include<math.h>
void main(){
    int s;
    int area=0;
    printf("Enter the Side : ");
    scanf("%d",&s);
    area = pow(s,2);
    printf("Area : %d",area);
}
