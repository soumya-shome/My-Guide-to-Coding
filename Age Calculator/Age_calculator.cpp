#include<iostream>
using namespace std;

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
   cout<<"Present Age Years: "<<f_y<<" Months: "<<f_m<<" Days: "<<f_d;
}

void main() {
   int p_d,p_m,p_y , b_d , b_m , b_y ;
   cout<<"Enter present date : ";
   cin>>p_d;
   cout<<"Enter present month : ";
   cin>>p_m;
   cout<<"Enter present year : ";
   cin>>p_y;
   cout<<"Enter birth date : ";
   cin>>b_d;
   cout<<"Enter birth month : ";
   cin>>b_m;
   cout<<"Enter birth year : ";
   cin>>b_y;
   cout<<"Present date : "<<p_d<<"."<<p_m<<"."<<p_y<<endl;
   printf("Birth date : "<<b_d<<"."<<b_m<<"."<<b_y);
   age(p_d, p_m, p_y, b_d, b_m, b_y);
}