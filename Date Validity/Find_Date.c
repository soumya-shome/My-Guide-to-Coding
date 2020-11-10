#include<stdio.h>
int calc(int d,int m,int y){
    int yc=0,day=0;
    int mc[]={0,3,3,6,1,4,6,2,5,0,3,5};
    if(y>=1600 && y<=1699)
        yc=6;
    else if(y>=1700 && y<=1799)
        yc=4;
    else if(y>=1800 && y<=1899)
        yc=2;
    else if(y>=1900 && y<=1999)
        yc=0;
    else if(y>=2000 && y<=2099)
        yc=6;
    
    day=d+mc[m-1]+(y%100)+((y%100)/4)+yc;
    day=day%7;
    return day;
}
void main(){
    int day,d,m,y;
    printf("Enter in numbers\n");
    printf("Enter Date : ");
    scanf("%d",&d);
    printf("Enter Month : ");
    scanf("%d",&m);
    printf("Enter Year : ");
    scanf("%d",&y);
    printf("Date : %d-%d-%d\n",d,m,y);
    day=calc(d,m,y);
    printf("The Day is :");
    switch(day){
        case 0:
            printf("Sunday");
        break;
        case 1:
            printf("Monday");
        break;
        case 2:
            printf("Tuesday");
        break;
        case 3:
            printf("Wednesday");
        break;
        case 4:
            printf("Thursday");
        break;
        case 5:
            printf("Friday");
        break;
        case 6:
            printf("Saturday");
        break;
    }
}