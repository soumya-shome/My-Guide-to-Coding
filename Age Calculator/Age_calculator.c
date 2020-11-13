#include <stdio.h>
#include <stdlib.h>
// function to calculate current age
void age(int p_d, int p_m, int p_y, int b_d, int b_m, int b_y) {
   int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   if (b_d > p_d) {
      p_d = p_d + month[b_m - 1];
      p_m = p_m - 1;
   }
   if (b_m > p_m) {
      p_y = p_y - 1;
      p_m = p_m + 12;
   }
   int f_d = p_d - b_d;
   int f_m = p_m - b_m;
   int f_y = p_y - b_y;
   printf("Present Age Years: %d Months: %d Days: %d", f_y, f_m, f_d);
}

void main() {
   int p_d,p_m,p_y , b_d , b_m , b_y ;
   printf("Enter present date : ");
   scanf("%d",&p_d);
   printf("Enter present month : ");
   scanf("%d",&p_m);
   printf("Enter present year : ");
   scanf("%d",&p_y);
   printf("Enter birth date : ");
   scanf("%d",&b_d);
   printf("Enter birth month : ");
   scanf("%d",&b_m);
   printf("Enter birth year : ");
   scanf("%d",&b_y);
   printf("Present date : %d.%d.%d\n",p_d,p_m,p_y);
   printf("Birth date : %d.%d.%d\n",b_d,b_m,b_y);
   age(p_d, p_m, p_y, b_d, b_m, b_y);
}