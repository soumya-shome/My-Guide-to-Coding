#include<iostream>
#include<Math.h>
using namespace std;
main()
{
  int a,b,c;
  cout<<"Enter the value of a b and c in the ax2+bx+c=0 \n";
  cout<<"a= ";
  cin>>a;
  cout<<"b= ";
  cin>>b;
  cout<<"c= ";
  cin>>c;
  double m,n;
  double t=pow(b,2)-4*a*c;
  m=(-b+t)/2*a;
  n=(-b-t)/2*a;
  cout<<"The two roots are \n";
  cout<<m<<" & "<<n<<endl;
}

