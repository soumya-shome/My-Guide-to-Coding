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
   printf("Difference: Years: %d Months: %d Days: %d", f_y, f_m, f_d);
}

void main() {
   int f_d,f_m,f_y , s_d,s_m,s_y ;
   printf("Date Difference :From 1st Date to 2nd Date\n");
   printf("Enter present date : ");
   scanf("%d",&f_d);
   printf("Enter present month : ");
   scanf("%d",&f_m);
   printf("Enter present year : ");
   scanf("%d",&f_y);
   printf("Enter birth date : ");
   scanf("%d",&s_d);
   printf("Enter birth month : ");
   scanf("%d",&s_m);
   printf("Enter birth year : ");
   scanf("%d",&s_y);
   printf("1st Date : %d.%d.%d\n",f_d,f_m,f_y);
   printf("2nd Date : %d.%d.%d\n",s_d,s_m,s_y);
   age(s_d,s_m,s_y, f_d,f_m,f_y);
}