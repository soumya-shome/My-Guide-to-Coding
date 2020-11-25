#include<stdio.h>
void main(){
    int y,m;
    char mo[50];
    printf("Enter Year : ");
    scanf("%d",&y);
    printf("Enter Month (In Number):");
    scanf("%d",&m);
    switch(m){
        case 1:
            mo="January";
        break;
        case 2:
            mo="February";
        break;
        case 3:
            mo="March";
        break;
        case 4:
            mo="April";
        break;
        case 5:
            mo="May";
        break;
        case 6:
            mo="June";
        break;
        case 7:
            mo="July";
        break;
        case 8:
            mo="August";
        break;
        case 9:
            mo="September";
        break;
        case 10:
            mo="October";
        break;
        case 11:
            mo="November";
        break;
        case 12:
            mo="December";
        break;
    }
}