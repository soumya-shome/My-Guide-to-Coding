#include<iostream>
using namespace std;

void age(int s_d, int s_m, int s_y, int f_d, int f_m, int f_y) {
   int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   if (f_d > s_d) {
      s_d = s_d + month[f_m - 1];
      s_m = s_m - 1;
   }
   if (f_m > s_m) {
      s_y = s_y - 1;
      s_m = s_m + 12;
   }
   int d_d = s_d - f_d;
   int d_m = s_m - f_m;
   int d_y = s_y - f_y;
   cout<<"Difference: Years: "<<d_y<<" Months: "<<d_m<<" Days: "<<d_d;
}

int main(){
   int f_d,f_m,f_y , s_d,s_m,s_y ;
   cout<<"Date Difference :From 1st Date to 2nd Date\n";
   cout<<"Enter 1st Date : ";
   cin>>f_d;
   cout<<"Enter 1st Month : ";
   cin>>f_m;
   cout<<"Enter 1st Year : ";
   cin>>f_y;
   cout<<"Enter 2nd Date : ";
   cin>>s_d;
   cout<<"Enter 2nd Month : ";
   cin>>s_m;
   cout<<"Enter 2nd Year : ";
   cin>>s_y;
   cout<<"1st Date : "<<f_d<<"."<<f_m<<"."<<f_y<<endl;
   cout<<"2nd Date : "<<s_d<<"."<<s_m<<"."<<s_y<<endl;
   age(s_d,s_m,s_y, f_d, f_m,f_y);
   return 0;
}